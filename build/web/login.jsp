<%-- 
    Document   : login
    Created on : 30 Nov, 2022, 12:05:17 PM
    Author     : sanja
--%>

<%@page import="connection.Login"%>
<%@page import="connection.Connect" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <%
            String uname = request.getParameter("username");
            String password = request.getParameter("password");
            
            Login log = new Login();
            String val = log.loginSuccess(uname, password);
            
            if(val == "Success"){
                //request.setAttribute("ins", uname);
                //response.sendRedirect("viewData.jsp");
//                request.setAttribute("id", uname);
//                RequestDispatcher rd = request.getRequestDispatcher("viewData.jsp");
//                rd.forward(request, response);
                  HttpSession s = request.getSession();
                  s.setAttribute("id", uname);
                  response.sendRedirect("viewData.jsp");
            }
            %>
            
    </body>
</html>
