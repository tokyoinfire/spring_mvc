<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h2>Dear ${param.employeeName}, you are WELCOME!</h2>--%>

Your name is ${employee.name}
<br><br>
Your surname is: ${employee.surname}
<br><br>
Your salary is: ${employee.salary}
<br><br>
Your department is: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
Language(s):
<ul>
    <c:forEach var = "lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br><br>
<%--Phone number: ${employee.phoneNumber}--%>
Email: ${employee.email}
</body>
</html>
