package com.bit.dept04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Dept04Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Dept04Dao() { // ������ �̿��ؼ� connection ����
		// Connection pools API
		// https://tomcat.apache.org/tomcat-7.0-doc/jdbc-pool.html
		// context.xml �����߰�
		try{
			InitialContext init =new InitialContext();
			/*
			javax.naming.Context context = null;
			context = (Context) init.lookup("java:comp/env"); // �ڹ� �����Ϸ��� ȯ��(environments)
			
			javax.sql.DataSource dataSource = null;
			dataSource = (DataSource) context.lookup("jdbc/oracle");
			*/
			javax.sql.DataSource dataSource = null;
			dataSource = (DataSource) init.lookup("java:comp/env/jdbc/oracle"); // �� ���� ���
			
			conn = dataSource.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		///////////////////////////////////////////////////////
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			conn=DriverManager.getConnection(
//					"jdbc:oracle:thin:@localhost:1521:xe",
//					"scott",
//					"tiger");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	public List<Dept04Dto> selectAll() {
		List<Dept04Dto> list = new ArrayList<Dept04Dto>();
		try {
			conn.setAutoCommit(false); // close ������ commit ���� �ʰڴ�
			pstmt = conn.prepareStatement("select * from dept04");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Dept04Dto(
						rs.getInt("deptno"),
						rs.getString("dname"),
						rs.getString("loc")
						));
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				// ��������� �ѹ� ���Ѿ� ��, conn.close() ���� conn.commit(), conn.rollback() �ʿ�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}
}
