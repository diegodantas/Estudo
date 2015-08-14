<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>VRaptor Blank Project</title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet">
</head>
<body>
	${linkTo[IndexController].index} ${pageContext.request.contextPath}
	<a href="Teste/Listar">Listar</a>
	<a href="Teste/Cadastrar">Cadastrar</a>

	<div class="container">

		<form class="form-signin" action="/Estudo/Login" method="post">
			<h2 class="form-signin-heading">Login</h2>
			<label for="inputUsuario" class="sr-only">Usuario</label> 
			<input type="text" name="usuario.nome" id="inputUsuario" class="form-control" placeholder="Usuario" required autofocus>
			<label for="inputSenha" class="sr-only">Senha</label>
			<input type="password" name="usuario.senha" id="inputSenha" class="form-control" placeholder="Senha" required>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Logar</button>
		</form>

	</div>

</body>
</html>