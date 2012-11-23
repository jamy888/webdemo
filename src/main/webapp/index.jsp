<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>首页</title>
	</head>
	<body>
		<s:url action="toRegister" namespace="/user" var="toRegister"></s:url>
		<s:url action="toLogin" namespace="/user" var="toLogin"></s:url>
		<a href="<s:property value='toRegister' />">注册</a>
		<br />
		<a href="<s:property value='toLogin' />">登录</a>
	</body>
</html>
