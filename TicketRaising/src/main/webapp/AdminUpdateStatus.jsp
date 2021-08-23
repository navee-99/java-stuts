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


</head>
<body>
</head>
<body>
	<div class="container">
		<p align="right" style="margin-top: 100px">
			<html:form action="simpleform.do" method="post">
				<label for="ticketid">TICKET ID</label>
				<input type="text" class="form-control" id="ticketid"
					placeholder="ENTER TICKET ID" name="ticketid">
				<label for="status">TICKET STATUS</label>
				<input type="text" class="form-control" id="status"
					placeholder="ENTER TICKET status" name="status">
				<label for="toadmin">BY ADMIN</label>
				<input type="text" class="form-control" id="toadmin"
					placeholder="ENTER BY ADMIN" name="toadmin">
				<label for="byuser">TO USER</label>
				<input type="text" class="form-control" id="byuser"
					placeholder="ENTER USER" name="byuser">
				<label for="subject">SUBJECT</label>
				<input type="text" class="form-control" id="subject"
					placeholder="ENTER subject" name="subject">
				<label for="description">TICKET DESCRIPTION</label>
				<input type="text" class="form-control" id="description"
					placeholder="ENTER description" name="description">

				<label for="dateraised">DATE RAISED </label>
				<input type="text" class="form-control" id="dateraised"
					placeholder="ENTER dateraised" name="dateraised">

				<%-- <table>
      <tr>
          <th>ticketid</th>
          <td><html:text property="ticketid" /></td>
     </tr>
     <tr>
          <th>touser</th>
          <td><html:text property="byuser" /></td>
     </tr>
     <tr>
          <th>status</th>
          <td><html:text property="status" /></td>
     </tr>
<tr>
          <th>byadmin</th>
          <td><html:text property="toadmin" /></td>
     </tr>
    <tr>
          <th>subject</th>
          <td><html:text property="subject" /></td>
     </tr>
     <tr>
          <th>description</th>
          <td><html:text property="description" /></td>
     </tr>
      <tr>
          <th>dateraised</th>
          <td><html:text property="dateraised" /></td>
     </tr>
    
     
     
    
     
      <td> <html:submit styleId="save" property="method" value="store"></html:submit> </td>
      <td> <html:submit styleId="update" property="method" value="update"></html:submit> </td>
     
   </table> --%>
				<button type="submit" class="btn btn-success">UPDATE</button>
			</html:form>
		<table class="table table-hover">

			<tbody class="center">

				<c:forEach items="${assign}" var="x">

					<tr>
						<td style="color: blue">Ticket ID:</td>
						<td>${x.ticketid}
					</tr>
					<tr>
						<td style="">Subject:</td>
						<td>${x.subject}</td>
					</tr>
					<tr>
						<td style="">Description:</td>
						<td>${x.description}</td>
					</tr>
					<tr>
						<td style="">By:</td>
						<td>${x.byuser}</td>
					</tr>
					<tr>
						<td style="">To:</td>
						<td>${x.toadmin}</td>
					</tr>
					<tr>
						<td style="">Status:</td>
						<td>${x.status}</td>
					</tr>
					<tr>
						<td style="">DateRaised</td>
						<td>${x.dateraised}</td>
					</tr>

					<td
						onclick="update(${x.ticketid},'${x.subject}','${x.toadmin}','${x.status}','${x.subject}','${x.description}','${x.dateraised}')"><i
						class="fa fa-edit" aria-hidden="true"></i></td>
				</c:forEach>
			</tbody>

		</table>
	</div>
</body>
<script src="script/app.js"></script>
</html>