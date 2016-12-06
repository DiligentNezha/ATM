<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
	function getSelectAccount() {
	    var accountId = $("#select_account option:selected").val();
      $("#account_id").val(accountId);
  }
</script>
<form class="form-inline" role="form" method="post" action="${pageContext.request.contextPath}/account?action=saveMoney">
	<div class="form-group">
		<select class="form-control" id="select_account" onchange="getSelectAccount()" contenteditable="true">
			<option>请选择银行卡</option>
			<c:forEach var="account" items="${currentUser.accountList}">
				<option value="${account.accountId}">${account.bank}:${account.bankCard}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label>存款金额:</label>
		<input type="hidden" id="account_id" name="account_id"/>
		<input type="text" class="form-control" name="amount" placeholder="amount">
	</div>
	<button type="submit" class="btn btn-default">存款</button>
	<strong style="color: #449d44;">${message}</strong>
</form>
