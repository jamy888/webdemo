<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>注册页面</title>
	</head>
	<body>
		<s:url action="register" namespace="/user" var="register"></s:url>
		注册页面
		<form action="<s:property value='register' />" method="post">
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
					<td>昵称：</td>
					<td><input type="text" name="user.name" />
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="注册" />
						<input type="reset" value="重置" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>