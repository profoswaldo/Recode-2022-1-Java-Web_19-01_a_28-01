<%@page import="modelo.negocio.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Aluno aluno = (Aluno) request.getAttribute("al"); %>
	Matricula: <%= aluno.getMatricula() %><br/>
	Nome: <%= aluno.getNome() %>

</body>
</html>