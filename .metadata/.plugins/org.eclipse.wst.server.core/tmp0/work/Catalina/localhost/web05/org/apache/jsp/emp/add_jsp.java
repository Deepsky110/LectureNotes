/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-07-03 06:13:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/emp/../template/menu.jspf", Long.valueOf(1593739319527L));
    _jspx_dependants.put("/emp/../template/footer.jspf", Long.valueOf(1593756496457L));
    _jspx_dependants.put("/emp/../template/header.jspf", Long.valueOf(1593754766960L));
  }

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
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');

java.sql.Connection conn = null;
java.sql.Statement stmt = null;
java.sql.ResultSet rs = null;
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

      out.write("\r\n");
      out.write("<table width=\"1024\" align=\"center:\" bgcolor=\"white\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<img src=\"/web05/img/logo.png\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"gray\">\r\n");
      out.write("\t\t\t\t<font color=\"white\">\r\n");
      out.write("\t\t\t\t<a href=\"/web05/index.jsp\" style=\"color:white;\">[HOME]</a>\r\n");
      out.write("\t\t\t\t<a href=\"/web05/emp/list.jsp\" style=\"color:white;\">[E M P]</a>\r\n");
      out.write("\t\t\t\t<a href=\"/web05/dept/list.jsp\" style=\"color:white;\">[DEPT]</a>\r\n");
      out.write("\t\t\t\t<a href=\"/web05/login/form.jsp\" style=\"color:white;\">[LOGIN]</a>\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t<!-- cotent start -->");
      out.write("\r\n");
      out.write("\t<h1>입력페이지</h1>\r\n");

	String name = request.getParameter("name");
	if(name==null) name = "";

      out.write("\r\n");
      out.write("\t<form action = \"insert.jsp\">\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>이름</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>금액</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"pay\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"입 력\">\r\n");
      out.write("\t\t\t\t\t<input type=\"reset\" value=\"취 소\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- cotent end -->\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td bgcolor=\"gray\" align=\"center\">\r\n");
      out.write("\t\t\t\t<font color=\"white\">\r\n");
      out.write("\t\t\t\t비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>\r\n");
      out.write("\t\t\t\t(주)비트컴퓨터 서초본원<br>\r\n");
      out.write("\t\t\t\tCopyright (c) 비트캠프 All rights reserved.<br>\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>");
      out.write("\r\n");
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
