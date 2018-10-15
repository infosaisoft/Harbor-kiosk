<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>




<section class="content-bg">
  <div class="container">
      <h2 class="formHead text-center mb-3">Department Details</h2>

<form:form method="POST" modelAttribute="department">
<div class="row">
                  <div class="col">
                        <div class="form-group">
                            <label>Departement Name </label>
                            <form:input path="dptName" class="form-control" placeholder="Enter Hospital Name"/>  
                                         
                        </div>
                  </div>
                  <div class="col">
                        <div class="form-group">
                            <label>Department Location</label>
                            <form:input path="dptLocation" class="form-control" placeholder="Enter Your Hospital Address"/>  
                                            
                        </div>
                  </div>
              </div>
              
              
              <div class="form-group footerBtn">
                     <button type="submit" class="btn btn-custom btn-success">Next Step</button>               
              </div>
              
</form:form>

</div>
  </div>
</section>
${result}