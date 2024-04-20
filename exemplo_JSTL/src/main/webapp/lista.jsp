<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- diretrizes -->
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!-- o que será impresso na tela-->
<c:out value="Exemplo de JSTL" />

<!-- criação de atributos -->
<!-- valor retirado de uma url ou formulário-->
<!-- <c:set var="aluno" value="${param.nome}" />
<br /> -->

<!-- caso aluno não exista, será impresso na tela -->
<!-- <c:out value="${aluno}">
nenhum nome informado
</c:out> -->

<jsp:useBean id="carro" class="edu.rafael.bean.Automovel" />

<h1>Lista de veículos</h1>

<!-- estrutura de repetição para exibir a lista de carros -->

<c:forEach var="item" items="${carro.listaveiculos }">
Marca: <c:out value="${item.marca }" />
	<br />
Modelo: <c:out value="${item.modelo }" />
	<br />
Ano: <c:out value="${item.ano }" />
	<br />
</c:forEach>