<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- page��� ���� ��ü�� �־ ���������� page ���Ұ� -->
	<h1>page ���尴ü</h1>
	<%
		out.println(page==this); 
	// �� �������� ������Ʈ�� ��ü �ڱ� �ڽ�
	// ���� this�� �־ ����, page�� �� �Ⱦ���
	%>
</body>
</html>