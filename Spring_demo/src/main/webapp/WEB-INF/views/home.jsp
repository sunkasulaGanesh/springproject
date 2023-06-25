<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${u!=null}">
<h3><a href="load?choice=2">edit</a></h3>

<h3><a href="see">profile</a></h3>
<h3><a href="delete?id=${u.getId()}">delete</a></h3>
<h3><a href="logout">logout</a></h3>


</c:if>
</body>
</html>