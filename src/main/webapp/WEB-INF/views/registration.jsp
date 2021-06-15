<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff Registration Form</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<br>
	<br>
	<h3 align="center">СОТРУДНИК СОЗДАН</h3>
	<hr>
	<br>

	<%--	Автопереход на новую страницу--%>
	<script type="text/javascript">
		function moveTo() {
			location.href = "/allstaff"; /* ссылка на новую страницу */
		}
		window.onload=setTimeout('moveTo()', 1500); /* время задержки (в милисекундах) */
	</script>


	<hr>
	<%@ include file="footer.jsp"%>

</body>
</html>