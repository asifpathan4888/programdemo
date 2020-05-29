package com.demo.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCtrl
 */
@WebServlet("/LoginCtrl")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCtrl() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		HttpSession session=request.getSession();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		
		session.setAttribute("user", user);
		
		session.setAttribute("pass", pass);
		

		RegisterModel rm = new RegisterModel();
		RegisterDTO dto = new RegisterDTO();

		
		try {
			if (rm.Login(user, pass)) {
				RequestDispatcher rd = request.getRequestDispatcher("/WelcomeCtrl");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
				request.setAttribute("error", "Invalid Userid and Password");
				rd.forward(request, response);

			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}