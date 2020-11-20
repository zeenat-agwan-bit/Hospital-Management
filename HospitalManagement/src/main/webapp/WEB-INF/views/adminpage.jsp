<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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

<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<style type="text/css">
.list-container {
	position: absolute;
	top: 20vh;
	margin-left: 530px;
}
</style>


<title>Administration</title>

</head>
<body>


	<div class="container-fluid p-0 m-0">

		<!-- <div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
hello
</button>
<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
<a class="dropdown-item" href="doctorentry">Add Doctor</a>
 <a class="dropdown-item" href="doctorlist">Doctor List</a>


</div>

</div> -->



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

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" role="button"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Doctor </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">

							<a class="dropdown-item" href="doctorentry">Add Doctor</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="doctorlist">Doctor List</a>
						</div></li>


					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Receptionist </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">

							<a class="dropdown-item" href="recepentry">Add Receptionist</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="receplist">Receptionist List</a>
						</div></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Patient</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">

							<a class="dropdown-item" href="">Add Patient</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="">Patient List</a>
						</div></li>


					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Appointment</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">

							<a class="dropdown-item" href="appointentry">Add Appointment</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="appointlist">Appointment List</a>
						</div></li>


					<li class="nav-item active"><a class="nav-link"
						href="login.jsp">Sign Out <span class="sr-only">(current)</span></a>
					</li>
				</ul>

			</div>
		</nav>



	</div>


	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 20px;">Welcome
		To The Administration Page !</h2>
	</br>


	<div class="list-group list-container col-md-4 text right">

		<a href="doctorentry"
			class="list-group-item list-group-item-action active">Add Doctor</a>
		<a href="doctorlist" class="list-group-item list-group-item-action ">Doctor
			List</a> <a href="recepentry"
			class="list-group-item list-group-item-action active">Add
			Receptionist</a> <a href="receplist"
			class="list-group-item list-group-item-action ">Receptionist List</a>
		<a href="appointentry"
			class="list-group-item list-group-item-action active">Add
			Appointment</a> <a href="appointlist"
			class="list-group-item list-group-item-action  ">Appointment List</a>
		<a href="patiententry"
			class="list-group-item list-group-item-action active">Add Patient</a>
		<a href="patientlist" class="list-group-item list-group-item-action ">Patient
			List</a> <a href="index.jsp"
			class="list-group-item list-group-item-danger">Sign Out</a>

	</div>

	<!-- <pre>
		
		<a href="doctorentry">Add Doctor</a>
		
		<a href="doctorlist">Doctor List</a>
		
		<a href="recepentry">Add Receptionist</a>
		
		<a href="receplist">Receptionist List</a>
		
		<a href="appointentry">Add Appointment</a>
		
		<a href="appointlist">Appointment List</a>
		
		<a href="patiententry">Add Patient</a>
		
		<a href="patientlist">Patient List</a>
				
		
		<a href="index.jsp">LOGOUT</a>
		
	</pre>



 -->



</body>
</html>