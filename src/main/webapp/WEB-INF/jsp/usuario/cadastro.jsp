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
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<form action="<c:url value='/usuario/cadastro' />" method="post">
			<h1>Cadastro</h1>
			<label>Name:</label> <input type="text" class="form-control"
				name="usuario.nome" autofocus required /><br /> <label>Usuario:</label>:
			<input type="text" class="form-control" name="usuario.usuario"
				required /><br /> <label>Senha:</label> <input type="text"
				class="form-control" name="usuario.senha" required /><br /> <label>Status:</label>
			<input type="checkbox" class="style2" name="usuario.status" /><br />
			<input class="btn btn-primary btn-lg" type="submit" value="Adicionar" />
		</form>
	</div>

</body>
</html>