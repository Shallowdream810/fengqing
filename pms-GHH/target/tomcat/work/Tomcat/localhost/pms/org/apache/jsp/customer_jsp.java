/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-27 15:24:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\">\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");

    String bath = request.getContextPath();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("    <title>客户信息管理</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"skin/css/base.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(bath);
      out.write("/static/js/jquery-1.7.2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function choseAll() {\r\n");
      out.write("            $(\"input:checkbox\").prop(\"checked\", \"checked\");\r\n");
      out.write("        }\r\n");
      out.write("        function invert() {\r\n");
      out.write("            $(\"input:checkbox\").each(function () {\r\n");
      out.write("                var b = $(this).prop(\"checked\");\r\n");
      out.write("                $(this).prop(\"checked\", !b);\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("// 批量删除\r\n");
      out.write("        function deletebyId() {\r\n");
      out.write("            var ids = \"\";\r\n");
      out.write("            $(\"input:checkbox:checked\").each(function () {\r\n");
      out.write("                var id = $(this).val();\r\n");
      out.write("                ids = ids + id + \",\";\r\n");
      out.write("            })\r\n");
      out.write("            ids = ids.substring(0, ids.length - 1);\r\n");
      out.write("            if (ids.length = null || ids == \"\") {\r\n");
      out.write("                alert(\"请选择要删除的数据\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            if (confirm(\"确定要删除所选择的数据么\")){\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    type: \"post\",\r\n");
      out.write("                    url: \"");
      out.print(bath);
      out.write("/cust/delete/\" + ids,\r\n");
      out.write("                    data: {\"_method\": \"delete\"},\r\n");
      out.write("                    success: function (msg) {\r\n");
      out.write("                        alert(msg.msage);\r\n");
      out.write("                        window.location.href = \"");
      out.print(bath);
      out.write("/cust/list\";\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        // 导出excel表格\r\n");
      out.write("        function exportExcel() {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"get\",\r\n");
      out.write("                url:\"cust/exportExcel\",\r\n");
      out.write("                success:function (msg) {\r\n");
      out.write("                    if (msg.statue == 200){\r\n");
      out.write("                        alert(msg.message1);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        function importExcel() {\r\n");
      out.write("            var file =  $(\"#file\")[0].files[0];\r\n");
      out.write("            var formdata = new  FormData()\r\n");
      out.write("            formdata.append(\"file\",file);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"post\",\r\n");
      out.write("                url:\"cust/importExcel\",\r\n");
      out.write("                data:formdata,\r\n");
      out.write("                cache:false,\r\n");
      out.write("                processData:false,\r\n");
      out.write("                contentType:false,\r\n");
      out.write("                success:function (msg) {\r\n");
      out.write("                    if (msg.status == 200){\r\n");
      out.write("                        alert(msg.message);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='skin/images/allbg.gif'>\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"26\" background=\"skin/images/newlinebg3.gif\">\r\n");
      out.write("            <table width=\"58%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        当前位置:客户信息管理>>客户信息\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type='button' class=\"coolbg np\" onClick=\"location='customer-add.jsp';\" value='添加客户信息'/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!--  搜索表单  -->\r\n");
      out.write("<form name='form3' action='");
      out.print(bath);
      out.write("/cust/search' method='get'>\r\n");
      out.write("    <input type='hidden' name='dopost' value=''/>\r\n");
      out.write("    <table width='98%' border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align=\"center\"\r\n");
      out.write("           style=\"margin-top:8px\">\r\n");
      out.write("        <tr bgcolor='#EEF4EA'>\r\n");
      out.write("            <td background='skin/images/wbg.gif' align='center'>\r\n");
      out.write("                <table border='0' cellpadding='0' cellspacing='0'>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td width='90' align='center'>搜索条件：</td>\r\n");
      out.write("                        <td width='160'>\r\n");
      out.write("                            <select name='cid' style='width:150px'>\r\n");
      out.write("                                <option value='0'>选择类型...</option>\r\n");
      out.write("                                <option value='1'>公司名称</option>\r\n");
      out.write("                                <option value='2'>联系人姓名</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td width='70'>\r\n");
      out.write("                            关键字：\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td width='160'>\r\n");
      out.write("                            <input type='text' name='keyword' value='' style='width:120px'/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td width='110'>\r\n");
      out.write("                            <select name='orderby' style='width:120px'>\r\n");
      out.write("                                <option value='0'>默认</option>\r\n");
      out.write("                                <option value='1'>降序</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            &nbsp;&nbsp;&nbsp;<input id=\"imageField\" name=\"imageField\" type=\"image\"\r\n");
      out.write("                                                     src=\"skin/images/frame/search.gif\" width=\"45\" height=\"20\"\r\n");
      out.write("                                                     border=\"0\" class=\"np\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("<!--  内容列表   -->\r\n");
      out.write("<form name=\"form2\">\r\n");
      out.write("\r\n");
      out.write("    <table width=\"98%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\"\r\n");
      out.write("           style=\"margin-top:8px\">\r\n");
      out.write("        <tr bgcolor=\"#E7E7E7\">\r\n");
      out.write("            <td height=\"24\" colspan=\"12\" background=\"skin/images/tbg.gif\">&nbsp;需求列表&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr align=\"center\" bgcolor=\"#FAFAF1\" height=\"22\">\r\n");
      out.write("            <td width=\"4%\">选择</td>\r\n");
      out.write("            <td width=\"6%\">序号</td>\r\n");
      out.write("            <td width=\"10%\">联系人</td>\r\n");
      out.write("            <td width=\"10%\">公司名称</td>\r\n");
      out.write("            <td width=\"8%\">添加时间</td>\r\n");
      out.write("            <td width=\"8%\">联系电话</td>\r\n");
      out.write("            <td width=\"10%\">操作</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <tr bgcolor=\"#FAFAF1\">\r\n");
      out.write("            <td height=\"28\" colspan=\"12\">\r\n");
      out.write("                &nbsp;\r\n");
      out.write("                <a href=\"javascript:choseAll()\" class=\"coolbg\">全选</a>\r\n");
      out.write("                <a href=\"javascript:invert()\" class=\"coolbg\">反选</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <a href=\"javascript:deletebyId()\" class=\"coolbg\">&nbsp;删除&nbsp;</a>\r\n");
      out.write("                <a href=\"javascript:exportExcel()\" class=\"coolbg\">&nbsp;导出Excel&nbsp;</a>\r\n");
      out.write("                &nbsp;&nbsp;&nbsp;<input id=\"file\"  type=\"file\"/>\r\n");
      out.write("                <button onclick=\"importExcel()\">导入</button>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr align=\"right\" bgcolor=\"#EEF4EA\">\r\n");
      out.write("            <td height=\"36\" colspan=\"12\" align=\"center\"><!--翻页代码 --></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /customer.jsp(157,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/customer.jsp(157,8) '${custlist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${custlist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /customer.jsp(157,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    // /customer.jsp(157,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr align='center' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\"\r\n");
          out.write("                onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\">\r\n");
          out.write("                <td><input name=\"id\" type=\"checkbox\" id=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"np\"></td>\r\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.companyperson}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                <td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.comname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                <td>\r\n");
          out.write("                    ");
          if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.comphone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                <td><a href=\"cust/findById/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">编辑</a> | <a href=\"cust/detail/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">查看详情</a></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /customer.jsp(165,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.addtime}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /customer.jsp(165,20) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }
}
