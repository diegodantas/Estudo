<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Teste</title>
</head>
<body>

	<div>
		<div class="panel">
			<div class="panel-heading">
				<h1>Lista de cadastrados</h1>
			</div>

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
								href="<c:url value="/usuario/atualiza/${usuarios.id}"/>"
								title="Editar"></a> <a class="glyphicon glyphicon-trash"
								href="<c:url value="/usuario/delete/${usuarios.id}"/>"
								title="Deletar"></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>

</body>
</html>