<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách Sinh Viên</title>
</head>
<body>
	<a href="showform">add</a>
	<h1>Danh sách Sinh Viên</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Ten Khoa Hoc</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${khoaHocs}" var="khoaHoc">
				<tr>
					<td><c:out value="${khoaHoc.idkh}" /></td>
					<td><c:out value="${khoaHoc.tenKhoaHoc}" /></td>
					<td><a href="delete?khoahocid=${khoaHoc.idkh}">Delete</a>
						<a href="updatekhoahoc?khoahocid=${khoaHoc.idkh}">update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
