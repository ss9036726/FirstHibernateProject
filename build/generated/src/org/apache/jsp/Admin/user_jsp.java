package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int id;String username;String password;int studentid;String email;String address;String mobile;int pincode;Session session1 = null;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin-Dashboard</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"Logo\" width=\"200px\" height=\"200px\">\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"admin.html\">\n");
      out.write("                            <span><i class=\"fa fa-home\"></i></span>\n");
      out.write("                            <span>HOME</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span><i class=\"fa fa-user\"></i></span>\n");
      out.write("                            <span>Profile</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"search.html\">\n");
      out.write("                            <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                            <span>Search</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../schedule.jsp\">\n");
      out.write("                            <span><i class=\"fa fa-clock-o\"></i></span>\n");
      out.write("                            <span>Schedule</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"view.html\">\n");
      out.write("                            <span><i class=\"fa fa-eye\"></i></span>\n");
      out.write("                            <span>ViewAll</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"last\">\n");
      out.write("                        <a href=\"../Login/login.html\">\n");
      out.write("                            <span><i class=\"fa fa-sign-out\"></i></span>\n");
      out.write("                            <span>LogOut</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>All User Details</h1>\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <form action=\"Userdelete.jsp\" method=\"post\">\n");
      out.write("                        <thead>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Username</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>MobileNumber</th>\n");
      out.write("                        <th>PinCode</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </thead>\n");
      out.write("                    ");

                    Configuration cf = new Configuration();
                    cf.configure("UserAdd.cfg.xml");
                    SessionFactory sf = cf.buildSessionFactory();
                    session1 = sf.openSession();

                    String sqr = "from UserAdd";
                    Query qr = session1.createQuery(sqr);
                    Iterator it = qr.iterate();
                    while(it.hasNext()){
                        UserAdd u = (UserAdd)it.next();
                        id = u.getId();
                        username = u.getUsername();
                        password = u.getPassword();
                        studentid = u.getStudentid();
                        email = u.getEmail();
                        address = u.getAddress();
                        mobile = u.getMobile();
                        pincode = u.getPincode();
                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(username);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(password);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(studentid);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(address);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(mobile);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(pincode);
      out.write("</td>\n");
      out.write("                        <td><a href=\"../Userupdate.jsp?id=");
      out.print(id);
      out.write("&username=");
      out.print(username);
      out.write("&password=");
      out.print(password);
      out.write("&studentid=");
      out.print(studentid);
      out.write("&email=");
      out.print(email);
      out.write("&address=");
      out.print(address);
      out.write("&mobile=");
      out.print(mobile);
      out.write("&pincode=");
      out.print(pincode);
      out.write("\"  class=\"btn btn-warning btn-md\">Update</a> \n");
      out.write("                       <input type=\"checkbox\" class=\"form-control\" value=\"");
      out.print(id);
      out.write("\" name=\"c1\"></td>\n");
      out.write("                    </tbody>\n");
      out.write("                    ");

                    }   
                    session1.close();
                    
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                    <td colspan=\"10\" align=\"center\"> <input type=\"submit\" class=\"btn btn-danger btn-lg btn-block\" value=\"Delete Selected Driver\"> </td>\n");
      out.write("                    </tbody>\n");
      out.write("                    <tbody>\n");
      out.write("                    <td colspan=\"10\" align=\"center\"><a href=\"../UserAdd.jsp\" class=\"btn btn-success btn-block btn-lg\">Add Users</a></td>\n");
      out.write("                    </tbody>\n");
      out.write("                    </form>\n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
