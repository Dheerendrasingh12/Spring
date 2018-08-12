<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${not empty result}">
		<table>
			<tr>
				<th>NO</th>
				<th>Name</th>
				<th>Job</th>
				<th>Salary</th>

			</tr>
			<c:forEach var="map" items="${result}">
				<tr>
					<td><c:out value="${map.EMPNO }" /></td>
					<td><c:out value="${map.ENAME }" /></td>
					<td><c:out value="${map.JOB }"></c:out></td>
					<td><c:out value="${map.SALARY }"></c:out>
				</tr>

			</c:forEach>
		</table>


	</c:when>
	<c:otherwise>
	No Employee Found
	</c:otherwise>



</c:choose>