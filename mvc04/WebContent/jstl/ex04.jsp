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
	<h1>JSTL 반복문</h1>
	<%
		String[] msgs={"java","DB","web","framework"};
		pageContext.setAttribute("msgs", msgs);
		java.util.ArrayList<String> list = null;
		list = new java.util.ArrayList<String>();
		list.add("JAVA");
		list.add("DB");
		list.add("WEB");
		list.add("FRAMEWORK");
		pageContext.setAttribute("alist", list);
		
		java.util.HashSet<String> set = null;
		set = new java.util.HashSet<String>();
		set.add("JAVA");
		set.add("DB");
		set.add("WEB");
		set.add("FRAMEWORK");
		pageContext.setAttribute("hset", set);
		/* HashSet은 index가 없다 */
		
		java.util.HashMap<String, String> map = null;
		map = new java.util.HashMap<String, String>();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key3", "val4"); // 키 값이 중복되면 덮어씀
		pageContext.setAttribute("hmap", map);
		
		java.util.ArrayList beans = new java.util.ArrayList();
		com.bit.model.JavaBean bean = null;
		bean = new com.bit.model.JavaBean();
		bean.setSu1(1234);
		bean.setSu2(3.14);
		bean.setName("abcd");
		beans.add(bean);
		bean = new com.bit.model.JavaBean();
		bean.setSu1(4321);
		bean.setSu2(4.13);
		bean.setName("ABCD");
		beans.add(bean);
		pageContext.setAttribute("beans", beans);
	%>
	<ol>
		<c:forEach items="${msgs }" varStatus="status" var="ele">
			<li>${msgs[status.index] } - ${ele }</li>
		</c:forEach>
	</ol>
	<ol>
		<c:forEach items="${alist }" varStatus="status" var="ele">
			<li>${alist.get(status.index) } - ${ele }</li>
		</c:forEach>
	</ol>
	<ul><!-- HashSet의 경우 인덱스 번호 호출 없이 변수 이용 (순서x)-->
		<c:forEach items="${hset }" var="ele">
			<li>${ele }</li>
		</c:forEach>
	</ul>
	<ul><!-- HashMap -->
		<c:forEach items="${hmap }" var="ele">
			<li>${ele.key }:${ele.value }</li>
		</c:forEach>
	</ul>
	<dl>
		<c:forEach items="${beans }" var="dto">
			<dt>su1</dt>
			<dt>${dto.su1 }</dt>
			<dt>su2</dt>
			<dt>${dto.su2 }</dt>
			<dt>name</dt>
			<dt>${dto.name }</dt>
		</c:forEach>
	</dl>
</body>
</html>