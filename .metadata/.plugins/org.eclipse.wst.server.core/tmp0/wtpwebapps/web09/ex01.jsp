<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="test.Target" scope="request"></jsp:useBean>
	<h1>리다이렉트<%System.out.println(bean); %></h1>
	<%
		response.sendRedirect("result/ex03.jsp?msg=abcd");
	
		// <meta http-equiv="refresh" content="text/html; charset=EUC-KR">랑 같음
		// refresh => 클라이언트의 브라우저가 하는 처리
		// bean의 값이 화면에 출력된 초기값과 redirect후 콘솔에 출력된 값이 다르다(다른 객체)
	%>
</body>
</html>