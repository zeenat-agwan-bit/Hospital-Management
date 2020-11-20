<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />

<style type="text/css">
.form-container {
	position: absolute;
	top: 2vh;
	background: #fff;
	padding: 10px;
	border-radius: 10px;
	box-shadow: 0px 0px 10px 0px #000;
	background: #fff;
}

.margin-right {
	margin-right: 80px !important;
}
</style>

<title>Appointment Form</title>
</head>
<body>
	<div class="col-md-6 text right">
		<br />
		<section class="container-fluid">
			<section class="row-justify-content-center">
				<form:form action="saveappointment" modelAttribute="appointment"
					method="post">

					<form class="form-container">
						<h2
							style="text-align: center; font-weight: bold; font-size: 30px; color: white;">Admin's
							Appointment Form :</h2>

						<div class="row">
							<div class="form-group col-sm-6">
								<label for="exampleInputEmail1">Appointment Id :</label> <input
									type="text" placeholder="Enter Appointment Id" name="ap_id"
									class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label>Patient Id :</label>
								
								<input type="text" name="patient_id"
									placeholder="Enter Patient Id" class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label>Patient Name :</label>
								<
								<input type="text" name="name"
									placeholder="Enter Patient Name" class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label>Patient Phone :</label>
								<%-- <form:select path="patient.name" items="${emails}" />
								 --%>
								<input type="text" name="phone"
									placeholder="Enter Patient Phone" class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label for="exampleInputPassword1">Date :</label> <input
									type="text" name="date" placeholder="Enter Appointment Date"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label>Time :</label> <input type="text" name="time"
									placeholder="Enter Appointment Time" class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label>Fees :</label> <input type="text" name="fees"
									placeholder="Enter Fees." class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label>Diagnosis :</label> <input type="text" name="diagnosis"
									placeholder="Enter Diagnosis" class="form-control">
							</div>



							<div class="form-group col-sm-6">

								<label for="exampleFormControlTextarea1">Treatment :</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									name="treatment" placeholder="Enter Treatement" rows="3"></textarea>
							</div>



							<div class="form-group col-md-12 "
								style="text-align: center; margin-top: 20px;">
								<button type="submit" class="btn btn-primary">Register</button>

								<a class="btn btn-primary" href="adminhomeb" role="button">
									Back </a>
							</div>
						</div>
					</form>
				</form:form>
			</section>
		</section>
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


