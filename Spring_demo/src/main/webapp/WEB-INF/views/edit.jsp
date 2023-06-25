<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${u!=null}">
<form:form action="edit" modelAttribute="user" >
<form:label path="id">ID</form:label>
<form:input path="id" value="${u.getId()}" readonly="true"/>
<form:label path="name">Name</form:label>
<form:input path="name" value="${u.getName()}"/> <br><br>

<form:label path="age">Age</form:label>
<form:input path="age" value="${u.getAge()}"/> <br><br>

<form:label path="phone">Phone</form:label>
<form:input path="phone" value="${u.getPhone()}"/> <br><br>

<form:label path="Password">Password</form:label>
<form:input path="Password" value="${u.getPassword()}"/> <br><br>
<form:button>update</form:button>
</form:form>
</c:if>

</body>
</html>