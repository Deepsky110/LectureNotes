/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-07-02 07:06:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"/web04/img/bg.jpg\">\r\n");
      out.write("\t<table width=\"1024\" align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\"><img src=\"/web04/img/logo.png\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=\"#cccccc\">&nbsp;</td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/\">[HOME]</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/bbs/list.jsp\">[B B S]</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/emp.list.jsp\">[E M P]</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#cccccc\" width=\"100\"><a href=\"/web04/login/form.jsp\">[LOGIN]</a></td>\r\n");
      out.write("\t\t\t<td bgcolor=\"#cccccc\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=\"white\" colspan=\"6\">\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<h1>상세보기</h1>\r\n");
      out.write("\t\t\t\t");

				String num = request.getParameter("idx");
				String id = "";
				String nalja = "";
				String sub = "";
				String cntnt="";
				int ref = 0, no = 0, lev = 0;
				
				String sql = "select id, nalja, sub, cntnt, ref, no, lev from bbs01 where num="+num;
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				
				Class.forName(driver);
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					if(rs.next()){
						id = rs.getString(1);
						nalja = rs.getDate(2).toString();
						sub = rs.getString(3);
						cntnt = rs.getString(4);
						ref = rs.getInt(5);
						no = rs.getInt(6);
						lev = rs.getInt(7);
						
					}
				} finally {
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}
				
				
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"1\" cellspacing=\"0\" width=\"800\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width = \"100\" bgcolor=\"#cccccc\">글번호</td>\r\n");
      out.write("\t\t\t\t\t\t<td >");
      out.print(num );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t\t<td width = \"100\" bgcolor=\"#cccccc\">글쓴이</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(id );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td width = \"100\" bgcolor=\"#cccccc\">날짜</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(nalja );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>제목</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"5\"'>");
      out.print(sub );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"6\">");
      out.print(cntnt );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"6\" bgcolor=\"#cccccc\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"edit.jsp?idx=");
      out.print(num );
      out.write("\">[수 정]</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"delete.jsp?idx=");
      out.print(num );
      out.write("\">[삭 제]</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"re.jsp?ref=");
      out.print(ref );
      out.write("&no=");
      out.print(no);
      out.write("&lev=");
      out.print(lev);
      out.write("\">[답 글]</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table><br>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=\"lightgray\"></td>\r\n");
      out.write("\t\t\t<td bgcolor=\"lightgray\" colspan=\"4\">\r\n");
      out.write("비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>\r\n");
      out.write("Copyright (c) 비트캠프 All rights reserved.\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td bgcolor=\"lightgray\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
