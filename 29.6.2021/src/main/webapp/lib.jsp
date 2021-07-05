<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
       collapsibe: true,
       active: false
    });
  } );
  </script>
</head>
<body>
<html:form action="/saveit">
   <table>
      <tr>
          <th>Bookid</th>
          <td><html:text property="bookid" /></td>
     </tr>
     <tr>
          <th>BookName</th>
          <td><html:text property="name" /></td>
     </tr>
      <tr>
          <th>AuthorId</th>
          <td><html:select property="bookno">
                 <html:option value="-1">Select AuthorId</html:option>
                 <html:optionsCollection name="bookForm" property="authorid" label="authorid" value="authorid"/>
              </html:select>
          </td>
     </tr>
     <tr>
          <th>Price</th>
          <td><html:text property="price" /></td>
     </tr>
     <tr>
          <th>pages</th>
          <td><html:text property="pages" /></td>
     </tr>
     <tr>
      <td> <html:submit styleId="save" value="store"></html:submit> </td>
     </table>
   </html:form>

<div id="accordion">
 <c:forEach items="${authors}" var="x">
  <h3>${x.name}</h3>
  <div>
      <h3>books form ${x.name}  author</h3>
      <ul>
        <c:forEach items="${x.books}" var="y">
          <li><b> ${y.name}</b> for <i> ${y.price} Rs and ${y.pages } of pages</i> </li>
        </c:forEach>

      </ul>
  </div>

 </c:forEach>

  </div>


</body>
</html>