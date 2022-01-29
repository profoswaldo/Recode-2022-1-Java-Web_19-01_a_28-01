

<%@page import="modelo.pessoal.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<%@ include file="cabecalho.jsp" %></h2>
	

	<% Aluno aluno = (Aluno) request.getAttribute("al"); %>
	
	
	<table border="2">
		<caption><b>Dados do Aluno:</b></caption>
		<tr>
			<th>ID:</th>
			<td><%= aluno.getId() %></td>
		</tr>
		<tr>
			<th>Matricula:</th>
			<td><%= aluno.getMatricula() %></td>
		</tr>
		<tr>
			<th>Nome:</th>
			<td> <%= aluno.getNome() %></td>
		</tr>
		<tr>
			<th>Teste:</th>
			<td><%= aluno.getTeste() %></td>
		</tr>
		<tr>
			<th>Prova:</th>
			<td><%= aluno.getProva() %></td>
		</tr>
		<tr>
			<th>Média:</th>
			<td><%= aluno.getMedia() %></td>
		</tr>
	
	</table>
	
	<%@ include file="rodape.jsp" %>
	
	

</body>
</html>