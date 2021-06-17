<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task Management System</title>
</head>
<body>

	<%@ include file="header.jsp"%>
	<br>
	<br>
	<div style="margin-left: 60px">

		<form action="/updateToDo/${todo.getId() }" method="post">
					
			<table cellpadding=10px>
				<tr>
					<td>Описание:</td>

					<td><textarea cols=50 rows=6 name="task_descrption">

					 ${todo.getTask_descrption()}
					</textarea></td>
				</tr>

				<tr>
					<td>Проект:</td>
					<td><input type="text" name="task_project" value = ${todo.getTask_project()}></td>
				</tr>

				<tr>
					<td>Дата создания:</td>
					<td><input type="date" name="created_date" value = ${todo.getCreated_date()}></td>
				</tr>

				<tr>
					<td>Дата завершения::</td>
					<td><input type="date" name="due_date" value = ${todo.getDue_date()}></td>
				</tr>

				<tr>
					<td>Ответственный:</td>
					<td><input type="text" name="staffFio" value = ${todo.getStaffFio()}></td>
				</tr>

				<tr>
					<td>E-mail:</td>
					<td><input type="email" name="email" placeholder = "Employee email address" value = ${todo.getEmail()}></td>
				</tr>
				<tr>
					<td><input type="submit" value="Обновить" class="btn btn-success"></td>
				</tr>
			</table>
			

		</form>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>