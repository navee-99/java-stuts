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
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
	<h1>${name}</h1>
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Salesforce</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">ADMIN</a></li>
			
			<li><a href="assign.do">Open Tickets</a></li>

			<li><a href="AdminTicketHistory.jsp">TicketHistory</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
	<li><a>${name}</a>
	
			<li><a href="profile.do"><span
					class="glyphicon glyphicon-eye"></span> </a></li>
			<li><a href="profile.do"><span
					class="glyphicon glyphicon-user"></span> Admin Profile</a></li>
			<li><a href="logout.do"><span
					class="glyphicon glyphicon-log-out"></span> Logout</a></li>
				<li> <</a>
		</ul>
	</div>

</nav>
<div class="container">
  
 
</div>