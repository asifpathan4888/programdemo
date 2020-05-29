package com.demo.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionEx")
public class SessionEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public SessionEx() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(true);
		Date created =new Date(session.getCreationTime());
		Date accessed= new Date(session.getLastAccessedTime());
		
		//out.println("ID"+session.getId());
		//out.println("Created"+created);
		//out.println("Last access" +accessed);
		
		String dataname= request.getParameter("dataname");
		String datavalue= request.getParameter("datavalue");
		session.setAttribute(dataname, datavalue);
		
		Enumeration e =session.getAttributeNames();
		while(e.hasMoreElements()){
			String name =(String)e.nextElement();
			String value=(String)session.getAttribute(name);
			out.println(name+" "+value);
		}
		
	}

	
	


}
