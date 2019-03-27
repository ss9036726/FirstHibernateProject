package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class schedule1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Admin/css/schedule.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<title>Schedules</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .form{\n");
      out.write("        width:600px;\n");
      out.write("        margin: 100px auto;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"Admin/images/logo.png\" alt=\"Logo\" width=\"200px\" height=\"200px\">\n");
      out.write("                    </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"User/user.html\">\n");
      out.write("                                <span><i class=\"fa fa-home\"></i></span>\n");
      out.write("                                <span>HOME</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <span><i class=\"fa fa-user\"></i></span>\n");
      out.write("                                    <span>Profile</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"User/search.html\">\n");
      out.write("                                <span><i class=\"fa fa-search\"></i></span>\n");
      out.write("                                <span>Search</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"User/schedule.jsp\">\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1>Add Schedule</h1>\n");
      out.write("                <form action=\"ScheduleServlet\" class=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"busno\" class=\"form-control\" placeholder=\"Enter Your BusNo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"pickuppoint\" class=\"form-control\" placeholder=\"Enter PickupPoint\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"arrivaltime\" class=\"form-control\" placeholder=\"Enter arrivaltime\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"droppoint\" class=\"form-control\" placeholder=\"Enter Drop point\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"droptime\" class=\"form-control\" placeholder=\"Enter Drop time\">\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-block btn-primary\" value=\"Submit\">\n");
      out.write("                <a href=\"User/schedule.jsp\" class=\"btn btn-block btn-success\">Display Schedule</a>\n");
      out.write("                </form>\n");
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
