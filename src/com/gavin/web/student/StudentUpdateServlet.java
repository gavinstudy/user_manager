package com.gavin.web.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gavin.entity.Student;
import com.gavin.service.student.StudentOneService;
import com.gavin.service.student.StudentUpdateService;

@WebServlet("/user/student/update")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		StudentOneService sos = new StudentOneService();
		Student student = sos.getStudentById(id);
		request.setAttribute("student", student);
		request.getRequestDispatcher("/WEB-INF/views/student/studentupdate.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		student.setSex(sex);
		student.setPhone(phone);
		
		StudentUpdateService sds = new StudentUpdateService();
		sds.updateStudent(student);
		
		response.sendRedirect("/user/student/list");
	}

}
