package com.gavin.service.student;

import com.gavin.dao.StudentDao;
import com.gavin.entity.Student;

public class StudentOneService {
	private StudentDao sd = new StudentDao();
	public Student getStudentById(String id) {
		return sd.getStudentById(id);
	}

}
