<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Var scope</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Var scope</h1>
        <br/>
        Request var 
        <br/>
        Base: ${ rectanguloRequest.base }
        Altura: ${ rectanguloRequest.altura }
        Area: ${ rectanguloRequest.area }
        <br/>
        <br/>
        Session var
        <br/>
        Base: ${ rectanguloSession.base }
        Altura: ${ rectanguloSession.altura }
        Area: ${ rectanguloSession.area }
        <br/>
        <br/>
        Application var
        <br/>
        Base: ${ rectanguloApplication.base }
        Altura: ${ rectanguloApplication.altura }
        Area: ${ rectanguloApplication.area }
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Return to homepage</a>
    </body>
</html>