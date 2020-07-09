<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- page라는 내장 객체가 있어서 변수명으로 page 사용불가 -->
	<h1>page 내장객체</h1>
	<%
		out.println(page==this); 
	// 이 페이지의 오브젝트는 객체 자기 자신
	// 보통 this가 있어서 쓰고, page를 잘 안쓴다
	%>
</body>
</html>