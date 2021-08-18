<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
    <%@ include file="adminhome.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body></head>
<body>
<form action="/simpleform">
   <table>
      <tr>
          <th>TicketId</th>
          <td><text property="ticketid" /></td>
     </tr>
     <tr>
          <th>ByUser</th>
          <td><text property="byuser" /></td>
     </tr>
     <tr>
          <th>status</th>
          <td><text property="status" /></td>
     </tr>

     
     <tr>
      <td> <submit styleId="save" property="method" value="store"></submit> </td>
      <td> <submit styleId="update" property="method" value="update"></submit> </td>
   </table>
  </form>
     <table class="table table-hover">
      <thead>
         <tr>
             <th>TicketId</th>
             <th>ByUser</th>
             <th>status</th>
         </tr>
       </thead>
       <tbody> 
       <c:forEach  items="${people}" var="x">
             
                 <tr>
                     <td>${x.ticketid}</td>
                     <td>${x.byuser}</td>
                     <td>${x.status}</td>
                     <td>${x.toadmin}</td>
                     <td>${x.subject}</td>
                     <td>${x.description}</td>
           			 <td>${x.dateraised}</td>
          
                     
                      <td onclick="update(${x.ticketid},'${x.toadmin}','${x.byuser}','${x.subject}','${x.description}','${x.status}','${x.dateraised}')"><i class="fa fa-edit" aria-hidden="true"></i></td>
                  
                 </tr>
              </c:forEach>
       </tbody>
  </table>
  <script src="scripts/app.js"></script>

</body>
</html>