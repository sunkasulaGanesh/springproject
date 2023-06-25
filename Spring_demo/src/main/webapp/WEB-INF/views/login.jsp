<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image:url(file:///C:/Users/DELL/Desktop/sai/Spring_demo/src/main/webapp/images/wel.jpg);
text-align: center;
background-size: cover;
background-position: center center;
}

</style>
</head>
<body>
<h1> ${message}</h1>
<hr>
<form action="loginpage" method="post">
<input type="tel" name="phone"> <br>
<input type="password" name="password"><br>
<input type="submit" value="LOGIN">
</form>

<br>
<i><a href="load?choice=1"> click here to register</a></i>
</body>
</html>