<%@ include file="includes/header.jsp"%>
<h1>Hello world Using JSP in Spring Boot</h1>
<div class="container">
    <div class="row">
        <div class="col-md-4">

        </div>
        <div class="col-md-3">


 <form:form modelAttribute="student" class="form-group" action="addstudent" method="post" >
        <form:label path="name">Full name:</form:label>
        <form:input class="form-control" path="name"/><br/>
        <form:label path="email">E-mail:</form:label>
        <form:input class="form-control" path="email"/><br/>
        <form:button class="btn btn-primary">Add Student</form:button>
    </form:form>
        </div>
        <div class="col-md-4">

        </div>
    </div>
</div>
<%@ include file="includes/footer.jsp"%>