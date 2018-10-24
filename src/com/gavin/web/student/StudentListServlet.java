package com.gavin.web.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gavin.entity.Student;
import com.gavin.service.student.StudentListService;
 
@WebServlet("/user/student/list")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentListService sls = new StudentListService();
		List<Student> list = sls.getAllStudent();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/views/user/success.jsp").forward(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
