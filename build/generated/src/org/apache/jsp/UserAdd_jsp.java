package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <link rel=\"stylesheet\" href=\"Admin/css/admin.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("    .form{\n");
      out.write("        padding: 10px;\n");
      out.write("        width: 600px;\n");
      out.write("        margin: 80px auto;\n");
      out.write("    }\n");
      out.write("    .form-control{\n");
      out.write("        margin-top: 10px;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"Admin/images/logo.png\" alt=\"Logo\" width=\"200px\" height=\"200px\">\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Admin/admin.html\">\n");
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
      out.write("                        <a href=\"Admin/search.html\">\n");
      out.write("                            <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                            <span>Search</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Admin/schedule.jsp\">\n");
      out.write("                            <span><i class=\"fa fa-clock-o\"></i></span>\n");
      out.write("                            <span>Schedule</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Admin/view.html\">\n");
      out.write("                            <span><i class=\"fa fa-eye\"></i></span>\n");
      out.write("                            <span>ViewAll</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"last\">\n");
      out.write("                        <a href=\"Login/login.html\">\n");
      out.write("                            <span><i class=\"fa fa-sign-out\"></i></span>\n");
      out.write("                            <span>LogOut</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Add Users</h1>\n");
      out.write("                <form action=\"UserAddServlet\" class=\"form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Enter Username\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Enter Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"studentid\" class=\"form-control\" placeholder=\"Enter StudentId\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"Enter Email\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"Enter Address\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"mobile\" class=\"form-control\" placeholder=\"Enter Mobile Number\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"pincode\" class=\"form-control\" placeholder=\"Enter Pincode\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary btn-block btn-lg\" value=\"Add User\">\n");
      out.write("                </form>\n");
      out.write("                <a href=\"Admin/user.jsp\" class=\"btn btn-success btn-block btn-lg\">Display Users</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
