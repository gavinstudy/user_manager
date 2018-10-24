package com.gavin.service.student;

import com.gavin.dao.StudentDao;

public class StudentDeleteService {
	private StudentDao sd = new StudentDao();
	public void deleteStudent(String id) {
		sd.deleteStudent(id);
	}

}
