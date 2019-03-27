<%-- 
    Document   : driver
    Created on : Mar 4, 2019, 10:44:58 PM
    Author     : gshub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="Admin/css/admin.css">
    <title>Admin-DashBoard</title>
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
            <h1>Add Driver</h1>
            <form action="DriverServlet" class="form">
                <div class="form-group">
                    <input type="text" name="driverid" class="form-control" placeholder="Enter DriverId">
                </div>
                <div class="form-group">
                    <input type="text" name="drivername" class="form-control" placeholder="Enter DriverName">
                </div>
                <div class="form-group">
                    <input type="text" name="busno" class="form-control" placeholder="Enter BusNo">
                </div>
                <div class="form-group">
                    <input type="text" name="routeno" class="form-control" placeholder="Enter RouteNo">
                </div>
                <div class="form-group">
                    <input type="text" name="route" class="form-control" placeholder="Enter Route">
                </div>
                <input type="submit" class="btn btn-success btn-lg btn-block" value="Add Driver"><br>
                <a href="Admin/driver.jsp" class="btn btn-primary btn-lg btn-block">Display Driver</a>
            </form>
            
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
