package com.krishna.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/edit-todo.do")
public class EditTodoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPut(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.doPut(arg0, arg1);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("todo", request.getParameter("todo"));
		request.getSession().setAttribute("category", request.getParameter("category"));
		request.getRequestDispatcher("/WEB-INF/views/edit-todo.jsp").forward(
				request, response);
	}

}
