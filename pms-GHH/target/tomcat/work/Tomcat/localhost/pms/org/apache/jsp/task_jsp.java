/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-25 00:35:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class task_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>任务信息</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"skin/css/base.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='skin/images/allbg.gif'>\r\n");
      out.write("\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"skin/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"58%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td >\r\n");
      out.write("    当前位置:任务管理>>任务信息\r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<!--  搜索表单  -->\r\n");
      out.write("<form name='form3' action='' method='get'>\r\n");
      out.write("<input type='hidden' name='dopost' value='' />\r\n");
      out.write("<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("  <tr bgcolor='#EEF4EA'>\r\n");
      out.write("    <td background='skin/images/wbg.gif' align='center'>\r\n");
      out.write("      <table border='0' cellpadding='0' cellspacing='0'>\r\n");
      out.write("        <tr> <td width='90' align='center'>状态：</td>\r\n");
      out.write("          <td width='160'>\r\n");
      out.write("          <select name='cid' style='width:150'>\r\n");
      out.write("          <option value='0'>请选择</option>\r\n");
      out.write("          \t<option value='1'>未开始</option>\r\n");
      out.write("          \t<option value='1'>进行中</option>\r\n");
      out.write("          \t<option value='1'>已完成</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </td>\r\n");
      out.write("          <td width='90' align='center'>搜索条件：</td>\r\n");
      out.write("          <td width='160'>\r\n");
      out.write("          <select name='cid' style='width:150'>\r\n");
      out.write("          <option value='0'>选择类型...</option>\r\n");
      out.write("          \t<option value='1'>任务标题</option>\r\n");
      out.write("          \t<option value='1'>执行者</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width='70'>\r\n");
      out.write("          关键字：\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width='160'>\r\n");
      out.write("          \t<input type='text' name='keyword' value='' style='width:120px' />\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width='110'>\r\n");
      out.write("    \t\t<select name='orderby' style='width:120px'>\r\n");
      out.write("            <option value='id'>排序...</option>\r\n");
      out.write("            <option value='pubdate'>开始时间</option>\r\n");
      out.write("            <option value='pubdate'>结束时间</option>\r\n");
      out.write("      \t</select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("          &nbsp;&nbsp;&nbsp;<input name=\"imageField\" type=\"image\" src=\"skin/images/frame/search.gif\" width=\"45\" height=\"20\" border=\"0\" class=\"np\" />\r\n");
      out.write("        </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<!--  内容列表   -->\r\n");
      out.write("<form name=\"form2\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("<tr bgcolor=\"#E7E7E7\">\r\n");
      out.write("\t<td height=\"24\" colspan=\"12\" background=\"skin/images/tbg.gif\">&nbsp;任务信息&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr align=\"center\" bgcolor=\"#FAFAF1\" height=\"22\">\r\n");
      out.write("\t<td width=\"4%\">选择</td>\r\n");
      out.write("\t<td width=\"6%\">序号</td>\r\n");
      out.write("\t<td width=\"10%\">任务标题</td>\r\n");
      out.write("\t<td width=\"10%\">执行者</td>\r\n");
      out.write("\t<td width=\"8%\">状态</td>\r\n");
      out.write("\t<td width=\"8%\">优先级</td>\r\n");
      out.write("\t<td width=\"8%\">开始时间</td>\r\n");
      out.write("\t<td width=\"8%\">结束时间</td>\r\n");
      out.write("\t<td width=\"15%\">操作</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr align='center' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\" >\r\n");
      out.write("\t<td><input name=\"id\" type=\"checkbox\" id=\"id\" value=\"101\" class=\"np\"></td>\r\n");
      out.write("\t<td>1</td>\r\n");
      out.write("\t<td>完成用户信息增删改查</td>\r\n");
      out.write("\t<td align=\"center\">某某某</td>\r\n");
      out.write("\t<td align=\"center\">进行中...</td>\r\n");
      out.write("\t<td align=\"center\">高</td>\r\n");
      out.write("\t<td>2015-02-03</td>\r\n");
      out.write("\t<td>2015-02-15</td>\r\n");
      out.write("\t<td><a >开始任务</a> | <a >任务完成</a> | <a href=\"task-edit.jsp\">编辑</a> | <a href=\"task-look.jsp\">查看详情</a></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#FAFAF1\">\r\n");
      out.write("<td height=\"28\" colspan=\"12\">\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("\t<a href=\"\" class=\"coolbg\">全选</a>\r\n");
      out.write("\t<a href=\"\" class=\"coolbg\">反选</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<a href=\"\" class=\"coolbg\">&nbsp;删除&nbsp;</a>\r\n");
      out.write("\t<a href=\"\" class=\"coolbg\">&nbsp;导出Excel&nbsp;</a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr align=\"right\" bgcolor=\"#EEF4EA\">\r\n");
      out.write("\t<td height=\"36\" colspan=\"12\" align=\"center\"><!--翻页代码 --></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
