<%@ include file="includes/header.jsp"%><div class="container">
    <div class="row">
        <div class="col-md-3">

        </div>
        <div class="col-md-6">

        <table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Full Name</th>
        <th scope="col">Email</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    <c:forEach items="${students}" var="student" varStatus="status">
    <tr>

        <td>${status.count}</td>
        <td>${student.name}</td>
        <td>${student.email}</td>
        <td><a href=" <c:url value="/student/edit?id=${student.id}" />"><i class="fa fa-trash" aria-hidden="true"></i></a>
            <a href=" <c:url value="/student/delete?id=${student.id}" />"><i class="fa fa-edit"></i></a>
        </td>
    </tr>
    </c:forEach>

    </tr>
    </tbody>
</table>
        </div>
        <div class="col-md-3">

        </div>
    </div>
</div>
<%@ include file="includes/footer.jsp"%>