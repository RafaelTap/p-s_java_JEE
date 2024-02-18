package com.edu.rafael.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCalculadora() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {
			double op1 = Double.parseDouble(request.getParameter("op1"));
			double op2 = Double.parseDouble(request.getParameter("op2"));
			int operacao = Integer.parseInt(request.getParameter("op"));
			double resultado;

			switch (operacao) {
			case 1:
				resultado = op1 + op2;
				break;
			case 2:
				resultado = op1 - op2;
				break;
			case 3:
				resultado = op1 * op2;
				break;
			case 4:
				resultado = op1 / op2;
				break;
			default:
				resultado = 0;
			}
			out.print("Resultado: " + resultado);

		} catch (Exception e) {
			out.print(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

// aparecerá um erro, no final do url acrescentar "?op1=10&op2=20&op=2" , altere os valores de op1, op2 e op.
