<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>欢迎亲爱的:<strong >${currentUser.userName}</strong> 用户！</h2>
<table class="table table-hover">
	<caption>银行账号</caption>
	<thead>
	<tr>
		<th>#</th>
		<th>银行卡号</th>
		<th>银行</th>
		<th>余额</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="account" items="${currentUser.accountList}" varStatus="num">
		<tr>
			<td>${num.count}</td>
			<td>${account.bankCard}</td>
			<td>${account.bank}</td>
			<td>${account.balance}</td>
			<td>
				<button type="button" class="btn btn-link"><a href="${pageContext.request.contextPath}/record?action=getRecordList&account_id=${account.accountId}&page_num=1&pageSize=10">查看记录</a></button>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>