package com.gavin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.gavin.db.MyConnection;
import com.gavin.entity.Student;

public class StudentDao {
	private Connection conn = MyConnection.getConnection();
	private PreparedStatement pstmt;
	private ResultSet rst;
	/**
	 * 查询所有学生
	 * @return
	 */
	public List<Student> getAllStudent() {
		String sql = "select id,name,age,sex,phone from student";
		List<Student> list = new LinkedList<Student>();
		try {
			pstmt = conn.prepareStatement(sql);
			rst = pstmt.executeQuery();
			while(rst.next()) {
				Student student = new Student();
				student.setId(rst.getString(1));
				student.setName(rst.getString(2));
				student.setAge(rst.getInt(3));
				student.setSex(rst.getString(4));
				student.setPhone(rst.getString(5));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				MyConnection.close(conn);
				MyConnection.close(pstmt);
				MyConnection.close(rst);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public void insertStudent(Student student) {
		String sql = "insert into student(id,name,age,sex,phone) values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setInt(3, student.getAge());
			pstmt.setString(4, student.getSex());
			pstmt.setString(5, student.getPhone());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				MyConnection.close(conn);
				MyConnection.close(pstmt);
				MyConnection.close(rst);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public Student getStudentById(String id) {
		String sql = "select id,name,age,sex,phone from student where id=?";
		Student student = new Student();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rst = pstmt.executeQuery();
			while(rst.next()) {
				student.setId(rst.getString(1));
				student.setName(rst.getString(2));
				student.setAge(rst.getInt(3));
				student.setSex(rst.getString(4));
				student.setPhone(rst.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				MyConnection.close(conn);
				MyConnection.close(pstmt);
				MyConnection.close(rst);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	public void updateStudent(Student student) {
		String sql = "update student set name=?,age=?,sex=?,phone=? where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getAge());
			pstmt.setString(3, student.getSex());
			pstmt.setString(4, student.getPhone());
			pstmt.setString(5, student.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				MyConnection.close(conn);
				MyConnection.close(pstmt);
				MyConnection.close(rst);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void deleteStudent(String id) {
		String sql = "delete from student where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
