<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page import="java.util.List , com.pushkal.domain.*"%>
<%@page isELIgnored="false"%>

<!Doctype html>
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

<title>Patient Registration</title>
</head>
<body>
	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 4vh;">
		Registration Form :</h2>

	<div class="container-fluid">
		<div class="row justify-content-center custom-margin">
			<div class="col-md-4 col-sm-6">
				<form:form action="savenewpatient" modelAttribute="patient"
					method="post">

					<form class="shadow-lg p-6 text-white">

						<div class="row">
						
						
						<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">Patient ID :</label> <input
									type="hidden" name="pid" placeholder="Patient Id"
									class="form-control">
							</div>
							

							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">Name :</label> <input
									type="text" name="pName" placeholder="Enter Name"
									class="form-control">
							</div>
							
				

							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">Phone :</label> <input
									type="text" name="phone" placeholder="Enter Mobile No."
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">City :</label> <input
									type="text" name="city" placeholder="Enter City"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">Address :</label> <input
									type="text" name="address" placeholder="Enter Address"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">State :</label> <input
									type="text" name="state" placeholder="Enter State"
									class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">Age :</label> <input type="text"
									name="age" placeholder="Enter Age" class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label for="exampleFormControlSelect1" class="font-weight-bold font-white">Blood
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

	<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white" >Doctor :</label> <input type="text" name="doctor.dname"
									placeholder="select doctor" class="form-control">
							</div>





							<div class="form-group col-sm-6">
								<label for="exampleFormControlSelect1" class="font-weight-bold font-white">Specialization : 
									</label> <select name="doctor.specialization"
									placeholder="Select Specialization" class="form-control"
									id="exampleFormControlSelect1">
									<option>Allergy</option>
									<option>Anesthesiology</option>
									<option>Dermatology</option>
									<option>Emergency Medicine</option>
									<option>Family Medicine</option>
									<option>Gynecology</option>
									<option>Immunology</option>
									<option>Internal Medicine</option>
									<option>Medical Genetics</option>
									<option>Neurology</option>
									<option>Ophthalmology</option>
									<option>Pathology</option>
									<option>Pediatrics</option>
									<option>Psychiatry</option>
									<option>Surgery</option>
									<option>Urology</option>

								</select>
							</div>


							<div class="form-group col-sm-6">
								<label for="exampleInputPassword1" class="font-weight-bold font-white">Date
									:</label> <input type="text" name="appointmentbooking.date"
									placeholder="dd/mm/yyyy" class="form-control"
									id="exampleInputPassword1">
							</div>



							<div class="form-group col-sm-6">
								<label for="inputState" class="font-weight-bold font-white">Time
									Slot :</label> <select id="inputState" class="form-control"
									name="appointmentbooking.time">
									<option selected>Choose...</option>

									<option>10:00-10:15 AM</option>
									<option>10:15-10:30 AM</option>
									<option>10:30-10:45 AM</option>
									<option>10:45-11:00 AM</option>

									<option>11:00-11:15 AM</option>
									<option>11:15-11:30 AM</option>
									<option>11:30-11:45 AM</option>
									<option>11:45-12:00 PM</option>


									<option>12:00-12:15 PM</option>
									<option>12:15-12:30 PM</option>
									<option>12:30-12:45 PM</option>
									<option>12:45-01:00 PM</option>

									<option>1:00-1:15 PM</option>
									<option>1:15-1:30 PM</option>
									<option>1:30-1:45 PM</option>
									<option>1:45-2:00 PM</option>


									<option>2:00-2:15 PM</option>
									<option>2:15-2:30 PM</option>
									<option>2:30-2:45 PM</option>
									<option>2:45-3:00 PM</option>

									<option>3:00-3:15 PM</option>
									<option>3:15-3:30 PM</option>
									<option>3:30-3:45 PM</option>
									<option>3:45-4:00 PM</option>

									<option>4:00-4:15 PM</option>
									<option>4:15-4:30 PM</option>
									<option>4:30-4:45 PM</option>
									<option>4:45-5:00 PM</option>

									<option>5:00-5:15 PM</option>
									<option>5:15-5:30 PM</option>
									<option>5:30-5:45 PM</option>
									<option>5:45-6:00 PM</option>

									<option>6:00-6:15 PM</option>
									<option>6:15-6:30 PM</option>
									<option>6:30-6:45 PM</option>
									<option>6:45-7:00 PM</option>

									<option>7:00-7:15 PM</option>
									<option>7:15-7:30 PM</option>
									<option>7:30-7:45 PM</option>
									<option>7:45-8:00 PM</option>

									<option>8:00-8:15 PM</option>
									<option>8:15-8:30 PM</option>
									<option>8:30-8:45 PM</option>
									<option>8:45-9:00 PM</option>

									<option>9:00-9:15 PM</option>
									<option>9:15-9:30 PM</option>
									<option>9:30-9:45 PM</option>
									<option>9:45-10:00 PM</option>

									<option>10:00-10:15 PM</option>
									<option>10:15-10:30 PM</option>
									<option>10:30-10:45 PM</option>
									<option>10:45-11:00 PM</option>


								</select>
							</div>


							<div class="form-group col-sm-6">
								<label for="exampleFormControlTextarea1"
									class="font-weight-bold font-white">Diagnosis :</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="3" name="appointmentbooking.diagnosis"
									placeholder="Enter Diagnosis"></textarea>
							</div>




							<div class="form-group col-sm-6">
								<label class="font-weight-bold font-white">Gender :</label>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="customRadioInline1" name="gender"
										value="male" name="customRadioInline1"
										class="custom-control-input"> <label
										class="custom-control-label" for="customRadioInline1">Male
									</label>
								</div>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="customRadioInline2" name="gender"
										value="female" name="customRadioInline1"
										class="custom-control-input"> <label
										class="custom-control-label" for="customRadioInline2">Female
									</label>
								</div>
							</div>




							<div class="form-group col-md-12 "
								style="text-align: center; margin-top: 20px;">
								<button type="submit"
									class="btn btn-warning shadow-sm text-italic">BOOK NOW</button>

								<a class="btn btn-warning" href="index.jsp" role="button">
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