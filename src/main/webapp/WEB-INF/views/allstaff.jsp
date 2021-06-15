<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff Registered in the System</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<br>
	<h3 align="center">Информация о сотрудниках</h3>
	<hr>
	<br>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ФИО</th>
				<th scope="col">Отдел</th>
				<th scope="col">E-mail</th>
				<th scope="col">День рождения</th>
				<th scope="col">Принят на работу</th>
				<th scope="col">Подробности</th>

			</tr>
		</thead>
		<tbody>

			<c:forEach items="${staffs}" var="staffs">

				<tr>
					<td>${staffs.getStaff_fio()}</td>
					<td>${staffs.getDepartment()}</td>
					<td>${staffs.getUseremail()}</td>
					<td>${staffs.getDob()}</td>
					<td>${staffs.getHiredDate()}</td>

					<td><a href="http://localhost:8080/staff/${staffs.getId()}">
							<button type="button" class="btn btn-success">Посмотреть</button>
					</a></td>


				</tr>
			</c:forEach>

		</tbody>
	</table>

	<br>
	<a href="/staff"><button style="margin: 20px" type="button" class="btn btn-success">Добавить сотрудника</button>
	</a>

	<br>
	<br>
	<%@ include file="footer.jsp"%>

</body>
</html>