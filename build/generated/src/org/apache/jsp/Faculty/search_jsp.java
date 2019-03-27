package org.apache.jsp.Faculty;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String busno;String pickuppoint;String arrivaltime;String droppoint;String droptime;Session session1 = null; 
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" media=\"screen\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/search.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <title>User-DashBoard</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"images/logo.png\" alt=\"Logo\" width=\"200px\" height=\"200px\">\n");
      out.write("                    </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"faculty.html\">\n");
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
      out.write("                        <li class=\"last\">\n");
      out.write("                            <a href=\"Login/login.html\">\n");
      out.write("                                <span><i class=\"fa fa-sign-out\"></i></span>\n");
      out.write("                                <span>LogOut</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"\" method=\"get\">\n");
      out.write("                            <label for=\"search\">\n");
      out.write("                            <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                            </label> \n");
      out.write("                            <input class=\"input\" type=\"text\" name=\"searching\" placeholder=\"Search Here.....\">\n");
      out.write("                        </form>\n");
      out.write("                            <br> <br>\n");
      out.write("                            <table class=\"table table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <th>Bus No.</th>\n");
      out.write("                                        <th>Pick-Up Place</th>\n");
      out.write("                                        <th>Arrival Time</th>\n");
      out.write("                                        <th>Drop Place</th>\n");
      out.write("                                        <th>Drop Time</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    ");

                                        Configuration cf = new Configuration();
                                        cf.configure("Schedule.cfg.xml");
                                        SessionFactory sf = cf.buildSessionFactory();
                                        session1 = sf.openSession();
                                        String search = request.getParameter("searching");
                                        String data;
                                        if(search != null){
                                            data = "from schedule where busno like '%"+search+"%' or pickuppoint like '%"+search+"%' or droppoint like '%"+search+"%'";
                                        } else {
                                            data = "from schedule";
                                        }
                                        Query qr = session1.createQuery(data);
                                        Iterator it = qr.iterate();
                                        while(it.hasNext()){
                                        schedule s = (schedule)it.next();
                                        busno = s.getBusno();
                                        pickuppoint = s.getPickuppoint();
                                        arrivaltime = s.getArrivaltime();
                                        droppoint = s.getDroppoint();
                                        droptime = s.getDroptime();
                                    
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <td>");
      out.print(busno);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(pickuppoint);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(arrivaltime);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(droppoint);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(droptime);
      out.write("</td>\n");
      out.write("                                    </tbody>\n");
      out.write("                                    ");

                                        }
                                       session1.close();
                                    
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--<script src=\"lib/search.js\"></script>-->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("        \n");
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
