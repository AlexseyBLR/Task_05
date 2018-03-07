<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>


<div id="ordersBody">
    <table class="table" border="1">
        <thead class="thead-inverse">
        <tr>
            <th>Name</th>
            <th>Second Name</th>
            <th>Hire dater</th>
            <th></th>
            <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.getFirstName()}</td>
            <td>${employee.getSecondName()}</td>
            <td>${employee.getHireDate()}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<table border="1" cellpadding="5" cellspacing="5">
    <tr>
        <c:forEach begin="1" end="${noOfPages}" var="i">
            <c:choose>
                <c:when test="${currentPage eq i}">
                    <td>${i}</td>
                </c:when>
                <c:otherwise>
                    <td><a href="/frontController?command=sax&page=${i}">${i}</a></td>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </tr>
</table>


</body>
</html>
