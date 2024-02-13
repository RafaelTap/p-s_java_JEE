<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acesso do Usuário</title>
</head>
<body>
	<!--  para criar sessão devemos criar uma action (url / mapeamento) e um method que pode ser get ou post -->
	<form action="validacao" method="post"></form>
	Usuário: <input type="text" name= "nome" size= "10"><br/>
	Senha: <input type= "password" name= "senha" size= "10"><br/>
	<input type= "submit" value= "enviar"> <!-- botõo de comando -->
</body> 
</html>