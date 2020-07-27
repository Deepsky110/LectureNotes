package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.jws.soap.InitParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 	<servlet>
		<servlet-name>ex11</servlet-name>
		<servlet-class>com.bit.step03.Ex11</servlet-class>
		<init-param>
			<param-name>msg9</param-name>
			<param-value>abcdefg</param-value>
		</init-param>
	</servlet>
	<servlet-mapping>
		<servlet-name>ex11</servlet-name>
		<url-pattern>/ex11</url-pattern>
	</servlet-mapping>
 */

//annotation(주석이라는 뜻), 반드시 클래스명 위에 작성
//@WebServlet(value = {"/ex11", "/ex11.bit"} initParams={
//		@WebInitParam(name="msg1", value="abcd1")
//		,@WebInitParam(name="msg2", value="abcd2")
//		,@WebInitParam(name="msg3", value="abcd3")
//		})
//@WebServlet(value = {"/ex11","/ex11.bit"}) 생략
//@WebServlet(urlPatterns = {"/ex11","/ex11.bit"}) 생략
@WebServlet("/ex11")
public class Ex11 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> enu = getInitParameterNames();
		while(enu.hasMoreElements()){
			String value = getInitParameter(enu.nextElement());
			System.out.println(value);
		}
		PrintWriter out = resp.getWriter();
		out.println("<h1>annotation mapping</h1>");
		
	}
}
