<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Teste</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container" style="text-align:right">
		<form class="form-signin" action="/Estudo/logout" method="post">
			<button class="btn btn-primary btn-lg" type="submit">Logout</button>
		</form>
	</div>

	<div class="container">
	<h1>Lista de cadastrados</h1>
		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Status</th>
					<th>Operações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${estudo}" var="teste">
					<tr>
						<td>${teste.id}</td>
						<td>${teste.nome}</td>
						<td>${teste.finalizado}</td>
						<td><a href="<c:url value="/Teste/Delete/${teste.id}"/>">Deletar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div id="mensagem">
		<h3>${mensagem}</h3>
	</div>

</body>
</html>