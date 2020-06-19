<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista allenatori</title>
</head>
<body>
<div align="center">
	<h2>Lista Allenatori</h2>

	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Nome</th>
		</tr>
		<c:forEach items="${listAllenatore}" var="allenatore">
		<tr>
			<td>${allenatore.id}</td>
			<td>${allenatore.nome}</td>

			<td>
				<a href="editAllenatore?id=${allenatore.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="deleteAllenatore?id=${allenatore.id}">Delete</a>
				&nbsp;&nbsp;&nbsp;
				<a href="mostraListaDigimon?id=${allenatore.id}">Mostra digimon</a>
				&nbsp;&nbsp;&nbsp;
				<a href="aggiungiDigimonAllenatore?id=${allenatore.id}">Aggiungi digimon</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<a href="index">Torna al manager</a>
</div>	
</body>
</html>