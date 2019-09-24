<%-- 
    Document   : editnote
    Created on : Sep 20, 2019, 3:12:35 PM
    Author     : 798125
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Edit Note!</h1>
    
        <form action="note" method="post">
            Title:-<input type="text" name="title" value="${note.title}"><br><br><br>
            Content:<input type="text"   name="content"   value="${note.content}"></textarea><br>
            
            <input type="submit" value="Save">
        </form>
        
    
    </body>
</html>
