<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<%java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); %>
	<title>Guru current Date</title>
<title>Add Todo's</title>
</head>
<body>

	<%@ include file="header.jsp"%>
	<br>
	<br>
	<div>
		<h1 align="center">
			Создать задачу
			</h1>
	</div>
	<hr>
	<br>


	<div style="margin-left: 60px">
		<form action="/addTask" method="post">

			<table>
				<tr>
				<td>Проект:</td>
				<td><input type="text" name="task_project"></td>
				</tr>

				<tr>
				<td>Задача:</td>
				<td><input type="text" name="task_task"></td>
				</tr>

<%--				<tr>--%>
<%--					<td>Дата и время:</td>--%>
<%--					<td><input type="date" value="<%= df.format(new java.util.Date()) %>" name="created_date"></td>--%>

<%--				</tr>--%>
<%--				<tr>--%>
<%--					<td>Дата завершения:</td>--%>
<%--					<td><input type="date" value="2020-04-05" name="due_date"></td>--%>
<%--				</tr>--%>

				<tr>
					<td>E-mail исполнителя:</td>
					<td><input type="email" name="email"
						placeholder="введите email "></td>
				</tr>

				<tr>
				<td>Описание задачи:</td>

				<td><textarea cols=50 rows=6 name="task_descrption"></textarea></td>
				</tr>
				<tr>
				<tr>
					<td><input type="submit" value="Добавить" class="btn btn-success"></td>
				</tr>
			</table>


		</form>

	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>