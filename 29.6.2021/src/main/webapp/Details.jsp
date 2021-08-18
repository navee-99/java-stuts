<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${profile}" var="x">
					
					User Name:${x.username}<br>
				    Password:${x.password}<br>
				    Mobile Number:${x.mobilenumber}<br>
					Address:${x.address}<br>
					Email:${x.email}
				
				</c:forEach>
		

</body>
</html>