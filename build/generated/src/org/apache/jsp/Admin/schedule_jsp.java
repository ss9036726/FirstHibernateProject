package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int id;String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; 
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/schedule.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<title>Admin-DashBoard</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .form{\n");
      out.write("        width:600px;\n");
      out.write("        margin: 100px auto;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"images/logo.png\" alt=\"Logo\" width=\"200px\" height=\"200px\">\n");
      out.write("                    </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"admin.html\">\n");
      out.write("                                <span><i class=\"fa fa-home\"></i></span>\n");
      out.write("                                <span>HOME</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span><i class=\"fa fa-user\"></i></span>\n");
      out.write("                                <span>Profile</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"search.jsp\">\n");
      out.write("                                <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                                <span>Search</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"schedule.jsp\">\n");
      out.write("                                <span><i class=\"fa fa-clock-o\"></i></span>\n");
      out.write("                                <span>Schedule</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"view.html\">\n");
      out.write("                                <span><i class=\"fa fa-eye\"></i></span>\n");
      out.write("                                <span>ViewAll</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"last\">\n");
      out.write("                            <a href=\"../Login/login.html\">\n");
      out.write("                                <span><i class=\"fa fa-sign-out\"></i></span>\n");
      out.write("                                <span>LogOut</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Arriving Time</h1>\n");
      out.write("                        <table align=\"center\" class=\"table table-hover\" id=\"table\">\n");
      out.write("                            <form action=\"../delete.jsp\" method=\"post\">\n");
      out.write("                                <thead>\n");
      out.write("                                <th>Id</th>\n");
      out.write("                                <th>Bus No.</th>\n");
      out.write("                                <th>PickUp Point</th>\n");
      out.write("                                <th>Arrival Time</th>\n");
      out.write("                                <th>Drop Point</th>\n");
      out.write("                                <th>Drop Time</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </thead>\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("                                <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(busno);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pickuppoint);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(arrivaltime);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(droppoint);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(droptime);
      out.write("</td>\n");
      out.write("                                <td> <a href=\"../update.jsp?id=");
      out.print(id);
      out.write("&busno=");
      out.print(busno);
      out.write("&pickuppoint=");
      out.print(pickuppoint);
      out.write("&arrivaltime=");
      out.print(arrivaltime);
      out.write("&droppoint=");
      out.print(droppoint);
      out.write("&droptime=");
      out.print(droptime);
      out.write("\"  class=\"btn btn-warning btn-md\">Update</a> \n");
      out.write("                                    <input type=\"checkbox\" class=\"form-control\" value=\"");
      out.print(id);
      out.write("\" name=\"c1\"></td>\n");
      out.write("                            </tbody>\n");
      out.write("                            ");

                            }
                            session1.close();
                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("                            <td colspan=\"10\" align=\"center\"> <input type=\"submit\" class=\"btn btn-danger btn-lg btn-block\" value=\"Delete Selected Schedule\"> </td>\n");
      out.write("                            </tbody>\n");
      out.write("                            <tbody>\n");
      out.write("                            <td colspan=\"10\" align=\"center\"><a href=\"../schedule.jsp\" class=\"btn btn-block btn-success btn-lg\">Add Schedule</a></td>\n");
      out.write("                            </tbody>\n");
      out.write("                            </form>\n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    <!--<script src=\"lib/schedule.js\"></script>-->\n");
      out.write("\t<script>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
