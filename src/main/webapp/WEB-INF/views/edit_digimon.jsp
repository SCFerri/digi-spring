<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modifica Digimon</title>
</head>
<body>
	<div align="center">
		<h2>Modifica di un digimon</h2>
		<form:form action="save" method="post" modelAttribute="digimon">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID: </td>
					<td>${prodotto.id}
						<form:hidden path="id"/>
					</td>
				</tr>			
				<tr>
					<td>Nome: </td>
					<td><form:input path="nome" /></td>
				</tr>
				<tr>
					<td>Hp: </td>
					<td><form:input path="hp" /></td>
				</tr>
				<tr>
					<td>Attacco: </td>
					<td><form:input path="atk" /></td>
				</tr>
				<tr>
					<td>Difesa: </td>
					<td><form:input path="def" /></td>
				</tr>
				<tr>
					<td>Resistenza: </td>
					<td><form:input path="res" /></td>
				</tr>
				<tr>
					<td>Digi-evoluzione: </td>
					<td><form:input path="evoluzione" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>