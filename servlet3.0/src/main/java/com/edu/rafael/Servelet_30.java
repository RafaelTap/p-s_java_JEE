package com.edu.rafael;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet_30
 */
@WebServlet("/exemploservelet3.0") // indica que essa classe representa um servelet
public class Servelet_30 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servelet_30() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = getServletConfig().getInitParameter("usuario");
		String senha = getServletConfig().getInitParameter("senha");
		PrintWriter out = response.getWriter();
		out.print(usuario);
		out.print(senha);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
 * Na versão 3.0 em diante do servlet, não é necessário adicinar o aquivo .xml
 * no projeto, todas as configurações do servlet são feitas através de
 * anotações. Arquivo .xml só é adicionado caso alguma(s) outra(s)
 * configuração(ões) seja(am) necessária(ias).
 * 
 * servlet é excutado pelo servidor, o servido cria uma resposta com base no
 * servlet e envia a resposta para o cliente.
 */