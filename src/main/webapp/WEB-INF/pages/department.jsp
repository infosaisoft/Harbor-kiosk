<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>





<form:form method="POST" modelAttribute="department">  	
  Department Name::<form:input path="dptName" />
  Department Location::<form:input path="dptLocation" />

	<input type="button" value="Add">

</form:form>