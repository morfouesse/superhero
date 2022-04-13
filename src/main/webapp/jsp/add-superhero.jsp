<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Superhero</title>
</head>
<body>
	<c:import url="header.jsp">
        <c:param name="title" value="Add Superhero"/>
    </c:import>
    
    <form:form action="submit-superhero" method="POST" modelAttribute="superheroForm">
    	<div>
    		<form:label path="alias">Pseudo :</form:label>
    		<form:input path="alias" placeholder="Ici votre pseudo..."/>
    	</div>
    	<div>
    		<form:label path="firstName">Prénom :</form:label>
    		<form:input path="firstName" placeholder="Ici votre prénom..."/>
    	</div>
    	<div>
    		<form:label path="lastName">Nom :</form:label>
    		<form:input path="lastName" placeholder="Ici votre nom..."/>
    	</div>
    	<div>
    		<form:label path="birthday">Date de naissance :</form:label>
    		<form:input path="birthday" type="date" />
    	</div>
    	<div>
    		<form:label path="category">Catégorie :</form:label>
			<form:select path="category">
				<c:forEach items="${categories}" var="categoryItem">
					<form:option value="${categoryItem.id}">${categoryItem.name}</form:option>
				</c:forEach>
			</form:select>
    	</div>
    	<div>
    		<form:label path="superpowers">Super-pouvoirs :</form:label>
			<%-- <form:select path="superpowers">
				<c:forEach items="${superpowers}" var="superpowerItem">
					<form:option value="${superpowerItem.id}">${superpowerItem.name}</form:option>
				</c:forEach>
			</form:select> --%>
			<form:select path="superpowers" items="${ superpowers }" multiple="true" itemValue="${superpowerItem.id}" itemLabel="${superpowerItem.name}">

			</form:select>
    	</div>
    	<form:button>Créer un super héros</form:button>
    </form:form>
    
    <%-- <form action="submit-superhero" method="POST">
    	<div>
    		<label for="lastName">Nom :</label>
    		<input id="lastName" type="text" name="lastName" />
    	</div>
    	<div>
    		<label for="firstName">Prénom :</label>
    		<input id="firstName" type="text" name="firstName" />
    	</div>
    	<div>
    		<label for="pseudo">Pseudo :</label>
    		<input id="pseudo" type="text" name="pseudo" />
    	</div>
    	<div>
    		<label for="category">Category :</label>
    		<select id="category" name="category">
    			<c:forEach items="${categories}" var="category">
    				<option>${category.name}</option>
    			</c:forEach>
    		</select>
    	</div>
    	<input type="submit" value="envoyer"/>
    </form> --%>

</body>
</html>