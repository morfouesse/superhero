<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<nav>
		<a href="/">Accueil</a>
		<a href="/superhero/">Liste Super Héros</a>
		<a href="/superhero/add">Ajouter Super Héros</a>
		<a href="/superhero/detail/1">Détail Super Héros</a>
		<a href="/superpower/">Super-pouvoir</a>
	</nav>
	
	<h1>
		<c:out value="${param.title}">
			Titre par défaut
		</c:out>
	</h1>

</body>
</html>