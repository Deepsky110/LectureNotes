<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width ="1024" align="center">
		<tr>
			<td>
				<img alt="" src="img/logo.png">
			</td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center">
				<a href="./">[HOME]</a>
				<a href="./list.jsp">[E M P]</a>
				<a href="#">[DEPT]</a>
				<a href="#">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td align="center">
				<!-- content start -->
				<h1 align="center">목록</h1>
				<table border="1" cellspacing="0" width="800" align="center">
					<tr>
						<th width="80">사번</th>
						<th>이름</th>
						<th width="120">날짜</th>
						<th width="120">금액</th>
					</tr>
					 <!-- 반복할 부분 작성 -->
					<% 
					com.bit.emp.Emp02list emp = new com.bit.emp.Emp02list();
					java.util.ArrayList<com.bit.emp.dto.Emp02Bean> list = emp.list();
					for(int i = 0; i<list.size(); i++) {
						com.bit.emp.dto.Emp02Bean bean = list.get(i);
					%>
					<tr>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
					</tr>
					<%} %>
					<!-- 반복 끝 -->
				</table>
				<a href="add.jsp">[입 력]</a>
				<!-- content end -->
			</td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center">
			비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
			(주)비트컴퓨터 서초본원 대표이사 : 조현정<br>
			Copyright (c) 비트캠프 All rights reserved.<br>
			</td>
		</tr>
	</table>
</body>
</html>