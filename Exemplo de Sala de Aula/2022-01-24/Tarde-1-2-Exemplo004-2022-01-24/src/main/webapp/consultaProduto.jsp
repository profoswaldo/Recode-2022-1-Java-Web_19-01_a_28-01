
<%@page import="modelos.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Produto produto = (Produto) request.getAttribute("prod"); %>
	
	Código: <%= produto.getCodigo() %><br/>
	Descrição: <%= produto.getDescricao() %><br/>
	Quantidade em Estoque: <%= produto.getQuant() %><br/>
	Valor Unitário: <%= produto.getPreco() %><br/>

</body>
</html>