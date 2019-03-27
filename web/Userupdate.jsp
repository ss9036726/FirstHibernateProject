<%-- 
    Document   : Driverupdate
    Created on : Mar 5, 2019, 10:47:01 PM
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
<%@ page import="java.util.*,model.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! Session session1 = null; %>
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
            <%
                String str = request.getParameter("id");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String str1 = request.getParameter("studentid");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String mobile = request.getParameter("mobile");
                String str2 = request.getParameter("pincode");
                String sub = request.getParameter("s1");
                if(sub!=null){
                    int id = Integer.parseInt(str);
                    int studentid = Integer.parseInt(str1);
                    int pincode = Integer.parseInt(str2);
                    try{
                        Configuration cf = new Configuration();
                        cf.configure("UserAdd.cfg.xml");
                        SessionFactory sf = cf.buildSessionFactory();
                        session1 = sf.openSession();
                        Transaction tx = session1.beginTransaction();
                        UserAdd u = (UserAdd)session1.get(UserAdd.class,id);
                        u.setUsername(username);
                        u.setPassword(password);
                        u.setStudentid(studentid);
                        u.setEmail(email);
                        u.setAddress(address);
                        u.setMobile(mobile);
                        u.setPincode(pincode);
                        session1.update(u);
                        response.sendRedirect("Admin/user.jsp");
                        tx.commit();
                    } catch(Exception e){
                        System.out.println(e);
                    } finally{
                        session1.close();
                    }
                }
                %>
            <h1>Add Driver</h1>
            <form class="form" name="f1">
                    <div class="form-group">
                        <input type="hidden" name="id" value="<%=str%>">
                        <input type="text" name="username" value="<%=username%>" class="form-control" placeholder="Enter Username">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" value="<%=password%>" class="form-control" placeholder="Enter Password">
                    </div>
                    <div class="form-group">
                        <input type="text" name="studentid" value="<%=str1%>" class="form-control" placeholder="Enter StudentId">
                    </div>
                    <div class="form-group">
                        <input type="text" name="email" value="<%=email%>" class="form-control" placeholder="Enter Email">
                    </div>
                    <div class="form-group">
                        <input type="text" name="address" value="<%=address%>" class="form-control" placeholder="Enter Address">
                    </div>
                    <div class="form-group">
                        <input type="text" name="mobile" value="<%=mobile%>" class="form-control" placeholder="Enter Mobile Number">
                    </div>
                    <div class="form-group">
                        <input type="text" name="pincode" value="<%=str2%>" class="form-control" placeholder="Enter Pincode">
                    </div>
                    <input name="s1" type="submit" class="btn btn-block btn-primary btn-lg" value="Update User">
                    <a href="Admin/user.jsp" class="btn btn-block btn-success btn-lg">Display All Users</a>
                </form>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>

