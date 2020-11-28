<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@page import="java.util.List , com.pushkal.domain.Patient"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="<jstl:url value="/resources/css/style.css"/>" />
<style type="text/css">
.table-container {
	margin-left: 20px;
	margin-right: 20px;
}
</style>


<title>Search Patient By City</title>
</head>
<body>

	<div class="container-fluid p-0 m-0">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">

			<a class="navbar-brand" href="#">HealthCare</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="index.jsp">Home <span class="sr-only">(current)</span></a></li>

				</ul>


			</div>
		</nav>
	</div>


<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 20px;">Details Of Patient ${patients.pName}</h2>
	</br>

	<div class="table-responsive">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Patient Id</th>
					<th scope="col">Name</th>
					<th scope="col">Phone</th>
					<th scope="col">City</th>
					<th scope="col">Address</th>
					<th scope="col">State</th>
					<th scope="col">Gender</th>
					<th scope="col">Age</th>
					<th scope="col">Blood Group</th>
				</tr>

			</thead>
			<tbody>
				
					<tr>
						<td class="table-dark">${patients.patient_id}</td>
						<td class="table-dark">${patients.pName}</td>
						<td class="table-dark">${patients.phone}</td>
						<td class="table-dark">${patients.city}</td>
						<td class="table-dark">${patients.address}</td>
						<td class="table-dark">${patients.state}</td>
						<td class="table-dark">${patients.gender}</td>
						<td class="table-dark">${patients.age}</td>
						<td class="table-dark">${patients.blood}</td>

					</tr>
			
			</tbody>
		</table>

	</div>

	<div class="col-md-12 " style="text-align: center; margin-top: 40px;">

		<a class="btn btn-primary" href="plisthome" role="button"> Back </a>

	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>

	<!-- Option 2: jQuery, Popper.js, and Bootstrap JS
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    -->
</body>
</html>

