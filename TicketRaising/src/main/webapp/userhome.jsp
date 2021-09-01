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
<body  style="background-color:pink" >
<%
   HttpSession sess = request.getSession(true);
    if (sess.getAttribute("username")==null)
    {
    %>
        <jsp:forward page="/login.do?msg=You will have to login first in order to access other pages"></jsp:forward>
    <%
    }
%>

<nav class="navbar navbar-inverse navbar-fixed-top height-100px" >
  <div class="container-fluid" >
    <div class="navbar-header">
      <a class="navbar-brand" >Salesforce</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">User</a></li>
      
       <li><a href="ticket.do">Rise Tiket</a></li>
          
          <li><a href="history.do">TicketHistory</a></li>
            <li><a href="status.do"> Open Ticket</a></li>
        </ul>
     
     
      
    
    <ul class="nav navbar-nav navbar-right">
    <li><a href="profile.do" ><span class="glyphicon glyphicon-eye"></span>${username}</a></li>
     <!--  <li><a href="profile.do"><span class="glyphicon glyphicon-user"></span> User Profile</a></li> -->
       <li><a href="logout.do"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>
  


</body>
</html>

