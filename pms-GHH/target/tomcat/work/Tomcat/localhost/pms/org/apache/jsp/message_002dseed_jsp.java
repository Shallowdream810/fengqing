/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-29 13:42:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_002dseed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>发信息</title>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"static/js/jquery-1.7.2.js\"></script>\r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\" src=\"My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\turl:\"sys/findemail\",\r\n");
      out.write("\t\t\tsuccess:function (msg) {\r\n");
      out.write("\t\t\t\t$(msg).each(function (index,item) {\r\n");
      out.write("\t\t\t\t\tvar option = \"<option value='\"+item.email+\"'>\"+item.ename+\"</option>\"\r\n");
      out.write("\t\t\t\t\t$(\"#person\").append(option)\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("\t\t})\r\n");
      out.write("    });\r\n");
      out.write("    function commit() {\r\n");
      out.write("\r\n");
      out.write("        var  person = $(\"#person\").val();\r\n");
      out.write("        var title = $(\"#title\").val();\r\n");
      out.write("        var  content = $(\"#content\").val();\r\n");
      out.write("        var files = $(\"#files\")[0].files[0];\r\n");
      out.write("        var sendtime = $(\"#d12\").val();\r\n");
      out.write("\t\tvar formData = new FormData();\r\n");
      out.write("\t\tformData.append(\"ename\",person);\r\n");
      out.write("        formData.append(\"title\",title);\r\n");
      out.write("        formData.append(\"content\",content);\r\n");
      out.write("        formData.append(\"files\",files);\r\n");
      out.write("        formData.append(\"sendtime\",sendtime);\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type:\"post\",\r\n");
      out.write("            url:\"ema/saveInfo\",\r\n");
      out.write("            data:formData,\r\n");
      out.write("            caches:false,\r\n");
      out.write("            processData:false,\r\n");
      out.write("            contentType:false,\r\n");
      out.write("            success:function (msg) {\r\n");
      out.write("                alert(\"发送成功\")\r\n");
      out.write("                window.location.href=\"message.jsp\";\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"skin/css/base.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='skin/images/allbg.gif'>\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"skin/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"58%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td >\r\n");
      out.write("    当前位置:信息箱>>发信息\r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<form name=\"form2\" action=\"javascript:void(0)\">\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("<tr bgcolor=\"#E7E7E7\">\r\n");
      out.write("\t<td height=\"24\" colspan=\"2\" background=\"skin/images/tbg.gif\">&nbsp;发信息&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">收件人：</td>\r\n");
      out.write("\t<td  align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("\t\t<select name=\"ename\" id=\"person\">\r\n");
      out.write("\t\t</select></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">标题：</td>\r\n");
      out.write("\t<td  align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("        <input id=\"title\" name=\"title\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("    <td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">发送时间：</td>\r\n");
      out.write("    <td  align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("        <input id=\"d12\" name=\"sendtime\" type=\"text\"/>\r\n");
      out.write("        <img onclick=\"WdatePicker({el:'d12','skin':'green','minDate':'%y-%M-%d'})\" src=\"My97DatePicker/skin/datePicker.gif\" width=\"16\" height=\"22\" align=\"absmiddle\">\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" height=\"22\">内容：</td>\r\n");
      out.write("\t<td align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
      out.write("        <textarea id=\"content\" name=\"content\" rows=15 cols=130></textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td align=\"right\" bgcolor=\"#FAFAF1\" >附件：</td>\r\n");
      out.write("\t<td colspan=3 align='left' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" >\r\n");
      out.write("\t\t<input id=\"files\" name=\"files\" type=\"file\"/>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"#FAFAF1\">\r\n");
      out.write("<td height=\"28\" colspan=4 align=center>\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("\t<a href=\"javascript:commit()\" class=\"coolbg\">保存</a>\r\n");
      out.write("</td>\r\n");
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