<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<table class="table table-bordered table-custom ">
				<c:choose>
					<c:when test="${!empty listdto}">
						<thead class="thead-light">
							<tr>
								<th>Hospital Name</th>
								<th>Doctor Name</th>
								<th>Address</th>
								<th>Gender</th>
								<th>City</th>
								<th>Qulification</th>
							<!-- 	<th>speciality</th>
								<th>hospital_name</th>
								<th>Action</th>
							 -->	
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${listdto}">
								<tr>
									<td>${user.hospital_name}</td>
									<td>${user.doctor_name}</td>
									<td>${user.gender}</td>
									<td>${user.hospital_address}</td>
									<td>${user.city}</td>
									<td>${user.qulification}</td>
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
				
				
				
				
				
				
			<%-- 	<form:form method="POST" modelAttribute="doccmd">
				
				<form:input path="did"  value="${docmd.did }" disabled="true"/><br>
				
				<form:input path="doctor_name" value="${doccmd. doctor_name}"/><br>
				
				<form:input path="doctor__photo"/>
				</form:form>
 --%>