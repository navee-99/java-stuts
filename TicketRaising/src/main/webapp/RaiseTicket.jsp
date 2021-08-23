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
<!-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Salesforce</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="userhome.jsp">USER</a></li>
       <li class="active"><a href="ticket.do">Rise Ticket</a></li>
          
          <li><a href="TicketHistory.jsp">TicketHistory</a></li>
          <li><a href="OpenTicket.jsp"> Open Ticket</a></li>
    </ul>
     <ul class="nav navbar-nav navbar-right">
     <li><a href="profile.do"><span class="glyphicon glyphicon-name"></span> User Name</a></li>
      <li><a href="profile.do"><span class="glyphicon glyphicon-user"></span> User Profile</a></li>
     <li><a href="userdata.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
  
</nav> -->
<%@ include file="userhome.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		
		<form action="ticket.do" method="post">
		<p align="right" style="margin-top:100px">
		<h2 class="text-success">ENTER YOUR QUERY</h2>
			<div class="form-group">
				<label for="subject">SUBJECT:</label> <input type="text"
					class="form-control" id="subject" placeholder="Enter subject"
					name="subject">
			</div>
			<div class="form-group">
				<label for="description">DISCRIPTION:</label> <input type="text"
					class="form-control" id="Description"
					placeholder="Enter Description" name="description">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" name="remember">
					Remember me</label>
			</div>
			<button type="submit" class="btn btn-success">CLICK TO RAISE TICKET</button>
		</form>
	</div>

		
</body>
</html>