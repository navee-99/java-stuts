
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>



<script type="text/javascript">
	function verify()

	{

		var user = document.getElementById("user").value;

		var pass = document.getElementById("pass").value;

		var usertype = document.getElementById("usertype").value;

		if (user == "")

		{

			document.getElementById("senderror").innerHTML = "Please enter username...";

			return false;

		}

		else

		{

			document.getElementById("senderror").innerHTML = "";

		}

		if (pass == "")

		{

			document.getElementById("passerror").innerHTML = "Please enter password...";

			return false;

		}

		else

		{

			document.getElementById("passerror").innerHTML = "";

		}

		if (usertype == "")

		{

			document.getElementById("usertypeerror").innerHTML = "Please enter user or admin...";

			return false;

		}

		else

		{

			document.getElementById("usertypeerror").innerHTML = "";

		}
		return true;
	}
</script>
</head>
<body style="background-color:pink;">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" >SALESFORCE</a>
    </div>
    </div>
    </nav>
    
	<div class="container" align="center">
		<header class="text-danger"> LOGIN PAGE</header>
		<fieldset>
			<form onsubmit="return verify()" method="post">

				<table>
					<tr>

						<td class="text-success">USER NAME :</td>

						<td><input type="text" class="btn btn-info" id="user" name="username"></td>
						<td><span style="color: green" id="senderror">*</span></td>

					</tr>

					<tr>

						<td class="text-success">PASSWORD : </td>

						<td><input type="password" class="btn btn-info" id="pass" name="password"></td>
						<td><span style="color: red"   id="usererror" >*</span></td>

					</tr>



					<tr>

						<td><input type="submit" class="btn btn-info" value="login"></td>

					</tr>

				</table>
			</form>
		</fieldset>
	</div>

</body>
</html>