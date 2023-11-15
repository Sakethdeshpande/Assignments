<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome! 
<%="welcome "+request.getParameter("uname") %>
	CurrentTime: <%= java.util.Calendar.getInstance().getTime() %>
<form action="search.jsp">
	search <input type="submit" value="go"><br>
</form>
</body>
</html>