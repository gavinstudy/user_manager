package com.gavin.web.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gavin.entity.Student;
import com.gavin.service.student.StudentInsertService;
import com.gavin.tool.UUIDString;

@WebServlet("/user/student/insert")
public class StudentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/student/studentInsert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = UUIDString.getUUID();
		String name = request.getParameter("name");
		int age = 0;
		age = Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		student.setSex(sex);
		student.setPhone(phone);
		
		StudentInsertService sis = new StudentInsertService();
		sis.insertStudent(student);
		
		response.sendRedirect("/user/student/list");
	}

}
