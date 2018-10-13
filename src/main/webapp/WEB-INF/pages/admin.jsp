<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    
    <form:form method="POST" modelAttribute="admincmd">
    
   admin_name:: <form:input path="admin_name"/><br>
   admin_email:: <form:input path="admin_email"/><br>
    admin_moNumber::<form:input path="admin_moNumber"/><br>
    admin_id::<form:input path="admin_id"/><br>
    admin_password::<form:input path="admin_password"/><br>
    <input type="submit" value="Registration">  
    </form:form>
    
    ${result}