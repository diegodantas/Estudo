<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Atualizar</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form action="<c:url value='/usuario/cadastro' />" method="post">
			<label>ID:</label> <input type="text" class="form-control"
				name="usuario.id" value="${usuario.id}" readonly /><br /> <label>Name:</label>
			<input type="text" class="form-control" name="usuario.nome"
				value="${usuario.nome}" autofocus required /><br /> <label>Usuario:</label>:
			<input type="text" class="form-control" name="usuario.usuario"
				value="${usuario.usuario}" required /><br /> <label>Senha:</label>
			<input type="text" class="form-control" name="usuario.senha"
				value="${usuario.senha}" required /><br /> <label>Status:</label>
			<input type="checkbox" class="style2" name="usuario.status"
				<c:if test="${usuario.status == true}">checked</c:if> /><br />
			<input class="btn btn-primary btn-lg" type="submit" value="Atualizar" />
		</form>
	</div>
</body>
</html>