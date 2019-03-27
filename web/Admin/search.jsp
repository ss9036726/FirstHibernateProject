<%-- 
    Document   : search
    Created on : Mar 5, 2019, 11:59:07 AM
    Author     : gshub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    <link rel="stylesheet" href="css/search.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <title>Admin-DashBoard</title>
</head>
<%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; %>
<body>
    <div class="container">
                <div class="sidebar">
                    <div>
                        <img src="images/logo.png" alt="Logo" width="200px" height="200px">
                    </div>
                    <ul>
                        <li>
                            <a href="admin.html">
                                <span><i class="fa fa-home"></i></span>
                                <span>HOME</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span><i class="fa fa-user"></i></span>
                                <span>Profile</span>
                            </a>
                        </li>
                        <li>
                            <a href="search.jsp">
                                <span><i class="fa fa-search"></i></span>
                                <span>Search</span>
                            </a>
                        </li>
                        <li>
                            <a href="schedule.jsp">
                                <span><i class="fa fa-clock-o"></i></span>
                                <span>Schedule</span>
                            </a>
                        </li>
                        <li>
                            <a href="view.html">
                                <span><i class="fa fa-eye"></i></span>
                                <span>ViewAll</span>
                            </a>
                        </li>
                        <li class="last">
                            <a href="../Login/login.html">
                                <span><i class="fa fa-sign-out"></i></span>
                                <span>LogOut</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

    <div class="container">
            <div class="jumbotron">
                    <div>
                        <form action="" method="get">
                            <label for="search">
                            <span><i class="fa fa-search"></i></span>
                            </label> 
                            <input class="input" type="text" name="searching" placeholder="Search Here.....">
                        </form>
                            <br> <br>
                            <table class="table table-hover">
                                    <thead>
                                        <th>Bus No.</th>
                                        <th>Pick-Up Place</th>
                                        <th>Arrival Time</th>
                                        <th>Drop Place</th>
                                        <th>Drop Time</th>
                                    </thead>
                                    <%
                                        Configuration cf = new Configuration();
                                        cf.configure("Schedule.cfg.xml");
                                        SessionFactory sf = cf.buildSessionFactory();
                                        session1 = sf.openSession();
                                        String search = request.getParameter("searching");
                                        String data;
                                        if(search != null){
                                            data = "from schedule where busno like '%"+search+"%' or pickuppoint like '%"+search+"%' or droppoint like '%"+search+"%'";
                                        } else {
                                            data = "from schedule";
                                        }
                                        Query qr = session1.createQuery(data);
                                        Iterator it = qr.iterate();
                                        while(it.hasNext()){
                                        schedule s = (schedule)it.next();
                                        busno = s.getBusno();
                                        pickuppoint = s.getPickuppoint();
                                        arrivaltime = s.getArrivaltime();
                                        droppoint = s.getDroppoint();
                                        droptime = s.getDroptime();
                                    %>
                                    <tbody>
                                        <td><%=busno%></td>
                                        <td><%=pickuppoint%></td>
                                        <td><%=arrivaltime%></td>
                                        <td><%=droppoint%></td>
                                        <td><%=droptime%></td>
                                    </tbody>
                                    <%
                                        }
                                       session1.close();
                                    %>
                        </table>
                </div>
            </div>
    </div>

    <!--<script src="lib/search.js"></script>-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
        
    </body>
</html>

