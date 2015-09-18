<?xml version="1.0" encoding="UTF-8" ?>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt">
<head>
<meta name="viewport" http-equiv="Content-Type"
	content="width=device-width, initial-scale=1text/html; charset=UTF-8"><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Principal</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet">	
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
</head>
<body>
	<!-- <h1>Header</h1> -->
	<div class="container">

		<!-- Static navbar -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">WebProj</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="/Estudo/usuario/listar">Home</a></li>
						<li><a href="/Estudo/usuario/cadastrar">Cadastro</a></li>
						<li><a href="/Estudo/preenchimento/listar">Preenchimento</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a><c:out value="${usuarioweb.nome}" /></a></li>
						<li><a href="/Estudo/logout">Logout</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>

		<div id="mensagem"
			<c:if test="${mensagem != null}">class="alert alert-success"</c:if>>
			<h3>${mensagem}</h3>
		</div>

		<hr>
		<decorator:body />
		<hr>
	</div>


</body>
</html>