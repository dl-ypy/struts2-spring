<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:form action="user_save" namespace="/user" method="post">
    	<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:textfield name="realname" label="真实姓名"></s:textfield>
		
		<s:select list="deptList.{?#this.pid==7}" name="deptid" listKey="bid" listValue="name" label="部门"></s:select>
   		<s:checkboxlist list="roleList" name="roleIds" listKey="roleid" listValue="rolename" label="权限"></s:checkboxlist>
    	<s:submit value="提交"></s:submit>
    </s:form>
  </body>
</html>
