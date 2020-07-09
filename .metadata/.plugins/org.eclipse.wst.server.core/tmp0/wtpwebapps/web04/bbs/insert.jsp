<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
// Method => get 방식의 한글 처리
// Tomcat v7.0 server => server.xml 설정
// <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>
// add URIEncoding="EUC-KR"
// <Connector URIEncoding="EUC-KR" connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>

// Method => Post 방식의 한글처리
//매 파라미터 파싱 전 엔코딩
	request.setCharacterEncoding("EUC-KR");
	String sub = request.getParameter("sub");
	String id = request.getParameter("id");
	String cntnt = request.getParameter("cntnt");
	
	if(sub.isEmpty())sub="제목없음";
	// 보안
	sub = sub.replace("<", "&lt;"); // <,>를 허용하면 태그를 사용자가 마음대로 쓸 수 있다
	sub = sub.replace(">", "&gt;"); // 출력은 <,>로 되지만 데이터베이스에는 대체값으로 들어감
	
	sub = sub.replace("--", "­­"); // SQL injection을 막는다
// 	sub = sub.replace(" ", "&nbsp;");
	sub = sub.replace("'", "＇");
	
	String sql = "insert into bbs01 (num, sub, id, nalja, cntnt, ref, no, lev) "; 
	sql+=" values (bbs01_seq.nextval, '"+sub+"', '"+id+"', sysdate, '"+cntnt+"', bbs01_seq.currval,0,0)";
	System.out.println(sql);
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	Class.forName(driver);
	
	Connection conn = null;
	Statement stmt = null;
	
	try {
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
	} finally {
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp"); // 클라이언트에게 list로 다시 접속하라고 명령
%>
</body>
</html>