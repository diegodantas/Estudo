<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste</title>
</head>
<body>
	<ul>
		<c:forEach items="${estudo}" var="teste">
			<li>${teste.id}-${teste.nome}- ${teste.finalizado}</li>
			
			<a href="<c:url value="/Teste/Delete/${teste.id}"/>">Deletar</a>	

		</c:forEach>
	</ul>

	<div id="mensagem">
		<h3>${mensagem}</h3>
	</div>
</body>
</html>