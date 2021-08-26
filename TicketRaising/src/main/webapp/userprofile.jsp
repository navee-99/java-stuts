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
	  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<p align="right" style="margin-top:100px">
	<!-- <header class="btn btn-warning"> BIO-DATA</header>
		 -->
	<table class="table table-hover">


		<tbody>
<c:forEach items="${profile}" var="x">
<tr>
					<td style="color:green">NAME:</td>
					<td>${x.username}
				</tr>
			<tr>
					<td style="color:green">LOCATION:</td>
					<td>${x.address}
				</tr>
			<tr>
					<td style="color:green">MOBILE NO:</td>
					<td>${x.mobile}
				</tr>
			<tr>
					<td style="color:green">EMAIL ID:</td>
					<td>${x.email}
				</tr>
			
				
			</c:forEach>

		</tbody>

	</table>
	
</div>
</body>
</html>