<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ include file="adminhome.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css"
	rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css"
	rel="stylesheet">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"> -->
</head>
<body>
</head>
<body>
<%
   /* HttpSession sess = request.getSession(true); */
    if (sess.getAttribute("username")==null)
    {
    %>
        <jsp:forward page="/login.do?msg=You will have to login first in order to access other pages"></jsp:forward>
    <%
    }
%>
	<div class="container">
<form action="simpleform.do" method="post">
		<p align="right" style="margin-top: 100px"></p>
		<%-- <html:form action="simpleform.do" method="post"> --%>

			<label for="ticketid">TICKET ID</label>
			<input type="text" class="form-control" id="ticketid"
				placeholder="ENTER TICKET ID" name="ticketid" >
			<label for="byuser">TO USER</label>
			<input type="text" class="form-control" id="byuser"
				placeholder="ENTER USER" name="byuser" disabled>
			<label for="status">TICKET STATUS</label>
			<select id="status" name="status">
				<option value="closed">closed</option>
				<option value="InProgress">InProgess</option>
				<option value="open">open</option>  
			</select>

			<!-- <input type="text" class="form-control"  id="status"
					placeholder="ENTER TICKET status" name="status"> -->
			<label for="toadmin">BY ADMIN</label>
			<input type="text" class="form-control" id="toadmin"
				placeholder="ENTER BY ADMIN" name="toadmin" disabled>

			<label for="subject">SUBJECT</label>
			<input type="text" class="form-control" id="subject"
				placeholder="ENTER subject" name="subject" >
			<label for="description">TICKET DESCRIPTION</label>
			<input type="text" class="form-control" id="description"
				placeholder="ENTER description" name="description">
			<label for="comands">COMANDS</label>
			<input type="text" class="form-control" id="comands"
				placeholder="ENTER description" name="comands">

			<label for="dateraised">DATE RAISED </label>
			<input type="text" class="form-control" id="dateraised"
				placeholder="ENTER dateraised" name="dateraised" disabled>
			<input type="submit" id="update" value="update">


		<%-- 	<html:submit styleId="update" property="method"
					value="update"></html:submit>

</html:form>
 --%>
</form>
		<table class="table">
			<thead>
				<tr>
					<th>Ticket ID</th>

					<th>By</th>
					<th>Status</th>

					<th>To</th>

					<th>Subject</th>
					<th>Description</th>
					<th>Comands</th>
					<th>DateRaised</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${assign}" var="x">
					<tr>
						<td>${x.ticketid}</td>

						<td>${x.byuser}</td>
						<td>${x.status}</td>
						<td>${x.toadmin}</td>

						<td>${x.subject}</td>
						<td>${x.description}</td>
						<td>${x.comands}</td>
						<td>${x.dateraised}</td>


						<td
							onclick="update(${x.ticketid},'${x.byuser}','${x.status}','${x.toadmin}','${x.subject}','${x.description}','${x.comands }','${x.dateraised}')">
							<i class="icon-edit"></i>UPDATE
						</td>




					</tr>

				</c:forEach>

			</tbody>

		</table>


	</div>

</body>

<script src="script/app.js"></script>
</html>