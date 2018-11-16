package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.Register;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");

		System.out.println("Object Created");

		com.model.Register r = new Register();		
		r.setFname(fname);
		
		System.out.println(r.getFname());

		 PrintWriter out = response.getWriter();
		 out.print("Hello"+fname);
		/*try {
			DBApplication db=new DBApplication();
			List<Register> lst=new LinkedList<Register>();
			lst.add(r);
			System.out.println("test1");
			int i=db.saveData(lst);
			System.out.println("test2 iw value"+i);
			if(i>0)
			{
				System.out.println("test3");
				response.sendRedirect("index.jsp");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    request.getRequestDispatcher("gfhhdex.jsp").include(request, response);  

		}*/
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
