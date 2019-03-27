<%-- 
    Document   : UserAdd
    Created on : Mar 4, 2019, 10:06:29 PM
    Author     : gshub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin-Dashboard</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="Admin/css/admin.css">
    </head>
    <style>
    .form{
        padding: 10px;
        width: 600px;
        margin: 80px auto;
    }
    .form-control{
        margin-top: 10px;
    }
    </style>
    <body>
        <div class="container">
            <div class="sidebar">
                <div>
                    <img src="Admin/images/logo.png" alt="Logo" width="200px" height="200px">
                </div>
                <ul>
                    <li>
                        <a href="Admin/admin.html">
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
                        <a href="Admin/search.html">
                            <span><i class="fa fa-search"></i></span>
                            <span>Search</span>
                        </a>
                    </li>
                    <li>
                        <a href="Admin/schedule.jsp">
                            <span><i class="fa fa-clock-o"></i></span>
                            <span>Schedule</span>
                        </a>
                    </li>
                    <li>
                        <a href="Admin/view.html">
                            <span><i class="fa fa-eye"></i></span>
                            <span>ViewAll</span>
                        </a>
                    </li>
                    <li class="last">
                        <a href="Login/login.html">
                            <span><i class="fa fa-sign-out"></i></span>
                            <span>LogOut</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="container">
            <div class="jumbotron">
                <h1>Add Users</h1>
                <form action="UserAddServlet" class="form">
                    <div class="form-group">
                        <input type="text" name="username" class="form-control" placeholder="Enter Username">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" class="form-control" placeholder="Enter Password">
                    </div>
                    <div class="form-group">
                        <input type="text" name="studentid" class="form-control" placeholder="Enter StudentId">
                    </div>
                    <div class="form-group">
                        <input type="text" name="email" class="form-control" placeholder="Enter Email">
                    </div>
                    <div class="form-group">
                        <input type="text" name="address" class="form-control" placeholder="Enter Address">
                    </div>
                    <div class="form-group">
                        <input type="text" name="mobile" class="form-control" placeholder="Enter Mobile Number">
                    </div>
                    <div class="form-group">
                        <input type="text" name="pincode" class="form-control" placeholder="Enter Pincode">
                    </div>
                    <input type="submit" class="btn btn-primary btn-block btn-lg" value="Add User">
                    <a href="Admin/user.jsp" class="btn btn-success btn-block btn-lg">Display Users</a>
                </form>
                
            </div>
        </div>
    </body>
</html>

