package com.edu.rafael;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class FilterLogin
 */
@WebFilter("/validacao")
public class FilterLogin implements Filter {

	/**
	 * Default constructor.
	 */
	public FilterLogin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String nome = req.getParameter("nome");
		String senha = req.getParameter("senha");

		if (nome.equals("") || senha.equals("")) {
			resp.sendRedirect("login.jsp");
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

/*
 * classe filter criada para filtar ações de validação de logiin e senha que não
 * tenham inseridos o login e senha respectvamente. seu url partern é igual ao
 * url do servlet, para que o corra o filtro.
 */
