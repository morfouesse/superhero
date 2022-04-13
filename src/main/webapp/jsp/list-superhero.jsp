<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Superhero</title>
</head>
<body>
	<c:import url="header.jsp">
        <c:param name="title" value="List Superhero"/>
    </c:import>
    
    <ul>
	    <c:forEach items="${ superheros }" var="superheroItem">
	    	<li>
	    		${ superheroItem.id } ${ superheroItem.alias }
	    		<p>Super Pouvoir :</p>
	    		<ul>
		    		<c:forEach items="${ superheroItem.superpowers }" var="superpowerSuperhero">
		    			<li>${ superpowerSuperhero.name }</li>
		    		</c:forEach>
	    		</ul>
	    		<a href="/superhero/detail/${ superheroItem.id }">Update</a>
	    		<form action="delete-superhero" method="POST">
	   				<input type="hidden" value="${ superheroItem.id }" name="id" />
	   				<input type="submit" value="Supprimer" />
	   			</form>
	    	</li>
	    </c:forEach>
    </ul>
</body>
</html>