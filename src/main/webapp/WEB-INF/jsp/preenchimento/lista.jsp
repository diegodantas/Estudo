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
<link href="${pageContext.request.contextPath}/css/bootstrap.js"
	rel="stylesheet">
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
<script src="${pageContext.request.contextPath}/js/modules/exporting.js"></script>
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
						<li class="active"><a href="/Estudo/usuario/listar">Home</a></li>
						<li><a href="/Estudo/usuario/cadastrar">Cadastrar</a></li>
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
					<th>JAN</th>
					<th>FEV</th>
					<th>MAR</th>
					<th>ABR</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${preenchimento}" var="preenchimentos">
					<tr>
						<td>${preenchimentos.usuario.nome}</td>
						<td>${preenchimentos.jan}</td>
						<td>${preenchimentos.fev}</td>
						<td>${preenchimentos.mar}</td>
						<td>${preenchimentos.abr}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div id="mensagem">
		<h3>${mensagem}</h3>
	</div>

	<div id="container" >
		<script type="text/javascript">
			$(function() {
				var jan = <c:out value="${preenchimento[0].jan}"></c:out>
				<c:forEach items="${preenchimento}" var="preenchimentos">
					
				</c:forEach>
				$('#container').highcharts(
						{
							title : {
								text : 'Preenchimento',
								x : -20
							//center
							},
							xAxis : {
								categories : [ 'Jan', 'Feb', 'Mar', 'Apr',
										'May', 'Jun', 'Jul', 'Aug', 'Sep',
										'Oct', 'Nov', 'Dec' ]
							},
							yAxis : {
								title : {
									text : 'Meta %'
								},
								plotLines : [ {
									value : 0,
									width : 1,
									color : '#808080'
								} ]
							},
							tooltip : {
								valueSuffix : '%'
							},
							legend : {
								layout : 'vertical',
								align : 'right',
								verticalAlign : 'middle',
								borderWidth : 0
							},
							
							series : [
									{
										name : "${preenchimento[0].usuario.nome}",
										data : [jan,2]
									}]
						});
			});
		</script>
	</div>

</body>
</html>