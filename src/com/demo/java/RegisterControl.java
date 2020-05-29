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

@WebServlet("/RegisterControl")
public class RegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterControl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegisterModel rm = new RegisterModel();
		RegisterDTO dto= new RegisterDTO();
		

		boolean flag =false;

		String fn = request.getParameter("Fname");
		String ln = request.getParameter("Lname");
		String un = request.getParameter("uname");
		String em = request.getParameter("Email");
		String ad = request.getParameter("Add");
		String ph = request.getParameter("Phone");
		String g = request.getParameter("Gender");
		String pass = request.getParameter("pass");
		
		
		

		try {
			dto.setFname(fn);
			dto.setLname(ln);
			dto.setUname(un);
			dto.setEmail(em);
			dto.setAdd(ad);
			dto.setPhone(ph);
			dto.setGender(g);
			dto.setPassword(pass);
			
			rm.add(dto);
			
			
			
			/*RequestDispatcher rdt = request.getRequestDispatcher("/RegistrationView.jsp");
			request.setAttribute("nameerror", "enter name");
			rdt.forward(request, response);*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  /*if(flag==false){
*/			  RequestDispatcher rd=request.getRequestDispatcher("/LoginView.jsp");
			  rd.forward(request, response);
		  /*}else{
		RequestDispatcher rd=request.getRequestDispatcher("/RegistrationView.jsp");
		  request.setAttribute("nameerror", "enter name");
		  request.setAttribute("lnameerror", "enter Last Name");
		  request.setAttribute("unameerror", "enter username");
		  
		  rd.forward(request, response);
		  }*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
