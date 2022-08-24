<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Space</title>
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
	height: 200vh;
	overflow: hidden;
}
.table {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 800px;
	height:400px;
	background: white;
	border-radius: 10px;
	box-shadow: 10px 10px 15px rgba(0, 0, 0, 0.05);
	padding:10px;
	margin:0px 40px 0px 30px;
}
.table h1{
    text-align: center;
	padding: 20px 0;
	border-bottom: 1px solid silver;
}
.table a{
    color: #2691d9;
    text-decoration:none;
}
.btn-success{
    padding: 10px 5px;
	color: #2691d9;
	text-decoration: none;
	position:center;
}
.logout_link a {
	color: #2691d9;
	text-decoration: none;
	position:center;
}
.logout_link a:hover {
	text-decoration: underline;
}
.content-table {
    border-collapse:collapse;
    margin: 25px;
    font-size:0.9em;
    min-width:700px;
    border-radius:5px 5px 0 0;
    overflow:hidden;
    box-shadow: 0 0 20px rgba(0,0,0,0.15);
}
.content-table thead tr {
    background-color:#9A86A4;
    color : #ffffff;
    text-align:left;
    font-weight:bold;
}
.content-table th,
.content-table td{
    padding: 12px 15px;
}
.content-table tbody tr{
    border-bottom:1px solid #9A86A4;
    
} 
.content-table tbody tr:last-of-type{
    border-bottom:1px solid #2691d9;
}
</style>
</head>
<body>

	<div class="table">
	        <h1>My tasks:</h1>
	        
			<div>
			    <a href="<%=request.getContextPath()%>/new" class="btn-success">Add New Task</a>
			</div>
		
		<center>
		   <table class="content-table">
				<thead>
					<tr>
						<!-- <th>ID</th> -->
						<th>Title</th>
						<th>Description</th>
						<th>Status</th>
						<th>Deadline</th>
						<th>Categorie</th>
						<th>Actions</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="task" items="${listTasks}">
					      <tr>
					         <!-- <td><c:out value="${task.id}" /></td> -->
					          <td><c:out value="${task.title}" /></td>
					          <td><c:out value="${task.description}" /></td>
					          <td><c:out value="${task.status}" /></td>
					          <td><c:out value="${task.deadline}" /></td>
					          <td><c:out value="${task.categorie}" /></td>
					          <td>
					              <a href="edit?id=<c:out value='${task.id}' />">Edit</a>
					              &nbsp;&nbsp;&nbsp;&nbsp;
					              <a href="delete?id=<c:out value='${task.id}' />">Delete</a>
					          </td>
					      </tr>
					</c:forEach>
				</tbody>

			</table>
		</center>
			<div class="logout_link">
				<a href="Login">Log Out</a>
			</div>
	</div>
</body>
</html>