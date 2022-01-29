<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String telaNome = (String) request.getAttribute("nome"); %>
	Seja bem-vindo <b>Prof.</b> <i><% out.println(telaNome); %></i>

</body>
</html>