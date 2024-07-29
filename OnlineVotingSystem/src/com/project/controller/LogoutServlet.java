package com.project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession loginSession =request.getSession();
		int i=(Integer)loginSession.getAttribute("userID");
		loginSession.invalidate();
		/*if(i>0)
		{
			loginSession.removeAttribute("userID");
			//request.setAttribute("msg", "Login First");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
		
		
		String login=(String)adminSession.getAttribute("username");
		if(login!=null && login!="")
		{
			
		
			adminSession.removeAttribute("username");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}*/
		HttpSession adminSession =request.getSession();
		adminSession.invalidate();
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
