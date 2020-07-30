<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL의 활용</h1>
	<%
		String msg1="el로 출력될까?";
		String msg2="page scope로 겹치면 어떻게 될까?";
		// page, request 스코프에 둘다 존재한다면?
		// attribute명이 겹치면 우선순위는 page > request > session > application
		// life cycle이 짧은 순서
		pageContext.setAttribute("msg1", msg1);
		pageContext.setAttribute("msg2", msg2);
		
		String[] msgs = {"java", "DB", "web", "framework"};
		pageContext.setAttribute("msgs", msgs);
		
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("JAVA");
		list.add("DB");
		list.add("WEB");
		list.add("FRAMEWORK");
		pageContext.setAttribute("alist", list);
		
		java.util.HashMap<String, Integer> map = null;
		map = new java.util.HashMap<String, Integer>();
		map.put("key1", 1111);
		map.put("key2", 2222);
		map.put("key3", 3333);
		map.put("key4", 4444);
		pageContext.setAttribute("hmap", map);
	%>
	
	<p>page scope(java) : <%=pageContext.getAttribute("msg1") %></p>
	<p>page scope(el) : ${msg1 }</p>
	<p>page scope(java) : <%=pageContext.getAttribute("msg2") %></p>
	<p>page scope(el) : ${pageScope.msg2 }</p>
	<p>request scope(java) : <%=request.getAttribute("msg2") %></p>
	<p>request scope(el) : ${requestScope.msg2 }</p>
	<!-- ex02.jsp로 접속하면 서블릿 연결이 안되어있어서
	request scope 값이 null이 나오고
	java 문법에서는 null / EL 문법에서는 공백이 출력된다
	ex02.bit으로 서블릿 이용하면 정상 출력 -->
	<p>Array(el) : ${msgs }</p>
	<ol>
		<li>${msgs[0] }</li>
		<li>${msgs[1] }</li>
		<li>${msgs[2] }</li>
		<li>${msgs[3] }</li>
	</ol>
	<p>Array(java) : <%=pageContext.getAttribute("alist").toString() %></p>
	<p>Array(el) : ${alist }</p>
	<ol>
		<li>${alist.get(0) }</li>
		<li>${alist.get(1) }</li>
		<li>${alist.get(2) }</li>
		<li>${alist.get(3) }</li>
	</ol>
	<p>HashMap(java) : <%=pageContext.getAttribute("hmap") %></p>
	<p>HashMap(el) : ${hmap }</p>
	<ul>
		<li>${hmap.key1 }</li>
		<li>${hmap.key2 }</li>
		<li>${hmap.key3 }</li>
		<li>${hmap.key4 }</li>
	</ul>
	<!-- JAVA와 EL을 병행 표기하지 말 것 -->
	<p>bean : <%=request.getAttribute("bean") %></p>
	<p>bean : ${bean }</p>
	<p>bean(el) : ${bean }</p>
	<dl>
		<dt>int su1</dt>
		<dd>${bean.su1 }</dd>
		<dt>double su2</dt>
		<dd>${bean.su2 }</dd>
		<dt>char ch</dt>
		<dd>${bean.ch }</dd>
		<dt>boolean tf</dt>
		<dd>${bean.tf }</dd>
		<dt>String name</dt>
		<dd>${bean.name }</dd>
		<dt>java.util.Date nalja</dt>
		<dd>${bean.nalja }</dd>
	</dl>
	<p>${bean.tf ? "참":"거짓" }</p>
	<!-- ElController의 bean.tf가 true면 참, false면 거짓 -->
</body>
</html>