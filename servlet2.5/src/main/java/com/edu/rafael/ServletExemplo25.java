package com.edu.rafael;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExemplo25
 */
public class ServletExemplo25 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletExemplo25() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); // toda resposta escrita no browser será em html ou plain
		out.print("Exemplo<br/> servelet 2.5"); // para fazer uma quebra de linha é preciso que seja no formato html <br/>

		 // response.getWriter().append("Served at: ").append(request.getContextPath());

		/*
		 * é escrito aqui o código que será requisitado a esse serlet via get se clicar
		 * em um link ou digitar uma requisição na url de um browser.
		 * 
		 * parâmetro que lida com todas as informações que chegam ao servlet, requisição
		 * (HttpServletRequest request) parâmetro que lida com todas as requisições que
		 * saem do servlet, resposta (HttpServletResponse).
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		/*
		 * è executado todo vez que fizermos uma requisição utilizando httppost, ou
		 * seja, sempre que tiver o preenchimeto de formulário
		 */
	}

}
