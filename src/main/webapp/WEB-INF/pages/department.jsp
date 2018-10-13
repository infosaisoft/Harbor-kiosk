<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="POST" modelAttribute="department">

<div>
Department Name::<form:select path="dptName" >
<form:options items="${deptname}"/>
</form:select>
</div>

<div>
Department Location::<form:select path="dptLocation" >
<form:options items="${deptlocation}"/>
</form:select>
</div>


<input type="submit" value="RegistrationDepartment">
</form:form>

${result}