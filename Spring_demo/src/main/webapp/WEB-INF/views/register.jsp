<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
<style type="text/css">
body{
background-color: pink;
text-align: center;
}

</style>
</head>
<body>
<h1> please fill below columns</h1>
<hr>
<form:form modelAttribute="user" action="reg" method="post">
<form:label path="name">Name</form:label>
<form:input path="name" name="name"/> <br><br>

<form:label path="age">Age</form:label>
<form:input path="age" name="age"/> <br><br>

<form:label path="phone">Phone</form:label>
<form:input path="phone" name="phone"/> <br><br>

<form:label path="Password">Password</form:label>
<form:input path="Password" name="password"/> <br><br>

<form:button>Register</form:button>
</form:form>
</body>
</html>