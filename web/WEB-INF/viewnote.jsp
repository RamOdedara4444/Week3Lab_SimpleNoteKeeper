<%-- 
    Document   : viewnote
    Created on : Sep 20, 2019, 3:12:12 PM
    Author     : 798125
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note keeper</title>
    </head>
    <body>
        <h1>Simple Note keeper!</h1>
        
        <h3>View Note!</h3>
        
        <b>Title:</b>${note.title}<br>
        <b>Contents:</b> ${note.content}<br>
        <a href="note?edit"> Edit </a>
    </body>
</html>
