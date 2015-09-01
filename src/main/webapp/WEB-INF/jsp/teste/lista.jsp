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

	<div class="container">

		<!-- Static navbar -->
		<nav class="navbar navbar-">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Vraptor4</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="/Estudo/Teste/Listar">Home</a></li>
						<li><a href="/Estudo/Teste/Cadastrar">Cadastrar</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/Estudo/logout">Logout</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>

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