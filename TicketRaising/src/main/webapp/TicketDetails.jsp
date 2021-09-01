<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    HttpSession ses = request.getSession(true);
    if (ses.getAttribute("username")==null)
    {
    %>
        <jsp:forward page="/login.do?msg=You will have to login first in order to access other pages"></jsp:forward>
    <%
    }
%>
<html:form action="/ticket" method="post">
	<table class="table table-hover">

		<tbody class="center">
		<h1 style="color:blue" align="center">Ticket Details</h1>

			<c:forEach items="${ticket}" var="x">
				<tr>
					<td style="color:blue">Ticket ID:</td>
					<td>${x.ticketid}
				</tr>
				<tr>
					<td style="color:blue">Subject:</td>
					<td>${x.subject}</td>					
				</tr>
				<tr>
					<td style="color:blue">Description:</td>
					<td>${x.description}</td>
				</tr>
				<tr>
					<td style="color:blue">By:</td>
					<td>${x.byusername}</td>
				</tr>
				<tr>
					<td style="color:blue">To:</td>
					<td>${x.toadminname}</td>
				</tr>
								<tr>
					<td style="color:blue">Status:</td>
					<td>${x.status}</td>
				</tr>
				<tr>
					<td style="color:blue">DateRaised</td>
					<td>${x.dateraised}</td>
				</tr>
				
				
			</c:forEach>

		</tbody>

	</table>
	</html:form>


</body>
</html>