<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<%-- <%@ include file="header.jsp" %> --%>
	<c:import url="header.jsp">
        <c:param name="title" value="Home Page"/>
    </c:import>
</body>
</html>