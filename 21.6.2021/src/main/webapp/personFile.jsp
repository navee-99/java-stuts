<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>
<body>
<form action="Book.do" method="post">
   <table>
       <tr>
          <th>sno</th>
          <td><input type="text" name="sno"></td>
        </tr>
        <tr>
          <th>bookName</th>
          <td><input type="text" name="bookName"></td>
        </tr>
         <tr>
          <th>Price</th>
          <td><input type="text" name="Price"></td>
        </tr>
         <tr>
          <th>NoOfPage</th>
          <td><input type="text" name="Pages"></td>
        </tr>
       <tr>
          <th>AuthorID</th>
          <td><select name="AuthorID">
          <c:forEach items="${authorlist }" var ="x" >
          <option value="${x.AuthorID }">${x.name }</option>
          </c:forEach>
          </select>
          </td>
        </tr>
        <tr>
          <td><input type="submit" value="Store book Data" class="btn btn-primary"></td>
        </tr>
       
   </table>
   <table class="table table-hover">
      <thead>
           <tr>
                <th>sno</th>
                <th>bookName</th>
                <th>Price</th>
                <th>AuthorID</th>
                <th>Pages</th>
            </tr>
     </thead>
     <tbody>
     <c:forEach items ="${booklist }" var="book">
     <tr>
     <td>${book.sno }</td>
      <td>${book.bookname }</td>
       <td>${book.Price }</td>
        <td>${book.AuthorID }</td>
         <td>${book.Pages }</td>
         </tr>
      </c:forEach>
     </tbody>
     </table>
</form>

</body>
</html>