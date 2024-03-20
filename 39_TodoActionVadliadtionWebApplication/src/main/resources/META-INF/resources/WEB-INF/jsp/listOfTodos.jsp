<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	<html>

	<head>
		<link href="webjars//bootstrap//5.1.3//css//bootstrap.min.css" rel="stylesheet">

		<title>
			This is an todo page
		</title>
	</head>

	<body>

		<div class="container">
		
			<h1> Todo List </h1>
			 
			<table class = "table">
				<thead>
				<tr>
					<th>Id</th>
					<th>username</th>
					<th>Descriptio</th>
					<th>Target date</th>
					<th>status</th>
					<tr>
				</thead>

				<tbody>
					<c:forEach items="${todos}" var="todo">
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

			<a href="add-todo" class="btn btn-success">Add TODO</a>
		</div>

		<script src="webjars/bootstrap//5.1.3//js//bootstrap.min.js"></script>
		<script src="webjars//jquery//3.6.0//jquery.min.js"></script>

	</body>

	</html>