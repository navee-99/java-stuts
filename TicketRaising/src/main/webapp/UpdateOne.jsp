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

<div class="container">
<p align="right" style="margin-top:100px">
</p>
<form  action="simple.do" method="post">
  <div class="form-group">
    <label for="ticketid">ticketid:</label>
    <input type="text" class="form-control" id="ticketid">
  </div>
  <div class="form-group">
    <label for="status">status:</label>
    <input type="text" class="form-control" id="status">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>
</body>
</html>
