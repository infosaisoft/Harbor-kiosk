<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="content-bg">
	<div class="container">
		<h2 class="formHead text-center mb-3">My Hospital</h2>
		<div class="row">
			<div class="col">
				<div class="form-group">
					<label> Name</label>
				</div>
				<div>${hoscmd.name}</div>

				<div class="form-group">
					<label> Address</label>
				</div>
				<div>${hoscmd.address}</div>


				<div class="form-group">
					<label> City</label>
				</div>
				<div>${hoscmd.city}</div>

				<div class="form-group">
					<label> State</label>
				</div>
				<div>${hoscmd.state}</div>

				<div class="form-group">
					<label> Pincode</label>
				</div>
				<div>${hoscmd.pincode}</div>

				<div class="form-group">
					<label> Reg_Number</label>
				</div>
				<div>${hoscmd.reg_number}</div>


				<div class="form-group">
					<label> Logo</label>
				</div>
				<div><img src="assert/${hoscmd.logo}" /></div>

				<div class="form-group">
					<label> Contact</label>
				</div>
				<div>${hoscmd.contact}</div>


			</div>
		</div>
	</div>
</section>



<table class="table table-bordered table-custom ">
	<c:choose>
		<c:when test="${!empty listdto}">
			<thead class="thead-light">
				<tr>

					<th>Doctor Name</th>
					<th>Address</th>
					<th>Gender</th>
					<th>City</th>
					<th>State</th>
					<th>Qulification</th>
					<th>Email</th>



				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${listdto}">
					<tr>
						<td>${user.doctor_name}</td>
						<td>${user.hospital_address}</td>
						<td>${user.gender}</td>
						<td>${user.city}</td>
						<td>${user.state}</td>
						<td>${user.qulification}</td>
						<td>${user.email}</td>
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




<table class="table table-bordered table-custom ">
	<c:choose>
		<c:when test="${!empty listdto}">
			<thead class="thead-light">
				<tr>

					<th> Name</th>
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








