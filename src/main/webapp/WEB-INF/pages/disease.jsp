<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<table class="table table-bordered table-custom ">
	<c:choose>
		<c:when test="${!empty listdto}">
			<thead class="thead-light">
				<tr>

					<th>Name</th>
					<th>Video</th>
					<th>Images</th>
					<th>Discriptions</th>



				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${listdto}">
					<tr>
						<td>${user.name}</td>
						<td>${user.videos}</td>
						<td>${user.images}</td>
						<td>${user.discriptions}</td>

					</tr>
				</c:forEach>
</table>
</c:when>

<c:otherwise>
	<tbody>
		<tr>
			<td>No Records Found</td>
		</tr>
	</tbody>
</c:otherwise>

</c:choose>



