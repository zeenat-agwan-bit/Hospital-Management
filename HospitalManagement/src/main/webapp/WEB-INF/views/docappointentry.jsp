<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<html>
<body>
	<h3>Booking-Entry-Form For Doctor ${email}</h3>
	<hr>
	<form:form action="savedocappoint" method="post"
		modelAttribute="appointbooking">
		<pre>
			 Appointment ID :<form:hidden path="aid" />
 			Time :			<form:input path="time" />
			Date :			<form:input path="date" />
			Fees :			<form:input path="fees" />
			Diagnosis :		<form:textarea path="diagnosis" />
			Treatment :		<form:textarea path="treatment" />
			Patient	ID :	<form:select path="patient.pid" items="${ids}" />
<input type="submit" value="BOOK" />
</pre>
	</form:form>


	<a href="doctorhomea">BACK </a>
	<hr>
</body>
</html> --%>


<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="com.pushkal.domain.*"%>
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
				<form:form action="savedocappoint" modelAttribute="appointbooking"
					method="post">

					<form class="form-container">
						<h2
							style="text-align: center; font-weight: bold; font-size: 30px; color: white;">Booking-Entry-Form
							For Doctor ${email}</h2>

						<div class="row">
							<div class="form-group col-sm-6">
								<label for="exampleInputEmail1"
									class="font-weight-bold text-white">Doctor's Email :</label> <input
									type="text"  name="doctor.email" placeholder="Enter Your Email"
									class="form-control">
							</div>



							<div class="form-group col-sm-6">
								<label for="exampleInputPassword1"
									class="font-weight-bold text-white">Date :</label>
								<input type="date" name="date" placeholder="dd/MM/yyyy"
									class="form-control" >
							</div>

							<div class="form-group col-sm-6">
								<label for="inputState" class="font-weight-bold text-white">Time
									Slot</label> <select id="inputState" class="form-control" name="time">
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
								<label class="font-weight-bold text-white">Fees :</label> <input
									type="text" name="fees" placeholder="Enter Fees."
									class="form-control">
							</div>



							<div class="form-group col-sm-6">
								<label for="exampleFormControlTextarea1"
									class="font-weight-bold text-white">Diagnosis :</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="3" name="diagnosis" placeholder="Enter Diagnosis"></textarea>
							</div>

							<div class="form-group col-sm-6">

								<label for="exampleFormControlTextarea1"
									class="font-weight-bold text-white">Treatment :</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									name="treatment" placeholder="Treatement" rows="3"></textarea>
							</div>

							<div class="form-group col-sm-6">

								<label for="exampleFormControlTextarea1"
									class="font-weight-bold text-white">Patient Id</label>

								<form:select path="patient.pid" items="${ids}" />
							</div>


							<div class="form-group col-md-12 "
								style="text-align: center; margin-top: 20px;">
								<button type="submit" class="btn btn-primary">Book</button>

								<a class="btn btn-primary" href="doctorhomea" role="button">
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


