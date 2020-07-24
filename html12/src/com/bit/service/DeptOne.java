package com.bit.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.DeptDao;
import com.bit.model.DeptDto;

/*
<servlet>
	<servlet-name>empOneXml</servlet-name>
	<servlet-class>com.bit.service.EmpOne</servlet-class>
</servlet>
<servlet-mapping>
	<servlet-name>empOneXml</servlet-name>
	<url-pattern>/empdetail.bit</url-pattern>
</servlet-mapping>
*/

@WebServlet("/deptdetail.bit") // web.xml에 추가하는 대신 Annotation 방법 사용
public class DeptOne extends HttpServlet {
	Logger log=Logger.getGlobal();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int deptno=Integer.parseInt(req.getParameter("idx"));
		log.info("param:"+deptno);
		DeptDao dao = new DeptDao();
		try {
			DeptDto bean = dao.getOne(deptno);
			resp.setContentType("application/json; charset=utf-8");
			PrintWriter out = resp.getWriter();
			out.println("{\"dept\":[");
			out.println("{\"deptno\":"+bean.getDeptno());
			out.println(",\"dname\":\""+bean.getDname()+"\"");
			out.println(",\"loc\":\""+bean.getLoc()+"\"}");
			out.println("]}");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
