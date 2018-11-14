<%-- 
    Document   : search
    Created on : Nov 12, 2018, 12:09:06 PM
    Author     : chien
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Shopping!!!</title>
    </head>
    <body>
        <h1>Product List</h1>

        <form action="PF">
           <c:out value="${param.msg}"/>
                <input name="name"/>
                <input type="submit"/>
        </form>

    </body>
</html>
