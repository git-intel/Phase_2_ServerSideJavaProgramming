<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Directives</title>
</head>
<body>


	This is content from the main file.
	<%@ include file="included.jsp"%>
	<hr>
	Example of using JSTL taglibs for formatting output
	<br>
	<p>
		Currency =
		<fmt:formatNumber value="145" type="currency" />
	<p>
	<p>
		<c:set var="now" value="<%=new java.util.Date()%>" />
		Current date and time is
		<fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${now}" />
	</p>

</body>
</html>
<!--
Download jstl.jar from http://central.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar
https://repo1.maven.org/maven2/javax/servlet/jstl/1.2/
-->