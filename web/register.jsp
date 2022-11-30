<%-- 
    Document   : register
    Created on : 30 Nov, 2022, 12:55:15 PM
    Author     : sanja
--%>
<%@page import="connection.Register"%>
<%@page import="connection.Connect" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <%
        String ins = request.getParameter("insurance");
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String pass = request.getParameter("password");
        String company = request.getParameter("CompanyName");
        String start = request.getParameter("StartDate");
        String end = request.getParameter("EndDate");
        int install = Integer.parseInt(request.getParameter("installment"));
        String result="";
        
        try{
            Register r = new Register();
            result = r.insert(ins, fname, lname, pass, company, start, end, install);
            out.print(result);
        }
        catch(Exception e){
            out.println( e );
            
        }
//        out.println(result);          
       
        %>
        <%=result%>
    </body>
</html>
