<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false" %>
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
.custom-margin {
	margin-top: 5vh;
}
</style>

<title>Update Patient Details</title>
</head>
<body>
	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 4vh;">Patient's
		Update Form :</h2>

	<div class="container-fluid">
		<div class="row justify-content-center custom-margin">
			<div class="col-md-4 col-sm-6">
				<form:form action="savepatient" modelAttribute="patient"
					method="post">

					<form class="shadow-lg p-4">

						<div class="row">
						${patient.pid}
								<input type="hidden" name="pid" placeholder="Id" 
									class="form-control" >
							

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Name :</label>
								<form:input type="text" path="pName" placeholder="Enter Name"
									class="form-control" />
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Phone :</label>
								<form:input type="text" path="phone"
									placeholder="Enter Mobile No." class="form-control" />
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">City :</label>
								<form:input type="text" path="city" placeholder="Enter City"
									class="form-control" />
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Address :</label>
								<form:input type="text" path="address"
									placeholder="Enter Address" class="form-control" />
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">State :</label>
								<form:input type="text" path="state" placeholder="Enter State"
									class="form-control" />
							</div>


							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Age :</label>
								<form:input type="text" path="age" placeholder="Enter Age"
									class="form-control" />
							</div>





							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Gender :</label>
								<form:radiobutton path="gender" value="Male" />
								Male
								<form:radiobutton path="gender" value="Female" />
								Female

							</div>


							<div class="form-group col-sm-6">
								<label for="exampleFormControlSelect1" class="font-weight-bold">Blood
									Group :</label> <select name="blood" class="form-control"
									id="exampleFormControlSelect1">
									<option>A+</option>
									<option>A-</option>
									<option>B+</option>
									<option>B-</option>
									<option>O+</option>
									<option>O-</option>
									<option>AB+</option>
									<option>AB-</option>

								</select>
							</div>


							<div class="form-group col-md-12 "
								style="text-align: center; margin-top: 20px;">
								<button type="submit" class="btn btn-primary shadow-sm">UPDATE</button>

								<a class="btn btn-primary" href="plisthome" role="button">
									Back </a>
							</div>
						</div>
					</form>
				</form:form>
			</div>
		</div>
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

