/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-26 11:13:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mybaoxiao_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>添加附件</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"skin/css/base.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"static/js/jquery-1.7.2.js\"></script>\r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\" src=\"My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("\t<script type=\"application/javascript\">\r\n");
      out.write("\t\tfunction commit(){\r\n");
      out.write("            $(\"#form9\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(function () {\r\n");
      out.write("            $(\"#money\").blur(function () {\r\n");
      out.write("                var r=/^[1-9][0-9]+$/gi;\r\n");
      out.write("                if (!r.test( $(\"#money\").val())){\r\n");
      out.write("                    $(\"#sp\").text(\"必须为数值\").css(\"color\",\"red\");\r\n");
      out.write("                    $(this).focus();\r\n");
      out.write("                }else{\r\n");
      out.write("                    $(\"#sp\").text(\"格式正确\").css(\"color\",\"green\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='skin/images/allbg.gif'>\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"skin/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"58%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td >\r\n");
      out.write("    当前位置:报销管理>>添加新的报销\r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=\"form2\" action=\"bx/saveInfo\" id=\"form9\" method=\"post\">\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("<tr bgcolor=\"#E7E7E7\">\r\n");
      out.write("\t<td height=\"24\" colspan=\"2\" background=\"skin/images/tbg.gif\">&nbsp;添加新的报销单&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">支出类型：</td>\r\n");
      out.write("\t<td  align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("\t\t<select name=\"paymode\">\r\n");
      out.write("\t\t\t<option value=\"出差票据\">出差票据</option>\r\n");
      out.write("\t\t\t<option value=\"办公采购\">办公采购</option>\r\n");
      out.write("\t\t\t<option value=\"其他\">其他</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">总金额：</td>\r\n");
      out.write("\t<td  align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("\t\t<input id=\"money\" size=\"26\" name=\"totalmoney\"/><span id=\"sp\"></span>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">使用时间：</td>\r\n");
      out.write("\t<td  align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("\t\t<input id=\"d18\" name=\"bxtime\" type=\"text\"/>\r\n");
      out.write("\t\t<img onclick=\"WdatePicker({el:'d18','skin':'green','minDate':'%y-%M-%d'})\" src=\"My97DatePicker/skin/datePicker.gif\" width=\"16\" height=\"22\" align=\"absmiddle\">\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" >备注：</td>\r\n");
      out.write("\t<td colspan=3 align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" >\r\n");
      out.write("\t\t<textarea rows=10 cols=130 name=\"bxremark\"></textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#FAFAF1\">\r\n");
      out.write("<td height=\"28\" colspan=4 align=center>\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("\t<a href=\"javascript:commit()\" class=\"coolbg\">保存</a>\r\n");
      out.write("\t<a href=\"project-file.jsp\" class=\"coolbg\">返回</a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
