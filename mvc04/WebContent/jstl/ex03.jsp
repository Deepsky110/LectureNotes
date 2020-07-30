<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL 제어문</h1>
	<h2>조건문(if문)</h2><!-- else가 없다  -->
<%--
 	<%
		int su = 1234;
		pageContext.setAttribute("su", su);
	%>
 --%>
	<c:set value="10" var="su"></c:set>
	<c:if test="${su gt 0 }">
		<p>양수입니다</p>
	</c:if>
	<c:if test="${su eq 0 }">
		<p>0입니다</p>
	</c:if>
	<c:if test="${su lt 0 }">
		<p>음수입니다</p>
	</c:if>
	<c:choose>
		<c:when test="${su==1 }">su=1</c:when>
		<c:when test="${su<0 }">su=-xxxx</c:when>
		<c:when test="${su==0 }">su=0</c:when>
		<c:otherwise>
			알 수 없음
		</c:otherwise>
	</c:choose>
	<br/>
	<h2>반복문</h2>
	<!--
		${status.current} - 현재 for문에 해당하는 번호
		${status.index} - 0번째 부터의 순서
		${status.count} - 1번째 부터의 순서
		${status.first} - 현재 라운드가 첫번째 일 경우 나타내는 플래그 (true/false)
		${status.last} - 현재 라운드가 마지막 일 경우 나타내는 플래그  (true/false)
		${status.begin} - (for문에 begin 속성 설정할 경우) for문의 시작 번호
		${status.end} - (for문에 begin 속성 설정할 경우) for문의 끝 번호 
		${status.step} - (for문에 begin 속성 설정할 경우) for문의 증가값 
	-->
	<c:forEach begin="10" end="20" var="su" varStatus="status">
		<p>${status.count}출력${su }
	</c:forEach>
	
</body>
</html>