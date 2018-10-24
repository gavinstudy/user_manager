package com.gavin.service.student;

import com.gavin.dao.StudentDao;
import com.gavin.entity.Student;

public class StudentInsertService {
	private StudentDao sd = new StudentDao();
	public void insertStudent(Student student) {
		sd.insertStudent(student);
	}

}
