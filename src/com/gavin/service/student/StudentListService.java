package com.gavin.service.student;

import java.util.List;

import com.gavin.dao.StudentDao;
import com.gavin.entity.Student;

public class StudentListService {
	private StudentDao sd = new StudentDao();
	public List<Student> getAllStudent() {
		
		return sd.getAllStudent();
	}

}
