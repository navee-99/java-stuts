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
<body  style="background-color:pink">
<%
   HttpSession sess = request.getSession(true);
    if (sess.getAttribute("username")==null)
    {
    %>
        <jsp:forward page="/login.do?msg=You will have to login first in order to access other pages"></jsp:forward>
    <%
    }
%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Salesforce</a>
    </div>
    </div>
    </nav>
    <div class="container">
    <h2 class="text-danger">LOGIN FAILED ....TRY AGAIN</h2>
     
    <a href="logout.do" class="btn btn-warning" role="button">RETRY </a>
   
      
       </div>
</body>
</html>