<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Superpower</title>
</head>
<body>
	<c:import url="header.jsp">
        <c:param name="title" value="Gestion Super-pouvoir"/>
    </c:import>
    
    <h2>Ajouter un super-pouvoir</h2>
    
    <form:form action="/submit-superpower" method="POST" modelAttribute="superpowerForm">
    	
    	<div>
    		<form:label path="name">Nom :</form:label>
    		<form:input path="name" placeholder="Ici le nom du superpower..."/>
    	</div>
    	<div>
    		<form:label path="description">Description :</form:label>
    		<form:input path="description" placeholder="Ici la description..."/>
    	</div>
    	
    	<form:button>Ajouter</form:button>
    </form:form>
    
    <h2>Liste des super-pouvoirs</h2>
    <form action="/filter-by-name" method="POST">
    	<div>
    		<label for="filterByName">Filter par nom :</label>
    		<input id="filterByName" name="filterByName" placeholder="Ici pour filtrer"/>
    	</div>
    	<input type="submit" />
    </form>
    <ul>
	   	<c:forEach items="${ superpowers }" var="superpower">
	   		<li>
	   			${ superpower.id } ${ superpower.name } ${ superpower.description }
	   			<p>Superhéros :</p>
	    		<ul>
		    		<c:forEach items="${ superpower.superheros }" var="superheroSuperpower">
		    			<li>${ superheroSuperpower.alias }</li>
		    		</c:forEach>
	    		</ul>
	   			<form action="delete-superpower" method="POST">
	   				<input type="hidden" value="${ superpower.id }" name="id" />
	   				<input type="submit" value="Supprimer" />
	   			</form>
	   		</li>
	   	</c:forEach>
   	</ul>
	
</body>
</html>