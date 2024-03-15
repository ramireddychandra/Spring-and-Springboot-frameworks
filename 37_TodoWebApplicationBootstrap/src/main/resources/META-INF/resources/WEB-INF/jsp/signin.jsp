<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>

<head>
	<title>
		This is an title
	</title>
	<link href="webjars//bootstrap//5.1.3//css//bootstrap.min.css" rel="stylesheet">
	
</head>

<body>
	<div class="container">
		<h1> SIGNIN HERE </h1>
		<pre>${ErrorMessage}</pre>
		<form method="post">
			<label for="email">Enter your email:</label>
			<input type="email" id="email" name="email">
			<label for="pwd">Password:</label>
			<input type="password" id="pwd" name="pwd">
			<input type="submit" value="Submit">
		</form>
	</div>
</body>

</html>