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
	<h1>�̵� ���<%=bean %></h1>
	<p>param=<%=request.getParameter("msg") %></p> <!-- �Ķ���� �޼��� ��� -->
	<img alt="" src="../img/logo.png">
	<!-- ex01�� sendRedirect�ؼ� �ּҰ� ex03���� �ٲ� ���� : ����ּҷ� �̵�
	ex02�� forward�� �̵��ؼ� �ּҰ� ex02 �״���̴� : ex03�� ����ּҷ� ã�ư��� ��ΰ� ���� ����-->
	
</body>
</html>