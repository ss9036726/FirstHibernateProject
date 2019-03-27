<%-- 
    Document   : schedule
    Created on : Mar 4, 2019, 6:22:24 PM
    Author     : gshub
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="Admin/css/schedule.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Schedules</title>

</head>

<style>
    .form{
        width:600px;
        margin: 150px auto;
        padding: 10px;
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
                            <a href="Admin/search.jsp">
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
                <h1>Add Schedule</h1>
                <form action="ScheduleServlet" class="form">
                <div class="form-group">
                    <input type="text" name="busno" class="form-control" placeholder="Enter Your BusNo">
                </div>
                <div class="form-group">
                    <input type="text" name="pickuppoint" class="form-control" placeholder="Enter PickupPoint">
                </div>
                <div class="form-group">
                    <input type="text" name="arrivaltime" class="form-control" placeholder="Enter arrivaltime">
                </div>
                <div class="form-group">
                    <input type="text" name="droppoint" class="form-control" placeholder="Enter Drop point">
                </div>
                <div class="form-group">
                    <input type="text" name="droptime" class="form-control" placeholder="Enter Drop time">
                </div>
                <input type="submit" class="btn btn-block btn-primary btn-lg" value="Add Schedule">
                <a href="Admin/schedule.jsp" class="btn btn-block btn-success btn-lg">Display Schedule</a>
                </form>
            </div>
        </div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!--<script src="lib/schedule.js"></script>-->
	<script>
	</script>

</body>

</html>

