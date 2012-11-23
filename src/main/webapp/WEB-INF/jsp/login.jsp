<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>登录页面</title>
	</head>
	<body>
		<s:url action="login" namespace="/user" var="login"></s:url>
		登录页面
		<form action="<s:property value='login' />" method="post">
			<table>
				<tr>
					<td>登录名：</td>
					<td><input type="text" name="user.loginName" />
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="text" name="user.password" />
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="登录" />
						<input type="reset" value="重置" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>