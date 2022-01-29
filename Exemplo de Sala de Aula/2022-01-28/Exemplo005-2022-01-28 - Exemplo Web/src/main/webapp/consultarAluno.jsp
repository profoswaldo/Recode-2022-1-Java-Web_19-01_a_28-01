<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="cabecalho.jsp" %>
	

	<form action="consultar.alunos" method="post">
		Digite a matricula do aluno: <input type="text" name="txtMatricula"/><br/>
		<input type="submit" value="Enviar"/>
		<input type="reset" value="Cancelar"/>
	
	</form>

	<%@ include file="rodape.jsp" %>
	
	
</body>
</html>