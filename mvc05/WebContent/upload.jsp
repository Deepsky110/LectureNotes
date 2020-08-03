<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/header.css" />
</head>
<body>
<%@ include file="template/header.jspf" %>
	<h1>파일업로드</h1>
	<form action="upload.bit" method="post" enctype="multipart/form-data">
	<!-- 파일 받을 때 반드시 post(get은 제약이 많음) -->
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun" />
		</div>
		<div>
			<label for="file1">file1</label>
			<input type="file" name="file1" id="file1" />
		</div>
		<div>
			<button type="submit">업로드</button>
		</div>
	</form>
</body>
</html>