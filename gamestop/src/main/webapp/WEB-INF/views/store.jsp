<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store</title>
</head>
<body>
<div align="center">
	<h2>Store</h2>
	<form method="get" action="search">
		<input type="text" name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form>
	<table border="1" cellpadding="5">
		<tr>
			<th></th>
			<th>Title</th>
			<th>Classification</th>
			<th>PEGI</th>
			<th>Price</th>
			<th>Category</th>
		</tr>
		<c:forEach items="${listProduct}" var="product">
		<tr>
			<td>${product.title}</td>
			<td>${product.classification}</td>
			<td>${customer.PEGI}</td>
			<td>${customer.price}</td>
			<td>${customer.category}</td>
			<td>
				<a href="edit?id=${product.title}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${product.title}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>