<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff Information Details</title>
</head>
<body>

<%@ include file="header.jsp"%>

<table>

<td> <img src = "../../WebContent/images/${staff.getPicture()}" height = 200px width = 200px></td>
</tr>

    <tr>
        <td>ФИО:</td>

        <td>${staff.getStaff_fio()}</td>
    </tr>

<tr>
    <td>Отдел:</td>
<td>${staff.getDepartment()} </td>
</tr>

    <tr>
        <td>E-mail:</td>
        <td>${staff.getUseremail()}</td>
    </tr>

<tr>
    <td>День рождения:</td>
<td>${staff.getDob()} </td>
</tr>

<tr>
    <td>Дата принятия на работу:</td>
<td>${staff.getHiredDate()} </td>
</tr>


</table>

<%@ include file="footer.jsp"%>

</body>
</html>