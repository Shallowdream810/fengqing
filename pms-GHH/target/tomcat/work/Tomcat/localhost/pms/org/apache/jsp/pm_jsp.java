/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-30 11:37:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>用户管理</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/docs.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/layer/layer.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/jquery.ztree.all-3.5.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/skin/css/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/zTreeStyle.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("       $(function(){\r\n");
      out.write("\t     var setting = {\r\n");
      out.write("\t         //发送ajax请求，拿到返回jeson数组\r\n");
      out.write("\t\t\t\tasync: {\r\n");
      out.write("\t\t\t\t    type:\"get\",\r\n");
      out.write("\t\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\t\turl:\"sou/sourcelist\",\r\n");
      out.write("\t\t\t\t\tautoParam:[\"id\", \"name=n\", \"level=lv\"]\r\n");
      out.write("\t\t\t\t },\r\n");
      out.write("\t\t\t\tview: {\r\n");
      out.write("\t\t\t\t\taddHoverDom: function(treeId, treeNode){\r\n");
      out.write("\t\t\t\t\t\tvar aObj = $(\"#\" + treeNode.tId + \"_a\"); // tId = permissionTree_1, ==> $(\"#permissionTree_1_a\")\r\n");
      out.write("\t\t\t\t\t\tif (treeNode.editNameFlag || $(\"#btnGroup\"+treeNode.tId).length>0) return;\r\n");
      out.write("\t\t\t\t\t\tvar s = '<span id=\"btnGroup'+treeNode.tId+'\">';\r\n");
      out.write("\t\t\t\t\t\t// 一级菜单\r\n");
      out.write("\t\t\t\t\t\tif ( treeNode.level == 0 ) {\r\n");
      out.write("\t\t\t\t\t\t\ts += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" onclick=\"addNode('+treeNode.id+')\" href=\"javascript:void(0)\" >&nbsp;&nbsp;<i class=\"fa fa-fw fa-plus rbg \"></i></a>';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t//二级菜单\r\n");
      out.write("\t\t\t\t\t\telse if ( treeNode.level == 1 ) {\r\n");
      out.write("\t\t\t\t\t\t\ts += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\"  onclick=\"editNode('+treeNode.id+')\" href=\"javascript:void(0)\" title=\"修改权限信息\">&nbsp;&nbsp;<i class=\"fa fa-fw fa-edit rbg \"></i></a>';\r\n");
      out.write("\t\t\t\t\t\t\t//有无子节点\r\n");
      out.write("\t\t\t\t\t\t\tif (treeNode.children.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\ts += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" onclick=\"deleteNode('+treeNode.id+')\" href=\"javascript:void(0)\" >&nbsp;&nbsp;<i class=\"fa fa-fw fa-times rbg \"></i></a>';\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\ts += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" onclick=\"addNode('+treeNode.id+')\" href=\"javascript:void(0)\" >&nbsp;&nbsp;<i class=\"fa fa-fw fa-plus rbg \"></i></a>';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t//三级菜单\r\n");
      out.write("\t\t\t\t\t\telse if ( treeNode.level == 2 ) {\r\n");
      out.write("\t\t\t\t\t\t\ts += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\"  onclick=\"editNode('+treeNode.id+')\" href=\"javascript:void(0)\" title=\"修改权限信息\">&nbsp;&nbsp;<i class=\"fa fa-fw fa-edit rbg \"></i></a>';\r\n");
      out.write("\t\t\t\t\t\t\ts += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" onclick=\"deleteNode('+treeNode.id+')\" href=\"javascript:void(0)\">&nbsp;&nbsp;<i class=\"fa fa-fw fa-times rbg \"></i></a>';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\ts += '</span>';\r\n");
      out.write("\t\t\t\t\t\taObj.after(s);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tremoveHoverDom: function(treeId, treeNode){\r\n");
      out.write("\t\t\t\t\t\t$(\"#btnGroup\"+treeNode.tId).remove();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t  };\r\n");
      out.write("\t     //就绪函数中初始化容器\r\n");
      out.write("           $.fn.zTree.init($(\"#permissionTree\"), setting);\r\n");
      out.write("      });\r\n");
      out.write("        //添加节点\r\n");
      out.write("       function addNode(id){\r\n");
      out.write("    \t   window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pm-add.jsp?id=\"+id;\r\n");
      out.write("       }\r\n");
      out.write("       //编辑节点 更新节点\r\n");
      out.write("       function editNode(id) {\r\n");
      out.write("       \t   window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sou/findInfo/\"+id;\r\n");
      out.write("       }\r\n");
      out.write("       //删除节点\r\n");
      out.write("       function deleteNode(id){\r\n");
      out.write("    \t   layer.confirm(\"删除资源信息, 是否继续\",  {icon: 3, title:'提示'}, function(cindex){\r\n");
      out.write("\t\t\t\t// 删除选择的用户信息\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\turl  : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/auth/delete\",\r\n");
      out.write("\t\t\t\t\tdata : {id : id},\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\tif (result.success ) {\r\n");
      out.write("\t\t\t\t\t\t\t// 刷新数据\r\n");
      out.write("\t\t\t\t\t\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"permissionTree\");\r\n");
      out.write("\t\t\t\t\t\t\ttreeObj.reAsyncChildNodes(null, \"refresh\");\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("                           layer.msg(\"资源信息删除失败\", {time:2000, icon:5, shift:6}, function(){\r\n");
      out.write("                           });\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tlayer.close(cindex);\r\n");
      out.write("\t\t\t},function(cindex){\r\n");
      out.write("\t\t\t    layer.close(cindex);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("       }\r\n");
      out.write("</script>\r\n");
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
      out.write("    当前位置:权限管理>>权限维护\r\n");
      out.write(" </td>\r\n");
      out.write(" <td>\r\n");
      out.write("\r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  内容列表   -->\r\n");
      out.write("<form name=\"form2\">\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("<tr bgcolor=\"#E7E7E7\">\r\n");
      out.write("\t<td height=\"24\" colspan=\"12\" background=\"skin/images/tbg.gif\">&nbsp;权限列表&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr align=\"center\" bgcolor=\"#FAFAF1\" height=\"22\">\r\n");
      out.write("\t <td>\r\n");
      out.write("     <div class=\"panel-body\">\r\n");
      out.write("           <ul id=\"permissionTree\" class=\"ztree\"></ul>\r\n");
      out.write("\t </div>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
