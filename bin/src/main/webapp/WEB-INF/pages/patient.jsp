<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<section class="content-bg">
  <div class="container">
   
      <h2 class="formHead text-center mb-3">Patient Details</h2>
       <form:form style="text-align:center" method="POST" modelAttribute="patient"  >
      <div class="patientForm">
        
              <div class="row">
              
                  <div class="col-8">
                        <div class="form-group">
                            <label>PatientName</label>
                            <form:input path="patientName" class="form-control" placeholder="Enter Hospital Name"/>  
                                         
                        </div>
                  </div>
                  </div>
                  <div class="row">
                  <div class="col-8">
                        <div class="form-group">
                            <label>PatientAadhar</label>
                            <form:input path="patientAadhar" class="form-control" placeholder="Enter Your Hospital Address"/>  
                                            
                        </div>
                  </div>
                  </div>
              </div>
              
               <div class="row">
                  <div class="col-8">
                        <div class="form-group">
                            <label>Phone Number</label>
                            <form:input path="patientContact" class="form-control" placeholder="Enter Your Hospital Phone Number"/>  
                                           
                        </div>
                  </div>
              </div>
              <div class="form-group footerBtn">
                     <button type="submit" class="btn btn-custom btn-success">Next Step</button>               
              </div>
              
          </form:form>    
          
          </div>
          
          ${result}
          
          