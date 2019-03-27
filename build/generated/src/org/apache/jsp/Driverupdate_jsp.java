package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class Driverupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Session session1 = null; 
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Admin/css/admin.css\">\n");
      out.write("    <title>Admin-DashBoard</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write(".form{\n");
      out.write("        padding: 10px;\n");
      out.write("        width: 600px;\n");
      out.write("        margin: 80px auto;\n");
      out.write("    }\n");
      out.write("    .form-control{\n");
      out.write("        margin-top: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <div>\n");
      out.write("                <img src=\"Admin/images/logo.png\" alt=\"Logo\" width=\"200px\" height=\"200px\">\n");
      out.write("            </div>\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Admin/admin.html\">\n");
      out.write("                        <span><i class=\"fa fa-home\"></i></span>\n");
      out.write("                        <span>HOME</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <span><i class=\"fa fa-user\"></i></span>\n");
      out.write("                        <span>Profile</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Admin/search.jsp\">\n");
      out.write("                        <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                        <span>Search</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Admin/schedule.jsp\">\n");
      out.write("                        <span><i class=\"fa fa-clock-o\"></i></span>\n");
      out.write("                        <span>Schedule</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Admin/view.html\">\n");
      out.write("                        <span><i class=\"fa fa-eye\"></i></span>\n");
      out.write("                        <span>ViewAll</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"last\">\n");
      out.write("                    <a href=\"Login/login.html\">\n");
      out.write("                        <span><i class=\"fa fa-sign-out\"></i></span>\n");
      out.write("                        <span>LogOut</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            ");

                String str = request.getParameter("id");
                String driverid = request.getParameter("driverid");
                String drivername = request.getParameter("drivername");
                String busno = request.getParameter("busno");
                String str1 = request.getParameter("routeno");
                String route = request.getParameter("route");
                String sub = request.getParameter("s1");
                if(sub!=null){
                    int id = Integer.parseInt(str);
                    int routeno = Integer.parseInt(str1);
                    try{
                        Configuration cf = new Configuration();
                        cf.configure("Driver.cfg.xml");
                        SessionFactory sf = cf.buildSessionFactory();
                        session1 = sf.openSession();
                        Transaction tx = session1.beginTransaction();
                        Driver d = (Driver)session1.get(Driver.class,id);
                        d.setDriverid(driverid);
                        d.setDrivername(drivername);
                        d.setBusno(busno);
                        d.setRouteno(routeno);
                        d.setRoute(route);
                        session1.update(d);
                        response.sendRedirect("Admin/driver.jsp");
                        tx.commit();
                    } catch(Exception e){
                        System.out.println(e);
                    } finally{
                        session1.close();
                    }
                }
                
      out.write("\n");
      out.write("            <h1>Add Driver</h1>\n");
      out.write("            <form class=\"form\" name=\"f1\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(str);
      out.write("\">\n");
      out.write("                    <input type=\"text\" name=\"driverid\" value=\"");
      out.print(driverid);
      out.write("\" class=\"form-control\" placeholder=\"Enter DriverId\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"drivername\" value=\"");
      out.print(drivername);
      out.write("\" class=\"form-control\" placeholder=\"Enter DriverName\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"busno\" value=\"");
      out.print(busno);
      out.write("\" class=\"form-control\" placeholder=\"Enter BusNo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("                    <input type=\"text\" name=\"str1\" value=\"");
      out.print(str1);
      out.write("\" class=\"form-control\" placeholder=\"Enter RouteNo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"route\" value=\"");
      out.print(route);
      out.write("\" class=\"form-control\" placeholder=\"Enter Route\">\n");
      out.write("                </div>\n");
      out.write("                <input name=\"s1\" type=\"submit\" class=\"btn btn-success btn-lg btn-block\" value=\"Add Driver\">\n");
      out.write("                <a href=\"Admin/driver.jsp\" class=\"btn btn-primary btn-lg btn-block\">Display Driver</a>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
