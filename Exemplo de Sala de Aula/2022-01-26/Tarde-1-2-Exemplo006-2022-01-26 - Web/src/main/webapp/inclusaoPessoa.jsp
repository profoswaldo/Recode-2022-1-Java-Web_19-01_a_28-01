<%@page import="modelos.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Pessoa pessoa = (Pessoa) request.getAttribute("p"); %>
	
	<b>CPF: </b> <%= pessoa.getCpf() %><br/>
	<b>Nome: </b> <%= pessoa.getNome() %><br/>

	Inclusão realizada com sucesso.
	
	<br/><a href="index.jsp">Página Principal</a><br/>
</body>
</html>