<%@page import="modelos.pessoal.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Funcionario funcionario = (Funcionario) request.getAttribute("func"); %>
	
	<b>Matricula: </b> <i> <%= funcionario.getMatricula() %></i><br/>
	<b>Nome: </b> <i> <%= funcionario.getNome() %></i><br/>
	<b>Salário Bruto: </b> <i> <%= funcionario.getSalarioBruto() %></i><br/>
	<b>INSS: </b> <i> <%= funcionario.getInss()%></i><br/>
	<b>Salário Líquido: </b> <i> <%= funcionario.getSalarioLiquido() %></i><br/>

</body>
</html>