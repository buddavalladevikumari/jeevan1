<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib uri= "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method = "post" action = "donors">
<form:label path ="phonenumber">phone number</form:label>
<form:input path ="phonenumber"/>

<form:label path ="firstname">first name</form:label>
<form:input path ="firstname"/>

<form:label path ="bloodgroup">blood group</form:label>
<form:input path ="bloodgroup"/>
<form:select path="bloodgroup" items ="${groups}" />

<input type ="submit" value ="Add">
</form:form>

</body>
</html>