<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="style2.css">
	<style type="text/css">
			table{
				border-radius: 30px;
			}
	</style>
</head>
<body>
	<div class="bg">
	<center><div class="col-md-6" style="padding: 10px;padding-bottom:150px; padding-top:150px; padding-right: 0px; padding-left: 280px;  margin: 10px; ">
	
	<form action="RegistrationServlet">
	<h1 style="color: white">Registration Form</h1>
	<table style="text-align: center;">
			
			<tr>
				<th>Name  <i class="far fa-user"></i> : </th>
				<td><input type="text" class="form-control form-rounded" name="fname" maxlength="20" placeholder="Enter First Name" required></td>
			</tr>	
	</table>
		<input type="submit" name="submit" class="btn btn-success" style="border-radius: 10px; box-shadow: 0px;" value="Submit">
	</form>
	</div>
</body>
</html>