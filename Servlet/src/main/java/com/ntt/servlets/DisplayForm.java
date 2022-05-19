package com.ntt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayForm
 */
@WebServlet("/DisplayForm")
public class DisplayForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");
		// try (PrintWriter out = response.getWriter())
		{
			PrintWriter out = response.getWriter();
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servletdata store</title>");
			out.println("</head>");
			out.println("<body>");

			String name = "", email = "", phone_no = "", password = "";
			name = request.getParameter("name");
			email = request.getParameter("email");

			out.println("<p>" + "name:" + name + " email:" + email + "phone_no:" + phone_no + " password: " + password
					+ "</p>");
			out.println("</body>");
			out.println("</html>");
		}

	}

}
