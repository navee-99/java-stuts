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

  

<%@ include file="adminhome.jsp" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
    

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<p align="right" style="margin-top:100px">
<p align="right">
		<a href="simpleform.do" class="btn btn-success">Update Status</a>


<form action="/assign" method="post">

<h1 style="color:blue" align="center" >OpenTicket</h1>
<table class="table">
    <thead>
      <tr>
        <th>Ticket ID</th>
        <th>Subject</th>
        <th>Description</th>
         <th>By</th>
        <th>To</th>
        <th>Status</th>
        <th>DateRaised</th>
      </tr>
    </thead>
     <tbody>
     <c:forEach items="${assign}" var="x">
      <tr>
        <td> ${x.ticketid}</td>
        <td> ${x.subject}</td>
         <td> ${x.description}</td>
          <td> ${x.byuser}</td>
         <td> ${x.toadmin}</td>
          <td> ${x.status}</td>
          
           <td> ${x.dateraised}</td>
          
      </tr>
     
     
      </c:forEach>
      </tbody>
    </table>
	<%-- <table class="table table-hover">

		<tbody >
		
         <c:forEach items="${assign}" var="x">
			
				<tr>
					<td style="color:blue">Ticket ID:</td>
					<td>${x.ticketid}
				</tr>
				<tr>
					<td style="blue">Subject:</td>
					<td>${x.subject}</td>					
				</tr>
				<tr>
					<td style="blue">Description:</td>
					<td>${x.description}</td>
				</tr>
				<tr>
					<td style="blue">By:</td>
					<td>${x.byuser}</td>
				</tr>
				<tr>
					<td style="blue">To:</td>
					<td>${x.toadmin}</td>
				</tr>
								<tr>
					<td style="blue">Status:</td>
					<td>${x.status}</td>
				</tr>
				<tr>
					<td style="blue">DateRaised</td>
					<td>${x.dateraised}</td>
				</tr>
				
				
			</c:forEach>

		</tbody>

	</table> --%>
	</form>
	</div>

</body>
</html>