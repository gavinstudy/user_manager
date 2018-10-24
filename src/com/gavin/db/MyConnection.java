package com.gavin.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyConnection {
	private static DataSource ds = new ComboPooledDataSource("mySource");	//���ݿ����ӳض���
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * �ر�connection
	 */
	public static void close(Connection o) throws SQLException{
		if(o != null) {
			try {
				o.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
	/**
	 * �ر�
	 * @param o
	 * @throws SQLException
	 */
	public static void close(PreparedStatement o) throws SQLException{
		if(o != null) {
			try {
				o.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
	/**
	 * �ر�ResultSet
	 * @param o
	 * @throws SQLException
	 */
	public static void close(ResultSet o) throws SQLException{
		if(o != null) {
			try {
				o.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
}
