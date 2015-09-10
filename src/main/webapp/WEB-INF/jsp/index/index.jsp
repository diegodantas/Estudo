<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inicio</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/signin.css"
	rel="stylesheet">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>

	<c:forEach items="${errors}" var="error">
	    ${error.category} - ${error.message}<br />
	</c:forEach>

	<div class="container">

		<form class="form-signin" action="/Estudo/login" method="post">
			<h2 class="form-signin-heading">Login</h2>
			<label for="inputUsuario" class="sr-only">Usuario</label> <input
				type="text" name="usuario.usuario" id="inputUsuario"
				class="form-control" placeholder="Usuario" required autofocus>
			<label for="inputSenha" class="sr-only">Senha</label> <input
				type="password" name="usuario.senha" id="inputSenha"
				class="form-control" placeholder="Senha" required>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Logar</button>
		</form>

	</div>

</body>
</html>