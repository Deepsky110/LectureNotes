<%@page import="com.bit.emp.Emp02Delete"%>
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
				<img alt="" src="/web06/img/logo.png">
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
			<td>
				<!-- content start -->
					<!-- POST  -->
					<%
					if("POST".equals(request.getMethod())){
						int sabun = Integer.parseInt(request.getParameter("sabun"));
						Emp02Delete emp = new Emp02Delete();
						emp.delete(sabun);
						response.sendRedirect("list.jsp");
						return; // 더 이상 진행 못하게
					}
					%>
					<!-- GET -->
					<table align="center" width="400">
						<tr>
							<td align="center">
								<%=request.getParameter("idx")%>번 글을 삭제 하시겠습니까?
							</td>
						</tr>
						<tr>
							<td align="center">
								<form method="POST">
									<input type="hidden" name="sabun" value="<%=request.getParameter("idx") %>">
									<input type="submit" value="삭 제">
								</form>
							</td>
						</tr>
					</table>
					</form>
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