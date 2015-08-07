<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<title>Cadastro</title>
</head>
<body>
	<form action="<c:url value='/Teste/Cadastro' />" method="post">
		Nome: <input type="text" name="estudo.nome" required /><br /> Descrição: <input
			type="checkbox" name="estudo.finalizado" /><br /> <input
			type="submit" value="Salvar" />
	</form>
</body>
</html>