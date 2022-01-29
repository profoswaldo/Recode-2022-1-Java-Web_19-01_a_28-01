<%@page import="modelos.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contracheque</title>
</head>
<body>

	<% Funcionario funcionario = (Funcionario) request.getAttribute("refObjFunc");    %>
	
	Matricula: <%= funcionario.getMatricula()%><br/>
	Nome: <%= funcionario.getNome()%><br/>
	Salário Líquido: <%= funcionario.getSalarioLiquido()%><br/>

</body>
</html>