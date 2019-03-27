<%-- 
    Document   : schedule
    Created on : Mar 4, 2019, 2:37:13 PM
    Author     : gshub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    i<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/schedule.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">   
    <title>Admin-DashBoard</title>

</head>

<style>
    .form{
        width:600px;
        margin: 100px auto;
        padding: 10px;
    }
</style>
<%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! int id;String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; %>
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
                <h1>Arriving Time</h1>
                        <table align="center" class="table table-hover" id="table">
                            <form action="../delete.jsp" method="post">
                                <thead>
                                <th>Id</th>
                                <th>Bus No.</th>
                                <th>PickUp Point</th>
                                <th>Arrival Time</th>
                                <th>Drop Point</th>
                                <th>Drop Time</th>
                                <th>Action</th>
                            </thead>
                            <%
                            Configuration cf = new Configuration();
                            cf.configure("Schedule.cfg.xml");
                            SessionFactory sf = cf.buildSessionFactory();
                            session1 = sf.openSession();

                            String sqr = "from schedule";
                            Query qr = session1.createQuery(sqr);
                            Iterator it = qr.iterate();
                            while(it.hasNext()){
                                schedule s = (schedule)it.next();
                                id = s.getId();
                                busno = s.getBusno();
                                pickuppoint = s.getPickuppoint();
                                arrivaltime = s.getArrivaltime();
                                droppoint = s.getDroppoint();
                                droptime = s.getDroptime();
                            %>
                            <tbody>
                                <td><%=id%></td>
                                <td><%=busno%></td>
                                <td><%=pickuppoint%></td>
                                <td><%=arrivaltime%></td>
                                <td><%=droppoint%></td>
                                <td><%=droptime%></td>
                                <td> <a href="../update.jsp?id=<%=id%>&busno=<%=busno%>&pickuppoint=<%=pickuppoint%>&arrivaltime=<%=arrivaltime%>&droppoint=<%=droppoint%>&droptime=<%=droptime%>"  class="btn btn-warning btn-md">Update</a> 
                                    <input type="checkbox" class="form-control" value="<%=id%>" name="c1"></td>
                            </tbody>
                            <%
                            }
                            session1.close();
                            %>
                            <tbody>
                            <td colspan="10" align="center"> <input type="submit" class="btn btn-danger btn-lg btn-block" value="Delete Selected Schedule"> </td>
                            </tbody>
                            <tbody>
                            <td colspan="10" align="center"><a href="../schedule.jsp" class="btn btn-block btn-success btn-lg">Add Schedule</a></td>
                            </tbody>
                            </form>
                        </table>
                        
            </div>
        </div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!--<script src="lib/schedule.js"></script>-->
	<script>
	</script>

</body>

</html>
