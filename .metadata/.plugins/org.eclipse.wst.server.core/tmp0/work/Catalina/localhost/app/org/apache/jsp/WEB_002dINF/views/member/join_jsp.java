/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-12 06:37:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/resources/static/css/common.css", Long.valueOf(1691327317800L));
    _jspx_dependants.put("/resources/static/css/Join_Page.css", Long.valueOf(1691327317821L));
    _jspx_dependants.put("/resources/static/css/footer.css", Long.valueOf(1694492447778L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1692698618642L));
    _jspx_dependants.put("jar:file:/C:/workspace_team/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PJ_TEAM01/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/resources/static/css/header.css", Long.valueOf(1691327317815L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	");
      out.write("@font-face {\r\n");
      out.write("    font-family: 'SDSamliphopangche_Basic';\r\n");
      out.write("    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts-20-12@1.0/SDSamliphopangche_Basic.woff') format('woff');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("    margin: 2px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    font-family: 'SDSamliphopangche_Basic';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    padding: 0px;\r\n");
      out.write("    margin: 0px;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper {\r\n");
      out.write("    width: 1200px;\r\n");
      out.write("    margin: 30px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.mobilemenu>.material-symbols-outlined{ \r\n");
      out.write("    font-variation-settings:\r\n");
      out.write("    'FILL' 0,\r\n");
      out.write("    'wght' 400,\r\n");
      out.write("    'GRAD' 0,\r\n");
      out.write("    'opsz' 48}");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("/* header */\r\n");
      out.write(".wrapper>header {\r\n");
      out.write("    height:130px;\r\n");
      out.write("    /* border: 1px solid red; */\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* íí¤ë ë´ ë¡ê³ , ê²ìì°½, íµë©ë´ ì ì²´ */\r\n");
      out.write(".wrapper>header>.top-header{\r\n");
      out.write("    height: 110px;\r\n");
      out.write("    /* border: 1px solid green; */\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* íí¤ë ë´ ë¡ê³  */\r\n");
      out.write(".wrapper>header>.top-header>.logo{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("    width: 240px;\r\n");
      out.write("    height: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* íí¤ë ë´ ê²ìì°½ */\r\n");
      out.write(".wrapper>header>.top-header>form .search_box{\r\n");
      out.write("    height: 38px;\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    border: 3px solid rgb(92, 115, 6);\r\n");
      out.write("    position: relative;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("    line-height: 35px;\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.top-header>form .search_box>div{\r\n");
      out.write("    /* border: 1px solid rosybrown; */\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    width: 110px;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    line-height: 35px;\r\n");
      out.write("    margin-top: -1px;\r\n");
      out.write("    margin-left: -10px;\r\n");
      out.write("    border-right: 3px solid rgb(92, 115, 6);\r\n");
      out.write("    background-color: rgba(92, 115, 6, 0.43);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.top-header>form .search_box>input {\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    width: 340px;\r\n");
      out.write("    border: 1px;\r\n");
      out.write("    outline: 1px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -1px;\r\n");
      out.write("    left: 115px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    color: black;\r\n");
      out.write("    font-family: 'NanumSquareBold';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.top-header>form .search_box>img {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    width: 30px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    top: 0px;\r\n");
      out.write("    left: 92%;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* í¤ë ë´ íµë©ë´ */\r\n");
      out.write(".wrapper>header>.top-header>ul {\r\n");
      out.write("    /* border: 1px solid red; */\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: right;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.top-header>ul>li {\r\n");
      out.write("    /* border: 1px solid gray; */\r\n");
      out.write("    width: 110px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.top-header>ul>li>a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    left: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.top-header>ul>li>a>img{\r\n");
      out.write("    width: 20px;\r\n");
      out.write("    height: 18px;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-content: center;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -2.5px;\r\n");
      out.write("    left: -5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* navë¶ë¶ STYLE */\r\n");
      out.write(".wrapper>nav>.navi{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ì¼ìª½ nav one-depth */\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 60px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li>a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    width: 110px;\r\n");
      out.write("    /* transition: 1s; */\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ì¼ìª½ nav two-depth */\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li>.two--depth {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    display: none;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li>.two--depth>li {\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    line-height: 30px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li>.two--depth>li>a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 120px;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li>a:hover {\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li:hover .two--depth {\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_left>.one--depth>li>.two--depth>li>a:hover {\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    transition: 0.7s;\r\n");
      out.write("    color: rgb(192, 57, 43);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ì¤ë¥¸ìª½ nav one-depth */\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 60px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li>a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    width: 110px;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ì¤ë¥¸ìª½ nav two-depth */\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li>.two--depth {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li>.two--depth>li {\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    line-height: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li>.two--depth>li>a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 110px;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li>a:hover {\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li:hover .two--depth {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("    right: -12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.navi>.Menu_right>.one--depth>li>.two--depth>li>a:hover {\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    transition: 0.7s;\r\n");
      out.write("    color: rgb(192, 57, 43);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* header_line */\r\n");
      out.write(".wrapper>.header_line {\r\n");
      out.write("    display: block;\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    height: 3px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 5px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>#footer_logo{\r\n");
      out.write("    border: 1px solid;\r\n");
      out.write("    opacity: 0.6;\r\n");
      out.write("    margin-bottom: 500px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.log-header{\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}   \r\n");
      out.write("\r\n");
      out.write(".logheader_line{\r\n");
      out.write("    display: block;\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    height: 3px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* login header */\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.log-header>a>.logo{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.log-header>ul{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.log-header>ul>li{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    line-height: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.log-header>ul>li>a{\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    position: relative;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>header>.log-header>ul>li>a>img{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    width: 30px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    right: 70px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>nav>.mobilemenu{\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("li{\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join {\r\n");
      out.write("        width: 450px;\r\n");
      out.write("        display: block;\r\n");
      out.write("        height: 800px;\r\n");
      out.write("        padding-top: 50px;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join h1 {\r\n");
      out.write("        padding-top: 20px;\r\n");
      out.write("        font-size: 35px;\r\n");
      out.write("        color: #111;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join>form ul {\r\n");
      out.write("        padding: 40px 0 10px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .join>form ul li {\r\n");
      out.write("        padding: 0 0 12px;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join>form>ul>li>span{\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("        display: block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join>form ul li input {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 40px;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        text-indent: 15px;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        color: black;\r\n");
      out.write("        font-family: 'SDSamliphopangche_Basic';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join>form>ul>li #id_input, #addr_input{\r\n");
      out.write("        width: 75%;\r\n");
      out.write("        height: 40px;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        text-indent: 15px;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        color: black;\r\n");
      out.write("        font-family: 'SDSamliphopangche_Basic';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join form ul li input::-webkit-input-placeholder {\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        color: gray;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join form #idcheck_btn, #addr_btn{\r\n");
      out.write("        width: 82px;\r\n");
      out.write("        height: 40px;\r\n");
      out.write("        margin-left: 15px;\r\n");
      out.write("        margin-right: 0px;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join>form #join_btn {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 50px;\r\n");
      out.write("        background: #ed1c24;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        font-size: 22px;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        margin-top: 25px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join div {\r\n");
      out.write("        padding: 0 0 45px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join div ul {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: space-between;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join div ul li {\r\n");
      out.write("        position: relative;\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    .join div ul li:nth-child(2) {\r\n");
      out.write("        padding-right: 150px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .join div ul li:nth-child(2)::after {\r\n");
      out.write("        content: \"\";\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: -10px;\r\n");
      out.write("        top: 1px;\r\n");
      out.write("        height: 16px;\r\n");
      out.write("        width: 1.2px;\r\n");
      out.write("        background: #111;\r\n");
      out.write("        transform: rotate(25deg);\r\n");
      out.write("    }");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("/* footer */\r\n");
      out.write("\r\n");
      out.write("/* footer line */\r\n");
      out.write(".wrapper>footer>.footer_line {\r\n");
      out.write("    display: block;\r\n");
      out.write("    background-color: gray;\r\n");
      out.write("    height: 3px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 5px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* footer */\r\n");
      out.write(".wrapper>footer>div>.footer_menu {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    /* border: 1px solid; */\r\n");
      out.write("    height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>div>.footer_menu>li{\r\n");
      out.write("    /* border: 1px solid red; */\r\n");
      out.write("    width: 120px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    line-height: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>div>.footer_menu>li>a{\r\n");
      out.write("    font-family: 'SDSamliphopangche_Basic'; \r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>.Site_info{\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>.Site_info>#footer_logo{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -50px;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    width: 220px;\r\n");
      out.write("    height: 110px;\r\n");
      out.write("    opacity: 0.3;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>.Site_info>span{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    padding: 2px 40px 2px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper>footer>.Site_info>.Sitename{\r\n");
      out.write("    font-family: 'SDSamliphopangche_Basic'; \r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	document.addEventListener(\"DOMContentLoaded\", function() {\r\n");
      out.write("	    \r\n");
      out.write("		async function checkDuplicateId() {\r\n");
      out.write("			var id = document.getElementById(\"id_input\").value;\r\n");
      out.write("\r\n");
      out.write("			try {\r\n");
      out.write("				const response = await axios.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/checkDuplicate\", {\r\n");
      out.write("					id: id\r\n");
      out.write("				});\r\n");
      out.write("\r\n");
      out.write("				const isDuplicate = response.data;\r\n");
      out.write("				if (!isDuplicate) {\r\n");
      out.write("					alert(\"이미 사용 중인 아이디입니다.\");\r\n");
      out.write("				} else {\r\n");
      out.write("					alert(\"사용 가능한 아이디입니다.\");\r\n");
      out.write("				}\r\n");
      out.write("			} catch (error) {\r\n");
      out.write("				alert(\"중복 확인 중에 오류가 발생했습니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	    document.getElementById(\"idcheck_btn\").addEventListener(\"click\", checkDuplicateId);\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("		<!-- header -->\r\n");
      out.write("		<!-- top-header -->\r\n");
      out.write("		<header>\r\n");
      out.write("			<div class=\"log-header\">\r\n");
      out.write("				<a href=");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("><img class=\"logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/static/img/로고.png\" alt=\"\"></a>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/static/img/english.png\" alt=\"\">ENGLISH</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"logheader_line\"></div>\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		<section class=\"join\">\r\n");
      out.write("			<h1>워터멜론과 함께 하세요!</h1>\r\n");
      out.write("			<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/join\" method=\"post\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><span>ID</span> <!-- <span id=\"id_check\">*id중복여부표시</span> -->\r\n");
      out.write("						<input id=\"id_input\" name=\"id\" type=\"text\" placeholder=\"아이디\"\r\n");
      out.write("						title=\"아이디입력\" required>\r\n");
      out.write("						<button id=\"idcheck_btn\" >중복확인</button></li>\r\n");
      out.write("					<li><span>PW</span> <input id=\"pw_input\" name=\"pw\"\r\n");
      out.write("						type=\"password\" placeholder=\"비밀번호\" title=\"비밀번호입력\" required></li>\r\n");
      out.write("					<li><span>PW Check</span> <!-- <span id=\"pw_check\">*pw체크표시</span> -->\r\n");
      out.write("						<input id=\"pwc_input\" name=\"pwc_input\" type=\"password\"\r\n");
      out.write("						placeholder=\"비밀번호확인\" title=\"비밀번호확인\" required></li>\r\n");
      out.write("					<li><span>NAME</span> <input type=\"text\" name=\"name\"\r\n");
      out.write("						placeholder=\"이름\" title=\"이름입력\" required></li>\r\n");
      out.write("					<li><span>ADDRESS</span> <input id=\"addr_input\" name=\"addr\"\r\n");
      out.write("						type=\"text\" placeholder=\"주소\" title=\"주소입력\" required>\r\n");
      out.write("						<button id=\"addr_btn\">주소검색</button></li>\r\n");
      out.write("					<li><input type=\"text\" placeholder=\"동/호수 입력\" title=\"주소입력\"></li>\r\n");
      out.write("					<li><span>PHONE</span> <input type=\"text\" name=\"phone\"\r\n");
      out.write("						placeholder=\"핸드폰번호\" title=\"핸드폰번호입력\" required></li>\r\n");
      out.write("					<li><button id=\"join_btn\">JOIN!</button></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</form>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<footer>\r\n");
      out.write("			<div class=\"footer_line\"></div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<ul class=\"footer_menu\">\r\n");
      out.write("					<li><a href=\"\">이용약관</a></li>\r\n");
      out.write("					<li><a href=\"\">고객센터</a></li>\r\n");
      out.write("					<li><a href=\"\">제휴/프로모션</a></li>\r\n");
      out.write("					<li style=\"width:170px\"><a href=\"\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;개인정보처리방침</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<p></p>\r\n");
      out.write("			<div class=\"Site_info\">\r\n");
      out.write("				<img id=\"footer_logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/static/img/로고.png\" alt=\"\">\r\n");
      out.write("				<span class=\"Sitename\">(주)WATERMELON MUSIC</span> <span>대구광역시\r\n");
      out.write("					중구 중앙대로 366 반월센트럴타워 10층</span> <span>대표이사 : 윤치연, 김예솔, 이헌지, 최정기</span> <span>사업자등록번호\r\n");
      out.write("					: 024-04-02023</span> <br> <span>문의전화 : 1544-1111 (평일\r\n");
      out.write("					09:00-18:00)</span> <span>WATERMELON MUSIC으로 음악과 함께하는 즐거운 하루 보내세요!</span>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- <script>\r\n");
      out.write("		function checkDuplicate() {\r\n");
      out.write("			var id = document.getElementById(\"id_input\").value;\r\n");
      out.write("\r\n");
      out.write("			// 서버로 AJAX 요청을 보냄\r\n");
      out.write("			var xhr = new XMLHttpRequest();\r\n");
      out.write("			xhr.open(\"GET\",\r\n");
      out.write("					\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/checkDuplicate?id=\"\r\n");
      out.write("							+ encodeURIComponent(id), true);\r\n");
      out.write("			xhr.onreadystatechange = function() {\r\n");
      out.write("				if (xhr.readyState === XMLHttpRequest.DONE) {\r\n");
      out.write("					if (xhr.status === 200) {\r\n");
      out.write("						// 서버로부터 응답을 받은 경우\r\n");
      out.write("						var response = JSON.parse(xhr.responseText);\r\n");
      out.write("						if (response.duplicate) {\r\n");
      out.write("							alert(\"이미 사용중인 아이디입니다.\");\r\n");
      out.write("						} else {\r\n");
      out.write("							alert(\"사용가능한 아이디입니다.\");\r\n");
      out.write("						}\r\n");
      out.write("					} else {\r\n");
      out.write("						// 서버로부터 응답을 받지 못한 경우\r\n");
      out.write("						alert(\"서버와의 통신에 실패했습니다.\");\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			};\r\n");
      out.write("			xhr.send();\r\n");
      out.write("		}\r\n");
      out.write("	</script> -->\r\n");
      out.write("	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/axios/1.4.0/axios.min.js\" integrity=\"sha512-uMtXmF28A2Ab/JJO2t/vYhlaa/3ahUOgj1Zf27M5rOo8/+fcTUVH0/E0ll68njmjrLqOBjXM3V9NiPFL5ywWPQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	const join_btn_el = document.querySelector('.join_btn');\r\n");
      out.write("    join_btn_el.addEventListener('click', function () {\r\n");
      out.write("        axios.post('http://localhost:8080/app/member/join')\r\n");
      out.write("        .then(response=>{\r\n");
      out.write("            console.log(\"join Success\");\r\n");
      out.write("            console.log(response);\r\n");
      out.write("            console.log(response.data);\r\n");
      out.write("            window.location.href = 'http://localhost:8080/app/member/login'\r\n");
      out.write("        })\r\n");
      out.write("        .catch(error=>{});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/member/join.jsp(53,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/index");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
