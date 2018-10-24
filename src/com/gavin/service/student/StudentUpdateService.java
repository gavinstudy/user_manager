package com.gavin.service.student;

import com.gavin.dao.StudentDao;
import com.gavin.entity.Student;

public class StudentUpdateService {
	private StudentDao sd = new StudentDao();

	public void updateStudent(Student student) {
		sd.updateStudent(student);
	}


}
