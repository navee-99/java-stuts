<!DOCTYPE html>
<html lang="en">
    <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Salesforce</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="#">USER</a></li>
       <li><a href="ticket.do">Rise Ticket</a></li>
          
          <li><a href="TicketHistory.jsp">TicketHistory</a></li>
          <li><a href="OpenTicket.jsp"> Open Ticket</a></li>
    </ul>
     <ul class="nav navbar-nav navbar-right">
     <li><a ><span class="glyphicon glyphicon-eye"></span> Naveen</a></li>
      <li class="active"><a href="profile.do"><span class="glyphicon glyphicon-user"></span> User Profile</a></li>
     <li><a href="userdata.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
  
</nav>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p align="right">
		<a href="profile.do">View user profile</a>
	<table class="table table-hover">

		<thead>
			<tr>
				<th>User Name</th>
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
	

</body>
</html>