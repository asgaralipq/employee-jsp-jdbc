package com.asgar.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asgar.web.dao.EmployeeDao;
import com.asgar.web.model.Employee;

/**
 * Servlet implementation class GetEmployeeController
 */
public class GetEmployeeController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int e_id= Integer.parseInt(request.getParameter("e_id"));
		
		EmployeeDao dao = new EmployeeDao();
		
		Employee e1 = dao.getEmployee(e_id);
		
		RequestDispatcher rd = request.getRequestDispatcher("showEmployee.jsp");
		
		rd.forward(request, response);
	}
 

}
