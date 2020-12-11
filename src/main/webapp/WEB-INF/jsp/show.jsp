<%@ include file="includes/header.jsp"%>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Full Name</th>
        <th scope="col">Email</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    <c:forEach students="${student}" var="student" varStatus="status">
        <td>${status.count}</td>
        <td>${student.name}</td>
        <td>${student.email}</td>

    </c:forEach>

    </tr>
    </tbody>
</table>
<%@ include file="includes/footer.jsp"%>