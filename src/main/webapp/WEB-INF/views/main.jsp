<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>To Do Management System</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<br>
	<h3 align="center">Система постановки задач</h3>
	<hr>
	<br>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Проект</th>
				<th scope="col">Задача</th>
				<th scope="col">Описание</th>
				<th scope="col">Создана</th>
				<th scope="col">Завершена</th>
				<th scope="col">Ответственный</th>
				<th scope="col">Обновить</th>
				<th scope="col">Удалить</th>
			</tr>
		</thead>
		<tbody>


			<c:forEach items="${tasks}" var="task">

				<tr>
					<td>${task.value.getId()}</td>
					<td>${task.value.getTask_project()}</td>
					<td>${task.value.getTask_task()}</td>
					<td>${task.value.getTask_descrption()}</td>
					<td>${task.value.getCreated_date()}</td>
					<td>${task.value.getDue_date()}</td>
					<td>${task.value.getStaffFio()}</td>

					<td><a
						href="http://localhost:8080/update/${task.value.getId()}">
							<button type="button" class="btn btn-warning">Обновить</button>
					</a></td>

					<td><a
						href="http://localhost:8080/delete/${task.value.getId()}">
							<button type="button" class="btn btn-danger"
								onclick="return confirm('Вы уверены, что хотите удалить задачу?');">
								Удалить</button>
					</a></td>

				</tr>
			</c:forEach>

		</tbody>
	</table>


	<br>
	<a href="/task"><button style="margin: 20px" type="button" class="btn btn-success">Добавить</button>
	</a>

	<br>
	<br>
	<br>



	<%@ include file="footer.jsp"%>

</body>
</html>