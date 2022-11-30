package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connection.GetData;
import connection.Connect;

public final class viewData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Data</title>\n");
      out.write("        <style>  \n");
      out.write("            body{  \n");
      out.write("              font-family: Calibri, Helvetica, sans-serif;  \n");
      out.write("              background-color: whitesmoke;  \n");
      out.write("            }  \n");
      out.write("            .container {  \n");
      out.write("                padding-left: 450px;    \n");
      out.write("            }  \n");
      out.write("            hr {  \n");
      out.write("              border: 1px solid red;  \n");
      out.write("              margin-bottom: 35px;  \n");
      out.write("            }   \n");
      out.write("            label{\n");
      out.write("                color: black;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-family: Calibri, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("</style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            HttpSession s = request.getSession();
            //String id = request.getParameter("id");
            String id=(String)s.getAttribute("id");
            GetData g = new GetData();
            String[] data = g.getData(id);
            String fname=data[0];
            String lname=data[1];
            String company=data[2];
            String start=data[3];
            String end=data[4];
            String install=data[5];
        
      out.write("  \n");
      out.write("        \n");
      out.write("      <center><h1 style=\"color:coral;\">Insurance Data</h1> </center>  \n");
      out.write("      <hr>\n");
      out.write("      <center>\n");
      out.write("      <div class=\"container\">    \n");
      out.write("      <div style=\"display: flex;\">\n");
      out.write("        <label> Insurance ID:</label>   \n");
      out.write("        <input style=\"margin-left: 30px;\" type=\"text\" name=\"Insurance ID\" value=\"");
      out.print(id);
      out.write("\" readonly/> \n");
      out.write("      </div>  \n");
      out.write("      <div style=\"display: flex;\">   \n");
      out.write("        <label>   \n");
      out.write("        First Name:  \n");
      out.write("        </label>  \n");
      out.write("        <input style=\"margin-left: 30px;\" type=\"text\" name=\"fname\" value=\"");
      out.print(fname);
      out.write("\" readonly=\"\"/>\n");
      out.write("      </div>\n");
      out.write("      <div style=\"display: flex;\">   \n");
      out.write("        <label>   \n");
      out.write("        Last Name:  \n");
      out.write("        </label>  \n");
      out.write("        <input style=\"margin-left: 30px;\" type=\"text\" name=\"fname\" value=\"");
      out.print(lname);
      out.write("\" readonly/>\n");
      out.write("      </div>\n");
      out.write("      <div style=\"display:flex;\">\n");
      out.write("        <label>Company Name:</label>    \n");
      out.write("        <input type=\"text\" name=\"Company Name\" placeholder=\"\"  value=\"");
      out.print(company);
      out.write("\" />\n");
      out.write("      </div>\n");
      out.write("      <div style=\"display:flex\">\n");
      out.write("          <label for=\"Start Date\">Start Date: </label><br>\n");
      out.write("          <input style=\"margin-left: 30px;\" type=\"text\" id=\"Start Date\" name=\"Start Date\" value=\"");
      out.print(start);
      out.write("\" readonly=\"\">\n");
      out.write("      </div>\n");
      out.write("      <div style=\"display:flex\">\n");
      out.write("          <label for=\"End Date\">End Date: </label><br>\n");
      out.write("          <input style=\"margin-left: 30px;\" type=\"text\" id=\"End Date\" name=\"End Date\" value=\"");
      out.print(end);
      out.write("\" readonly=\"\">\n");
      out.write("      </div>\n");
      out.write("            <div style=\"display: flex;\">\n");
      out.write("            <label> Installments: </label>   \n");
      out.write("            <input style=\"margin-left: 30px;\" type=\"text\" name=\"installments\" value=\"");
      out.print(install);
      out.write("\" readonly=\"\" />      \n");
      out.write("      </div> \n");
      out.write("      </div>\n");
      out.write("      </center>\n");
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
