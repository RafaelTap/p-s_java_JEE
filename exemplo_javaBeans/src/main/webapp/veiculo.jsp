<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- instancia de um objeto da classe Automovel -->
<jsp:useBean id="carro" class="edu.rafael.bean.Automovel" />

<!-- atribuindo valor fixo para marca -->
<jsp:setProperty property="marca" name="carro" value="Fiat" />

<!-- atribuindo valor fixo para modelo -->
<jsp:setProperty property="modelo" name="carro" value="Cronos" />

<!-- atribuindo valor fixo para ano -->
<jsp:setProperty property="ano" name="carro" value="2020" />

<!-- exibir os dados do carro -->
<h1>Dados do veículo</h1>
<p>
	Marca:<jsp:getProperty property="marca" name="carro" /><br /> 
	Modelo:<jsp:getProperty property="modelo" name="carro" /><br /> 
	Ano:<jsp:getProperty property="ano" name="carro" /><br />
	<jsp:getProperty property="mensagem" name="carro"/>
	
</p>



