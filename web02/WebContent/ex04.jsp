<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@ page import="java.util.Scanner, java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1 align=center><%=new Date() %>구구단 출력</h1>
<table width="80%" align="center" border="1">
	<tr>
		<%
		for(int i=2; i<10; i++){
			out.print("<td>");
			//out.write("<td>");
			out.print(i+"단");
			out.println("</td>"); // out 내장객체
		}
		%>
	</tr>
		<%
		for(int i=1; i<10; i++){
			out.print("<tr>");
			for(int j=2; j<10; j++){
				out.print("<td>");
				out.print(i+"x"+j+"= ");
				out.print(i*j);
				out.print("</td>");
			}
			out.print("</tr>");
		}
		%>

</body>
</html>