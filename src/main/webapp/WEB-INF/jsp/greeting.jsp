<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<%! int day = 2; %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Greeting</title>
</head>
<body>
<h1>${message1}</h1>
<h1>${message2}</h1>
<%
    out.println("Your IP address is " + request.getRemoteAddr());
%>
<p>Today's date: <%= (new Date()).toString()%></p>
</body>
</html>