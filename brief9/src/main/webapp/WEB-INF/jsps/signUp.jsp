<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up!!</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}
body {
	margin: 0;
	padding: 0;
	background: linear-gradient(120deg, #000000, #9A86A4);
	height: 150vh;
	overflow: hidden;
}
.center {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 400px;
	background: white;
	border-radius: 10px;
	box-shadow: 10px 10px 15px rgba(0, 0, 0, 0.05);
}
.center h1 {
	color: #9A86A4;
	text-align: center;
	padding: 20px 0;
	border-bottom: 1px solid silver;
}
.center form {
	padding: 0 40px;
	box-sizing: border-box;
}
form .txt_field {
	position: relative;
	border-bottom: 2px solid #adadad;
	margin: 30px 0;
}
.txt_field input {
	width: 100%;
	padding: 0 5px;
	height: 40px;
	font-size: 16px;
	border: none;
	background: none;
	outline: none;
}
.txt_field label {
	position: absolute;
	top: 50%;
	left: 5px;
	color: #adadad;
	transform: translateY(-50%);
	font-size: 16px;
	pointer-events: none;
	transition: .5s;
}
.txt_field span::before {
	content: '';
	position: absolute;
	top: 40px;
	left: 0;
	width: 0%;
	height: 2px;
	background: #2691d9;
	transition: .5s;
}
.txt_field input:focus ~ label, .txt_field input:valid ~ label {
	top: -5px;
	color: #2691d9;
}
.txt_field input:focus ~ span::before, .txt_field input:valid ~ span::before
	{
	width: 100%;
}
.pass {
	margin: -5px 0 20px 5px;
	color: #a6a6a6;
	cursor: pointer;
}
.pass:hover {
	text-decoration: underline;
}
input[type="submit"] {
	width: 100%;
	height: 50px;
	border: 1px solid;
	background: linear-gradient(120deg, #000000, #9A86A4);
	border-radius: 25px;
	font-size: 18px;
	color: #e9f4fb;
	font-weight: 700;
	cursor: pointer;
	outline: none;
}
input[type="submit"]:hover {
	border-color: #2691d9;
	transition: .5s;
}
.logIn_link {
	margin: 30px 0;
	text-align: center;
	font-size: 16px;
	color: #666666;
}
.logIn_link a {
	color: #2691d9;
	text-decoration: none;
}
.logIn_link a:hover {
	text-decoration: underline;
}
</style>

</head>
<body>
	<div class="center">
		<h1>Sign Up</h1>
		<form method="post" action="SignUp">
		<div class="txt_field">
				<input type="text" name="firstname" id="firstname" required>
				 <label>First-name:</label>
			</div>
			<div class="txt_field">
				<input type="text" name="lastname" id="lastname" required>
				 <label>Last-name:</label>
			</div>
			<div class="txt_field">
				<input type="text" name="username" id="username" required>
				 <label>Username:</label>
			</div>
			<div class="txt_field">
				<input type="password" name="password" id="password" required> <label>Password:</label>
			</div>
			<input type="submit" value="Sign Up">
			<div class="logIn_link">
				Already a member?<a href="Login">Log In</a>
			</div>
		</form>
	</div>
</body>
</html>