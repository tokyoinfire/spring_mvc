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
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Which car do you want to select?
    <form:radiobuttons path="carBrand" items="${employee.cars}"/>
<%--    <br><br>--%>
<%--    Phone number <form:input path="phoneNumber"/>--%>
<%--    <form:errors path="phoneNumber"/>--%>
    <br><br>
    Foreign Languages
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>
</html>
