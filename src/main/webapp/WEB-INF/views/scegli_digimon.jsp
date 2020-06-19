<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Digimon</title>
</head>
<body>
<div align="center">
	<h2>Lista Digimon</h2>

	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>HP</th>
			<th>ATK</th>
			<th>DEF</th>
			<th>RES</th>
			<th>Digi-evoluzione</th>
		</tr>
		<c:forEach items="${listDigimon}" var="digimon">
		<tr>
			<td>${digimon.id}</td>
			<td>${digimon.nome}</td>
			<td>${digimon.hp}</td>
			<td>${digimon.atk}</td>
			<td>${digimon.def}</td>
			<td>${digimon.res}</td>
			<td>${digimon.evoluzione}</td>
			<td>
				<a href="addToAllenatore?id=${digimon.id}">Aggiungi</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<a href="index">Torna al manager</a>
</div>	
</body>
</html>