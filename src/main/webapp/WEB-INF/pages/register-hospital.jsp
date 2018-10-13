<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<section class="content-bg">
  <div class="container">
      <h2 class="formHead text-center mb-3">Hospital Details</h2>
      <div class="patientForm">
          <form:form method="POST" modelAttribute="register-hospital" enctype="multipart/form-data">
              <div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label>Hospital Name</label>
                            <form:input path="name" class="form-control" placeholder="Enter Hospital Name"/>  
                                         
                        </div>
                  </div>
                  <div class="col">
                        <div class="form-group">
                            <label>Hospital Address</label>
                            <form:input path="address" class="form-control" placeholder="Enter Your Hospital Address"/>  
                                            
                        </div>
                  </div>
              </div>
              
               <div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label>Phone Number</label>
                            <form:input path="contact" class="form-control" placeholder="Enter Your Hospital Phone Number"/>  
                                <form:errors path="contact" />           
                        </div>
                  </div>
                   <div class="col">
                        <div class="form-group">
                            <label>Registration Number</label>
                            <form:input path="reg_number" class="form-control" placeholder="Hospital Registration Number"/>  
                                           
                        </div>
                  </div>
              </div>
              
              <div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label>City</label>
                            <form:input path="city" class="form-control" placeholder="Enter City"/>  
                                         
                        </div>
                  </div>
                  <div class="col">
                        <div class="form-group">
                            <label>State</label>
                            <form:input path="state" class="form-control" placeholder="Enter State"/>  
                                            
                        </div>
                  </div>
              </div>
              
             
              
              <div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label>Pin Code</label>
                            <form:input path="pincode" class="form-control" placeholder="Enter Pin Code"/>  
                                           
                        </div>
                  </div>
                  <div class="col">
                        <div class="form-group">
                            <label>Hospital Logo</label>
                            <input type="file" name="logo_photo" class="form-control" placeholder="Select Hospital Logo"/>                                           
                        </div>
                  </div>
              </div>
              
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