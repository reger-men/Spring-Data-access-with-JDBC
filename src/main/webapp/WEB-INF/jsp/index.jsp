<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-bordered" style="width: 50%">
	<thead>
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach items = "${users}" var="user">
			<tr>
				<td>
					${user.name}
				</td>
			

				<td>
					${user.age}
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
