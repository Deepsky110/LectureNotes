package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex10 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String initValue = req.getServletContext().getInitParameter("bit");
		
//		initValue = getInitParameter("msg8");
		PrintWriter out = resp.getWriter();
		out.println("<h1>page10 msg9="+initValue+"</h1>");
		//msg9�� Ex09���� ������ ���̶� Ex10������ ��µ��� ����
	}
}
