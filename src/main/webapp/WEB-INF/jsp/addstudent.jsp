<%@ include file="includes/header.jsp"%>
<h1>Hello world Using JSP in Spring Boot</h1>
<div class="container">
    <div class="row">
        <div class="col-md-4">

        </div>
        <div class="col-md-3">


 <form:form modelAttribute="student" class="form-group" action="" method="post" >
     <div style="text-align: center;">
     <form:errors path="*" cssStyle="color : red;" />
     </div>

     <form:label path="name" ><spring:message code="name"/></form:label>
        <form:input class="form-control" path="name" /><br/>
     <div style="text-align: center;">
         <form:errors path="name" cssStyle="color : red;" />
     </div>
        <form:label path="email"><spring:message code="email"/></form:label>
        <form:input class="form-control" path="email"/><br/>
     <div style="text-align: center;">
         <form:errors path="email" cssStyle="color : red;" />
     </div>
        <form:label path="addressId"><spring:message code="addressId"/></form:label>
         <form:select id="address" class="form-control" path="addressId">
             <form:option value="0" label="--Select Address"/>
             <form:options items="${addresses}" itemLabel="state" itemValue= "id"/>
         </form:select>
     <div style="text-align: center;">
         <form:errors path="addressId" cssStyle="color : red;" />
     </div>
        <form:button class="btn btn-primary">Submit Form</form:button>
    </form:form>
        </div>
        <div class="col-md-4">

        </div>
    </div>
</div>
<%@ include file="includes/footer.jsp"%>