<%-- 
    Document   : user
    Created on : Mar 4, 2019, 9:46:12 PM
    Author     : gshub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User-Dashboard</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/user.css">
    </head>
    <%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
    <%! int id;String username;String password;int studentid;String email;String address;String mobile;int pincode;Session session1 = null;%>
    <body>
        <div class="container">
            <div class="sidebar">
                <div>
                    <img src="images/logo.png" alt="Logo" width="200px" height="200px">
                </div>
                <ul>
                    <li>
                        <a href="user.html">
                            <span><i class="fa fa-home"></i></span>
                            <span>HOME</span>
                        </a>
                    </li>
                    <li>
                        <a href="profile.jsp">
                            <span><i class="fa fa-user"></i></span>
                            <span>Profile</span>
                        </a>
                    </li>
                    <li>
                        <a href="search.html">
                            <span><i class="fa fa-search"></i></span>
                            <span>Search</span>
                        </a>
                    </li>
                    <li>
                        <a href="../schedule.jsp">
                            <span><i class="fa fa-clock-o"></i></span>
                            <span>Schedule</span>
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
                <h1>User Profile</h1>
                <table class="table table-hover">
                    <thead>
                        <th>Username</th>
                        <th>Id</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>MobileNumber</th>
                        <th>PinCode</th>
                    </thead>
                    <%
                    Configuration cf = new Configuration();
                    cf.configure("UserAdd.cfg.xml");
                    SessionFactory sf = cf.buildSessionFactory();
                    session1 = sf.openSession();

                    String sqr = "from UserAdd";
                    Query qr = session1.createQuery(sqr);
                    Iterator it = qr.iterate();
                    while(it.hasNext()){
                        UserAdd u = (UserAdd)it.next();
                        username = u.getUsername();
                        studentid = u.getStudentid();
                        email = u.getEmail();
                        address = u.getAddress();
                        mobile = u.getMobile();
                        pincode = u.getPincode();
                    %>
                    <tbody>
                        <td><%=username%></td>
                        <td><%=studentid%></td>
                        <td><%=email%></td>
                        <td><%=address%></td>
                        <td><%=mobile%></td>
                        <td><%=pincode%></td>
                    </tbody>
                    <%
                    }   
                    session1.close();
                    %>
                </table>
            </div>
        </div>
    </body>
</html>
