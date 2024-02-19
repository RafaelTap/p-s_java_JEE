package com.edu.rafael;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String nome = (String) session.getAttribute("jusuario");

		PrintWriter out = response.getWriter();

		if (nome == null) {
			response.sendRedirect("login.jsp");
		} else {
			out.print("usuario validado");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = this.getServletConfig().getInitParameter("user");
		String pwd = this.getServletConfig().getInitParameter("psw");

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (user.equals(nome) && pwd.equals(senha)) {
			HttpSession session = request.getSession();// define a variável de sessão, armazena informações em uma
														// sessão de usuário
			session.setAttribute("jusuario", nome); // em java o padrão começa com j.
			out.print("usuário validado");
		} else {
			out.print("usuário ou senha inválida");
		}

	}

}
