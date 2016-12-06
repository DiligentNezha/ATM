<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<%@include file="../common/bootstrap3.0.0_head.html" %>
	<title>Login</title>
</head>
<body>
<div class="container-fluid">
	<div class="header" style="height: 60px;">
	</div>
	<div class="row">
		<div class="col-md-2 col-md-offset-2">
			<div class="bs-docs-section">
				<ul class="nav nav-pills nav-stacked" role="tablist" style="max-width: 300px;">
					<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/user?action=showUserInfo">个人信息</a></li>
					<li role="presentation"><a href="${pageContext.request.contextPath}/account?action=saveMoneyPrepare">存钱</a></li>
					<li role="presentation"><a href="${pageContext.request.contextPath}/account?action=drawMoneyPrepare">取钱</a></li>
					<li role="presentation"><a href="${pageContext.request.contextPath}/user?action=logout">退出</a></li>
				</ul>
			</div>
		</div>
		<div class="col-md-6">
			<jsp:include page="${dataPage}"></jsp:include>
		</div>
	</div>
<%@include file="../common/bootstrap3.0.0_body.html" %>
</body>
</html>
