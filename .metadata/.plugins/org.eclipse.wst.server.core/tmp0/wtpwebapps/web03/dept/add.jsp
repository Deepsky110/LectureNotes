<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width = "100%">
	<tr>
		<td colspan="6"><img src = "../img/logo.png"></td> <!-- 6ĭ�� �ϳ��� ���´� -->
	</tr>
	<tr>
		<td bgcolor="lightgray"></td>
		<td bgcolor="lightgray" width = "120"><a href="../index.jsp">[HOME]</a></td>
		<td bgcolor="lightgray" width = "120"><a href="list.jsp">[DEPT]</a></td>
		<td bgcolor="lightgray" width = "120"><a href="../emp/list.jsp">[E M P]</a></td>
		<td bgcolor="lightgray" width = "120"><a href="../login/login.jsp">[LOGIN]</a></td>
		<td bgcolor="lightgray"></td>
	</tr>
	<tr>
		<td colspan ="6">
		<!-- content start �Ź� �ٲ� �κ� -->
		<center>
		<h1>DEPT ADD PAGE</h1>
		<form action = "insert.jsp">
			<table>
			<tr>
				<td>deptno</td>
				<td><input type="text" name="deptno"></td>
			</tr>
			<tr>
				<td>dname</td>
				<td><input type="text" name="dname"></td>
			</tr>
			<tr>
				<td>loc</td>
				<td><input type="text" name="loc"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="�� ��">
					<input type="reset" value="�� ��">
				</td>
			</tr>
			</table>
		</form>
		</center>
		<!-- content end -->
		</td>
	</tr>
	<tr>
		<td colspan = "6" bgcolor="lightgray" align = "center">
		��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
����Ǹž� �Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
Copyright (c) ��Ʈķ�� All rights reserved.
		</td>
	</tr>
</table>
</body>
</html>