<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>clienteform</title>
</head>
<body>
  <form action="PrjTesteMgr/cliente/save" method="post">
  <h1> cadastro do cliente</h1>
  <fieldset>
 
 <table cellspacing="10">

  <tr>
   <td>
    <label for="cpf">CPF</label></td>
   <td align="left">
    <input type="text" name="cpf">
   </td>
   
   
  </tr>
  <tr>
   <td>Nome</td>
   <td align="left">
    <input type="text" name="nome">
   </td>
  </tr>
  <tr>
   <td>
    <label for="uf">UF</label>
   </td>
   <td align="left">
    <select name="uf"> 
    <option value="rj">RJ</option> 
    <option value="sp">SP</option> 
    <option value="es">ES</option> 
    
   </select>
   </td>
  </tr>
  <tr>
   <td>
    <label for="endereco">Endereco: </label>
   </td>
   <td align="left">
    <input type="text" name="endereco">
   </td>
  </tr>
  <tr>
   <td>
    <label for="sexo">Sexo</label>
   </td>
   <td align="left">
    <select name="sexo"> 
    <option value="m">M</option> 
    <option value="f">F</option> 
    </select>
   </td>
  </tr>
 </table>
</fieldset>
  <br>
  <input type="submit" value="Salvar">
<input type="reset" value="Limpar">
  
  </form>
</body>
</html>