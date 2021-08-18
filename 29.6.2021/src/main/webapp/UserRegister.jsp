<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<body></body>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function validate()

	{

		var username = document.getElementById("username").value;

		var password = document.getElementById("password").value;
		
		var address = document.getElementById("address").value;

		var mobilenumber = document.getElementById("mobilenumber").value;
		
		var email = document.getElementById("email").value;

		if (username == "")

		{

			document.getElementById("usernameerror").innerHTML = "Please enter username...";

			return false;

		}

		else

		{

			document.getElementById("usernameerror").innerHTML = "";

		}

		if (password == "")

		{

			document.getElementById("passworderror").innerHTML = "Please enter password...";

			return false;

		}

		else

		{

			document.getElementById("passworderror").innerHTML = "";

		}
		
		if (mobilenumber == "")

		{

			document.getElementById("mobilenumbererror").innerHTML = "Please enter valid mobilenumber...";

			return false;

		}

		else

		{

			document.getElementById("mobilenumbererror").innerHTML = "";

		}
		  if(!(/^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”/.test(password)))
		  {
		  
		  document.getElementById("passworderror").innerHTML="enter password pattern correctly";
			
		  return false;
		
		  }
		
		else
		
		{
		
		 document.getElementById("passworderror").innerHTML="";
		
		}

		if (address == "")

		{

			document.getElementById("addresserror").innerHTML = "Please enter address...";

			return false;

		}

		else

		{

			document.getElementById("addresserror").innerHTML = "";

		}
		
		  if(email=="")

		  {

		     document.getElementById("emailerror").innerHTML="Please enter Email...";

		     return false;

		  }

	  else

		  {

		     document.getElementById("emailerror").innerHTML="";

		  }
		  return true;
	}
</script>
<form onsubmit="return validate()">
	<table>

		<tr>

			<td style="color: black">username :</td>

			<td><input type="text" id="username" placeholder="Username"
				name="username"></td>

			<td><span style="color: black" id="usernameerror">please
					enter name</span></td>

		</tr>

		<tr>

			<td style="color: black">Password :</td>

			<td><input type="password" id="password" placeholder="Password"
				name="password"></td>

			<td><span style="color: black" id="passworderror">*</span></td>
		</tr>


		<td style="color: black">Address :</td>

		<td><input type="text" id="address" placeholder="Address"
			name="address"></td>

		<td><span style="color: black" id="addresserror">*</span></td>

		</tr>

		<tr>

			<td style="color: black">Mobile Number :</td>

			<td><input type="number" id="mobilenumber"
				placeholder="Mobile number" name="pass"></td>

			<td><span style="color: black" id="mobilenumbererror">*</span></td>
		</tr>

		<tr>

			<td style="color: black">Email :</td>

			<td><input type="email" id="email" placeholder="Email"
				name="email"></td>

			<td><span style="color: black" id="emailerror">*</span></td>
		</tr>




		<tr>

			<td><input type="submit" placeholder="Register"></td>

		</tr>


	</table>
</form>
</body>
</html>