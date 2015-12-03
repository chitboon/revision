<%--
  Created by IntelliJ IDEA.
  User: chitboon
  Date: 12/3/15
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quote</title>
</head>
<%@ page import="demo.*" %>
<%
  Quote q = (Quote)request.getAttribute("quote");
  if (q== null) {
    QuoteDAO dao = new QuoteDAO();
    q = dao.getQuote();
  }
%>
<body>
<strong><%= q.getQuote() %></strong> by <strong><%= q.getAuthor() %></strong> contributed by <strong><%= q.getContributor()%></strong>
</body>
</html>
