package com.gavin.web.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gavin.entity.Student;
import com.gavin.service.student.StudentOneService;

@WebServlet("/user/student/xiangxi")
public class StudentXiangxiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		StudentOneService sos = new StudentOneService();
		Student student = sos.getStudentById(id);
		request.setAttribute("student", student);
		request.getRequestDispatcher("/WEB-INF/views/student/studentsingle.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
