package com.bit.xml;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.util.MyOracle;

public class StudentXml extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/xml;charset=utf-8"); // charset 안주면 윈도우 기본을 따라간다
		PrintWriter out = resp.getWriter();
		out.println("<students>");
		String sql = "select * from student01 order by num desc";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = MyOracle.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				out.println("<student>");
				out.println("	<num>"+rs.getInt("num")+"</num>");
				out.println("	<name>"+rs.getString("name")+"</name>");
				out.println("	<kor>"+rs.getInt("kor")+"</kor>");
				out.println("	<eng>"+rs.getInt("eng")+"</eng>");
				out.println("	<math>"+rs.getInt("math")+"</math>");
				out.println("</student>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		out.println("</students>");
	}

}
