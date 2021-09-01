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
<%@ include file="userhome.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<p align="right" style="margin-top:50px">
 <div class="container">
    <h2 class="text-success">Hii! ${username}</h2>
    <h2 class="text-success"> YOUR TICKET RAISED SUCESSFULLY</h2>
      <a href="RaiseTicket.jsp" class="btn btn-warning" role="button">ADD TICKET</a>
</div>
</body>
</html>