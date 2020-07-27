package com.bit.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet{
	// � ��û�� ������ ��û ���� ��ü�� ���� ���� ��ü�� �ݺ� �̿��� 
	ServletConfig config;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		config=arg0;
		System.out.println("init..."+this.hashCode());
	}
	
	@Override
	public void destroy() { // ŽĹ ������ ���������� �� �ߵ�
		System.out.println("destroy..."+this.hashCode());
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		System.out.println("service..."+this.hashCode());
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>hello world</h1>");
		
	}
	
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("config..."+this.hashCode());
		return this.config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("info..."+this.hashCode());
		return "�� ������ ���� ���� �������...";
	}


	

}
