<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--record--%>
<div class="table table-striped">
	<table class="table">
		<thead>
		<tr>
			<th>#</th>
			<th>类型</th>
			<th>金额</th>
			<th>日期</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="record" items="${recordList}" varStatus="num">
			<tr>
				<td>${num.count}</td>
				<c:forEach var="actionType" items="${actionTypeMap}">
					<c:if test="${actionType.key == record.actionType}">
						<td>${actionType.value}</td>
					</c:if>
				</c:forEach>
				<td>${record.amount}</td>
				<td>${record.date}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>

<%--分页--%>
<nav>
	<ul class="pagination">
		<li class="disabled"><a href="#">«</a></li>
		<c:forEach var="i" begin="1" end="${recordCount == 0 ? 0 : recordCount / 10 + 1}" varStatus="num">
			<c:if test="${pageNum == num.count}">
				<li class="active"><a href="${pageContext.request.contextPath}/record?action=getRecordList&account_id=${accountId}&page_num=${num}&pageSize=10">${num.count}<span class="sr-only">(current)</span></a></li>
			</c:if>
			<c:if test="${pageNum != num.count}">
				<li><a href="${pageContext.request.contextPath}/record?action=getRecordList&account_id=${accountId}&page_num=${num.count}&pageSize=10">${num.count}</a></li>
			</c:if>
		</c:forEach>
	</ul>
</nav>