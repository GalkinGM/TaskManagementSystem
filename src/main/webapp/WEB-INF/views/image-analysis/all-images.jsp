<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload | image | analysis</title>
</head>
<body>

	<center>
		<h2 style="align: centre;">All the resources available for
			Downlaod</h2>
	</center>
	<hr>

	<ul style="line-height: 20px;">

		<c:forEach items="${file}" var="listItem">
			<li><a href=${listItem} > ${listItem} </a></li>
			<br />
		</c:forEach>
	</ul>





</body>
</html>