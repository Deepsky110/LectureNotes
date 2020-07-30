<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL etc</h1>
	<%
		String msg = "java, DB, web,,,, framework, app";
		pageContext.setAttribute("msg", msg);
		/*  ','를 기준으로 split하면 중간에 ,, 사이는 공백으로나온다
		String[] result = msg.split(",");
		for(String st: result){
			System.out.println(st);
		}
		*/
		StringTokenizer stToken = new StringTokenizer(msg, ",");
		while(stToken.hasMoreTokens()){
			System.out.println(stToken.nextToken());
		} // 의미 없는 공백 무시
	%>
	<ul>
		<c:forTokens items="${msg }" delims="," var="ele">
			<li>${ele }</li>
		</c:forTokens>
	</ul>
	
	<div>
		<c:import url="https://google.com"></c:import>
	</div>
</body>
</html>