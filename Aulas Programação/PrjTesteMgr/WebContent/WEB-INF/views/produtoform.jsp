<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de produtos</title>
</head>
<body>
  <form action="PrjTesteMgr/cliente/save" method="post">
  <h1> cadastro do cliente</h1>
  <fieldset>
 
 <table cellspacing="10">

  <tr>
   <td>
    <label for="nome">nome</label></td>
   <td align="left">
    <input type="text" name="nome">
   </td>
   </tr>
 
  
  <tr>
   <td>
    <label for="quantidade">quantidade </label>
   </td>
   <td align="left">
    <input type="text" name="quantidade">
   </td>
  </tr>
 </table>
</fieldset>
  <br>
  <input type="submit" value="Salvar">
<input type="reset" value="Limpar">
  
  </form>
</html>