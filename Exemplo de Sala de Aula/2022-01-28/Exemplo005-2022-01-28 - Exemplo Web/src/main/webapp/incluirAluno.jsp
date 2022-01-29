<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="validacao.js"></script>

</head>
<body>

	<%@ include file="cabecalho.jsp" %>
	

	<form name="form1" action="incluir.alunos" method="post">
		Digite a id do aluno: <input type="text" name="txtId"/><br/>
		Digite a matricula do aluno: <input type="text" name="txtMatricula"/><br/>
		Digite o nome do aluno: <input type="text" name="txtNome"/><br/>
		Digite o teste do aluno: <input type="text" name="txtTeste"/><br/>
		Digite a prova do aluno: <input type="text" name="txtProva"/><br/>
		<input type="submit" value="Enviar" onclick="return validar()"/>
		<input type="reset" value="Cancelar"/>
	
	</form>
	
	
	<%@ include file="rodape.jsp" %>
	
	
</body>
</html>