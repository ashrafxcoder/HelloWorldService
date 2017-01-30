<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Add a new Person</h1>
        
        
        <p>This is a test page</p>

        
        <div style="border: 1px solid black; width: 80%;height: 50%">
            <form method="POST" action="http://localhost:8080/HelloWorldService/api/people">
            <input type="text" name="name"/>
            <input type="text" name="age" />
            <button type="submit" value="Add"/>
        </form>
        </div>
        
        
        
        
        
    </body>
</html>
