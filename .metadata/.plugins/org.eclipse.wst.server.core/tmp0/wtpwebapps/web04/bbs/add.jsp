<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body background="/web04/img/bg.jpg">
	<table width="1024" align="center">
		<tr>
			<td colspan="6"><img src="/web04/img/logo.png"></td>
		</tr>
		<tr>
			<td bgcolor="#cccccc">&nbsp;</td>
			<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/">[HOME]</a></td>
			<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/bbs/list.jsp">[B B S]</a></td>
			<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/emp.list.jsp">[E M P]</a></td>
			<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/login/form.jsp">[LOGIN]</a></td>
			<td bgcolor="#cccccc">&nbsp;</td>
		</tr>
		<tr>
			<td bgcolor="white" colspan="6">
			<center>
				<h1>글쓰기</h1>
				<form action="insert.jsp" method="post"> <!--form:post방식으로 전달하면 한글 다시 깨진다-->
					<table width="600" align="center">
						<tr>
							<td width="100">제목</td>
							<td><input type="text" name="sub" size="60"></td>
						</tr>					
						<tr>
							<td>글쓴이</td>
							<td><input type="text" name="id" size="60"></td>
						</tr>					
						<tr>
							<td></td>
							<td><textarea name="cntnt" rows="6" cols="60"></textarea></td>
						</tr>					
						<tr>
							<td colspan="2" align="center" >
								<input type="submit" value="글쓰기">
								<input type="reset" value="취 소">							
							</td>
						</tr>					
					</table>
				</form>
			</center>
			</td>
		</tr>
		<tr>
			<td bgcolor="lightgray"></td>
			<td bgcolor="lightgray" colspan="4">
비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
Copyright (c) 비트캠프 All rights reserved.
			</td>
			<td bgcolor="lightgray"></td>
		</tr>
	</table>
</body>
</html>