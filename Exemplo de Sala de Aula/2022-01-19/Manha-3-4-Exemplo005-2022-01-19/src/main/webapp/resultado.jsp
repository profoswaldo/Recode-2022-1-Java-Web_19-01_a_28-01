<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String varNome = (String)request.getAttribute("meuNome");
	%>	
	Meu nome é <% out.println(varNome); %>


</body>
</html>