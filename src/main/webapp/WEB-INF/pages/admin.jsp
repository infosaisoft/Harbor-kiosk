<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
  <section class="content-bg">
  <div class="container">
      <h2 class="formHead text-center mb-3">Register Admin</h2>
      <div class="patientForm">
          <form:form method="POST" modelAttribute="admincmd" >
              <div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label> Name</label>
                            <form:input path="name" class="form-control" placeholder="Enter Name"/>  
                                         
                        </div>
                  </div>
                  <div class="col">
                        <div class="form-group">
                            <label>Email</label>
                            <form:input path="admin_email" class="form-control" placeholder="Enter Your emai Address"/>  
                                            
                        </div>
                  </div>
              </div>
              
               <div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label>Phone Number</label>
                            <form:input path="admin_moNumber" class="form-control" placeholder="Enter Your  Phone Number"/>  
                                     
                        </div>
                  </div>
                   <div class="col">
                        <div class="form-group">
                            <label>User Name</label>
                            <form:input path="username" class="form-control" placeholder="User Name"/>  
                                           
                        </div>
                  </div>
              </div>
              
              <div class="row">
                  <div class="col-6">
                        <div class="form-group">
                            <label>Password</label>
                            <form:input path="admin_password" class="form-control" placeholder="Enter Password"/>  
                                         
                        </div>
                  </div>
                 
                 
              </div>
               
                            <form:input path="role" class="form-control" type="hidden" value="admin"/>  
                       
             
              
              <div class="form-group footerBtn">
                     <button type="submit" class="btn btn-custom btn-success">Next Step</button>               
              </div>
              
              
          </form:form>
          
         
         
       <c:if test="${result eq 'success'}">
     <div> registation success full</div>
</c:if> 
          
          
      </div>
  </div>
</section>