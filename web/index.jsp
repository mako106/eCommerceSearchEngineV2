<%-- 
    Document   : index
    Created on : Nov 12, 2018, 3:21:54 PM
    Author     : chien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    
      
            <form action="LoginServlet" method="POST">
            Username: <input type="text" name="username"/> <br/>
            Password: <input type="text" name="password"/><br/>         
           <input type="submit" value="Login"/>
    </body>
</html>
