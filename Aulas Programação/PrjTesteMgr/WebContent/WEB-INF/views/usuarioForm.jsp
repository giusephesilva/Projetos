<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de usuario</title>
</head>
<body>
     <form action="PrjTesteMgr/users/save" method="post">
        Login:<br> <input type="text" name="nome"/><br>
	    Senha:<br> <input type="password" name="senha"/> <br>
      <INPUT name="btnlogar" TYPE="submit" value="Salvar">
     </form>

</body>
</html>