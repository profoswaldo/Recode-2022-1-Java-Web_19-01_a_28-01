
<%@page import="modelo.pessoal.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>

	<h1>Recode Pro</h1>
	<h2>Lugar para aprender</h2>
	

	<% Aluno aluno = (Aluno) request.getAttribute("al"); %>
	
	
	ID: <%=  aluno.getId() %><br/>
	Matricula: <%=  aluno.getMatricula() %><br/>
	Nome: <%=  aluno.getNome() %><br/>
	Teste: <%=  aluno.getTeste() %><br/>
	Prova: <%=  aluno.getProva() %><br/>
	Média: <%=  aluno.getMedia() %><br/>

</body>
</html>