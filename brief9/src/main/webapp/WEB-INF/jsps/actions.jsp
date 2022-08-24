<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Space</title>
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
	width: 600px;
	height:600px;
	background: white;
	border-radius: 10px;
	box-shadow: 10px 10px 15px rgba(0, 0, 0, 0.05);
	margin:10px 0 0 0;
}
.center h1 {
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
.space {
	margin: 30px 0;
	text-align: center;
	font-size: 16px;
	color: #666666;
}
.space a {
	color: #2691d9;
	text-decoration: none;
}
.space a:hover {
	text-decoration: underline;
}
h2 {
	text-align: center;
	padding: 20px 0;
	border-bottom: 1px solid silver;
}
</style>
</head>
<body>
    <div class="center">
    
        <c:if test="${task.id != null}">
			 <form action="update" method="post">
	    </c:if>
	    
		<c:if test="${task.id == null}">
			 <form action="insert" method="post">
		</c:if>	
		
		<caption>
			 <h2>
				<c:if test="${task.id != null}">Edit Task </c:if>
				<c:if test="${task.id == null}">Add New Task</c:if>
			 </h2>
		</caption>
		    <c:if test="${task.id != null}">
					<input type="hidden" name="id" value="<c:out value='${task.id}' />" />
				</c:if>
			<div class="txt_field">
				<input type="text" value="<c:out value='${task.title}' />" name="title" id="title" required>
				 <label>Title:</label>
			</div>
			<div class="txt_field">
				<input type="text" value="<c:out value='${task.description}' />" name="description" id="description" required>
				 <label>Description:</label>
			</div>
			<div class="txt_field">
				<input type="text" value="<c:out value='${task.status}' />" name="status" id="status" required>
				 <label>Status:</label>
			</div>
			<div class="txt_field">
				<input type="text" value="<c:out value='${task.deadline}' />" name="deadline" id="deadline" required>
				 <label>Deadline:</label>
			</div>
			<div class="txt_field">
				<input type="text" value="<c:out value='${task.categorie}' />" name="categorie" id="categorie" required>
				 <label>Categorie:</label>
			</div>
			<input type="submit" value="Save">
			<div class="space">
				Want to go back?<a href="<%=request.getContextPath() %>/list"
					class="nav-link">My Tasks</a>
			</div>
		</form>
	</div>
</body>
</html>