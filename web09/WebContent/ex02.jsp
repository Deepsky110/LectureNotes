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
	<h1>actionTag<%System.out.println(bean); %></h1>
	<!-- 액션태그 forward를 이용해 이동 -->
	<jsp:forward page="result/ex03.jsp">
		<jsp:param value="xyz" name="msg"/>
	</jsp:forward>
	<!-- 서버가 forward로 이동시키는 작업을 한다
	페이지는 이동했으나 한 request내에 이루어짐
	주소는 클라이언트가 최초 request한 주소 -->
</body>
</html>