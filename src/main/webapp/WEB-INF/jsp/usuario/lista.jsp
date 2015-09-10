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
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>

	<div class="container">

		<!-- Static navbar -->
		<nav class="navbar navbar-">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Vraptor4</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="/Estudo/usuario/listar">Home</a></li>
						<li><a href="/Estudo/usuario/cadastrar">Cadastrar</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<c:out value="${sessionScope.currentUser.nome}" />
						<li><a href="/Estudo/logout">Logout</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>

	</div>

	<div id="mensagem" class="container">
		<h3>${mensagem}</h3>
	</div>

	<div class="container">
		<h1>Lista de cadastrados</h1>
		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Usuario</th>
					<th>Status</th>
					<th>Operações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${usuario}" var="usuarios">
					<tr>
						<td>${usuarios.id}</td>
						<td>${usuarios.nome}</td>
						<td>${usuarios.usuario}</td>
						<td>${usuarios.status}</td>
						<td><a class="glyphicon glyphicon-edit"
							href="<c:url value="/usuario/atualiza/${usuarios.id}"/>"></a> <a
							class="glyphicon glyphicon-trash"
							href="<c:url value="/usuario/delete/${usuarios.id}"/>"></a></td>
						<!-- <td>
							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-trash"></span>
							</button>
							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-edit"></span>
							</button>
						</td> -->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>