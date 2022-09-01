<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>

<html>
<head>

    <title>Lesson MVC</title></head>
<body>
<h2>Dear Employee, Please Enter Your Name</h2>
<br>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
