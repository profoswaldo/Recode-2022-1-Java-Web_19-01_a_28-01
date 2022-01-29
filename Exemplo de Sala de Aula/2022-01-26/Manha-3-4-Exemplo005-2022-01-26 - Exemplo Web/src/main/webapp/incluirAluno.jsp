<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="meus.alunos" method="post">
		Digite a id do aluno: <input type="text" name="txtId"/><br/>
		Digite a matricula do aluno: <input type="text" name="txtMatricula"/><br/>
		Digite o nome do aluno: <input type="text" name="txtNome"/><br/>
		Digite o teste do aluno: <input type="text" name="txtTeste"/><br/>
		Digite a prova do aluno: <input type="text" name="txtProva"/><br/>
		<input type="submit" value="Enviar"/>
		<input type="reset" value="Cancelar"/>
	
	</form>
	
	
	<br/><a href="index.jsp">Página Principal</a><br/>
	
</body>
</html>