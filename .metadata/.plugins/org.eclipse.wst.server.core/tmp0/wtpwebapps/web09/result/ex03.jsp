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
	<h1>이동 결과<%=bean %></h1>
	<p>param=<%=request.getParameter("msg") %></p> <!-- 파라미터 메세지 출력 -->
	<img alt="" src="../img/logo.png">
	<!-- ex01은 sendRedirect해서 주소가 ex03으로 바뀐 상태 : 상대주소로 이동
	ex02는 forward로 이동해서 주소가 ex02 그대로이다 : ex03의 상대주소로 찾아가면 경로가 맞지 않음-->
	
</body>
</html>