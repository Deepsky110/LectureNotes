<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.emp.EmpDto"%>
<%@page import="com.bit.emp.EmpCRUD"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="1024" align="center">
		<tr>
			<td>
				<img alt="" src="img/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#cccccc">
				<a href="../index.jsp">[HOME]</a>
				<a href="./emp/lisg.jsp">[E M P]</a>
				<a href="../dept/list.jsp">[DEPT]</a>
				<a href="../login/form.jsp">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- content start -->
				<center>
				<h1>수정 페이지</h1>
				<jsp:useBean id = "bean" class = "com.bit.emp.EmpDto"></jsp:useBean>
 				<jsp:setProperty property="*" name="bean"/>
 				
<%-- 			<jsp:setProperty property="sabun" name="bean"/> --%>
<%-- 			<jsp:setProperty property="name" name="bean"/> --%>
<%-- 			<jsp:setProperty property="pay" name="bean"/> --%>

				<form action="update.jsp" method="post">
					<table>
						<tr>
							<td>사번</td>
							<td><input type="text" name="sabun" value="<%=bean.getSabun() %>" readonly="readonly"></td>
						</tr>
						<tr>
							<td>이름</td>
							<td><input type="text" name="name" value="<%=bean.getName() %>"></td>
						</tr>
						<tr>
							<td>금액</td>
							<td><input type="text" name="pay" value="<%=bean.getPay() %>"></td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="수 정">
								<input type="reset" value="취 소">
							</td>
						</tr>
					</table>
				</form>
				</center>
				<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#cccccc">
				비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
				(주)비트컴퓨터 서초본원 대표이사 : 조현정<br>
				Copyright (c) 비트캠프 All rights reserved.<br>
			</td>
		</tr>
	</table>

</body>
</html>