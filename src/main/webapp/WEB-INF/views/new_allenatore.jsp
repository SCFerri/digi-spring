<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo allenatore</title>
</head>
<body>
	<div align="center">
		<h2>Aggiungi un nuovo allenatore</h2>
		<form:form action="saveAllenatore" method="post" modelAttribute="allenatore">
			<table border="0" cellpadding="5">
				<tr>
					<td>Nome: </td>
					<td><form:input path="nome" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>