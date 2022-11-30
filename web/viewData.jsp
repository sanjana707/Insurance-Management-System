<%-- 
    Document   : viewData
    Created on : 30 Nov, 2022, 8:48:12 PM
    Author     : sanja
--%>
<%@page import="connection.GetData"%>
<%@page import="connection.Connect" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Data</title>
        <style>  
            body{  
              font-family: Calibri, Helvetica, sans-serif;  
              background-color: whitesmoke;  
            }  
            .container {  
                padding-left: 450px;    
            }  
            hr {  
              border: 1px solid red;  
              margin-bottom: 35px;  
            }   
            label{
                color: black;
                font-size: 20px;
                font-family: Calibri, Helvetica, sans-serif;
            }
            div{
                margin-top: 20px;
            }
</style> 
    </head>
    <body>
        <% 
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
        %>  
        
      <center><h1 style="color:coral;">Insurance Data</h1> </center>  
      <hr>
      <div class="container">    
      <div style="display: flex;">
        <label> Insurance ID:</label>   
        <input style="margin-left: 30px;" type="text" name="Insurance ID" value="<%=id%>" readonly/> 
      </div>  
      <div style="display: flex;">   
        <label>   
        First Name:  
        </label>  
        <input style="margin-left: 30px;" type="text" name="fname" value="<%=fname%>" readonly=""/>
      </div>
      <div style="display: flex;">   
        <label>   
        Last Name:  
        </label>  
        <input style="margin-left: 30px;" type="text" name="fname" value="<%=lname%>" readonly/>
      </div>
      <div style="display:flex;">
        <label>Company Name:</label>    
        <input type="text" name="Company Name" placeholder=""  value="<%=company%>" />
      </div>
      <div style="display:flex">
          <label for="Start Date">Start Date: </label><br>
          <input style="margin-left: 30px;" type="text" id="Start Date" name="Start Date" value="<%=start%>" readonly="">
      </div>
      <div style="display:flex">
          <label for="End Date">End Date: </label><br>
          <input style="margin-left: 30px;" type="text" id="End Date" name="End Date" value="<%=end%>" readonly="">
      </div>
            <div style="display: flex;">
            <label> Installments: </label>   
            <input style="margin-left: 30px;" type="text" name="installments" value="<%=install%>" readonly="" />      
      </div> 
      </div>
    </body>
</html>
