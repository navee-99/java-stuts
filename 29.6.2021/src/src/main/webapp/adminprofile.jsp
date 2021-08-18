
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Salesforce</a>
		</div>
		<ul class="nav navbar-nav">
			<li ><a href="#">ADMIN</a></li>
			<li><a href="AdminOpenTickets.jsp">Open Tickets</a></li>

			<li><a href="AdminTicketHistory.jsp">TicketHistory</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="profile.do"><span
					class="glyphicon glyphicon-eye"></span> Admin Name</a></li>
			<li class="active"><a href="profile.do"><span
					class="glyphicon glyphicon-user"></span> Admin Profile</a></li>
			<li><a href="userdata.jsp"><span
					class="glyphicon glyphicon-log-out"></span> Logout</a></li>
		</ul>
	</div>

</nav>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</head>
<body>
<html:form action="/adminprofile.do" method="post">
	<table class="table table-hover">

		<thead>
			<tr>
				<th> AdminName</th>
				<th>Password</th>
				<th>Address</th>
				<th>Mobile Number</th>
				<th>Email</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${profile}" var="x">
				<tr>
					<td>${x.username}</td>
					<td>${x.password}</td>
					<td>${x.address}</td>
					<td>${x.mobile}</td>
					<td>${x.email}</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
	</html:form>
 
</body>
</html>