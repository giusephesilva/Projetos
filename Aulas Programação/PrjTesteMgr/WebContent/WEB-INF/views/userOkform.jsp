<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>O usuário ${userdto.nome} foi gravado com sucesso!</p>
	<p>Código interno é: ${userdto.idusuario}</p>
	<table>
		<tr>
			<td><a href="${pageContext.request.contextPath}/userform">CadastrarUsuário</a></td>
			<td>-</td>
			<td><a href="${pageContext.request.contextPath}/menu">Menu
					de Opções</a></td>
		</tr>
	</table>
</body>
</html>