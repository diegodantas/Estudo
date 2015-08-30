<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Cadastro</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/signin.css"
	rel="stylesheet">
</head>
<body>
	<div class="container pull-right">
		<form class="form-signin" action="<c:url value='/Teste/Cadastro' />"
			method="post">
			<h1>Cadastro</h1>
			Nome: <input type="text" name="estudo.nome" required /><br />
			Descrição: <input type="checkbox" name="estudo.finalizado" /><br />
			<input class="btn btn-primary btn-lg" type="submit" value="Salvar" />
		</form>
	</div>
</body>
</html>