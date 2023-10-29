<!DOCTYPE html>
<html lang="en">
    <head>
        <title>MVC Model</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>MVC Model</h1>
        <br/>
        <div style="color: red">${ message }</div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletController">
            Link to Servlet controller without parameters
        </a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletController?action=addVars">
            Link to Servlet controller for add parameters
        </a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletController?action=listVars">
            Link to Servlet controller for list parameters
        </a>
    </body>
</html>