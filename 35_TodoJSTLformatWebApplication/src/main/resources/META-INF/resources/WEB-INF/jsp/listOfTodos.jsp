 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
	<head>
			<link href ="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
	
		<title>
			This is an todo page
		</title>
	</head>
	<body>
	<h1> Welcome ${name} to TODOs Page - ${email}</h1>
	<hr>
		<h1> Todo List </h1>
		
		<table>
			<thead>
				<th>Id</th>
				<th>username</th>
				<th>Descriptio</th>
				<th>Target date</th>
				<th>status</th>
			</thead>
		
		<tbody>
			<c:forEach items="${todos}" var = "todo">
			<tr>
				<td>${todo.id}</td>
				<td>${todo.username}</td>

				<td>${todo.description}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.status}</td>

			</tr>
			</c:forEach>
		</tbody>
		</table>
		
		<script src = "webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
			<script src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	
	</body>
</html>