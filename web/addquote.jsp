<%@ page import="demo.User" %>
<%--
  Created by IntelliJ IDEA.
  User: chitboon
  Date: 12/3/15
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Quote</title>
</head>
<%@ page import="java.util.*, demo.*" %>
<%
  User u = (User)session.getAttribute("user");
  if (u == null) response.sendRedirect("login.html");
%>
<body>
Hello <%= u.getName()%> <br>
<form action="controller">
<input type="text" name="quote" placeholder="Enter Quote" /> <br>
<input type="text" name="author" placeholder="Enter author" /> <br>
<input type="submit" value="Add Quote" />
  <input type="hidden"
</form>
</body>
</html>
