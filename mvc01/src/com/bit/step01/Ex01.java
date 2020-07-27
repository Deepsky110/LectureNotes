package com.bit.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet{
	// 어떤 요청이 들어오면 요청 별로 객체를 찍어내고 동일 객체를 반복 이용함 
	ServletConfig config;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		config=arg0;
		System.out.println("init..."+this.hashCode());
	}
	
	@Override
	public void destroy() { // 탐캣 서버를 중지시켰을 때 발동
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
		return "이 서블릿은 누가 언제 만들었고...";
	}


	

}
