<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Cliente</title>
</head>
<body>

	<form action="/PrjTesteMgr/cliente" method="post">
	  CPF: <input type="text" name="cpf" />
		<input name="btnConsulta" type="submit" value="Buscar..." />
	</form>
	<% if (request.getAttribute("clientedto") != null) { %>
	<br>
	  Cpf: ${clientedto.cpf}<br>
	  Nome: ${clientedto.nome}<br>
	  End: ${clientedto.endereco}<br>
	  Sexo: ${clientedto.sexo}<br>
	  UF: ${clientedto.uf}<br> 
	 <% } else { %>
	  Mensagem: ${msgdto}
	 <% } %>
	<table>
		<tr>
			<td><a href="${pageContext.request.contextPath}/clienteform">Cadastrar Cliente</a></td>
			<td>-</td>
			<td><a href="${pageContext.request.contextPath}/menu">Menu de Opções</a></td>
		</tr>
	</table>

</body>
</html>