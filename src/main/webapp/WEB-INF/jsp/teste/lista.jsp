<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Teste</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<ul>
		<c:forEach items="${estudo}" var="teste">
			<li>${teste.id}-${teste.nome}-${teste.finalizado}</li>

			<a href="<c:url value="/Teste/Delete/${teste.id}"/>">Deletar</a>

		</c:forEach>
	</ul>

	<div id="mensagem">
		<h3>${mensagem}</h3>
	</div>

	<div>
		<form class="form-signin" action="/Estudo/logout" method="post">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Logout</button>
		</form>
	</div>

</body>
</html>