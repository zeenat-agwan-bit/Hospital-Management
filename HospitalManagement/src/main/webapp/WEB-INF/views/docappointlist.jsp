<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
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


<title>Appointment List</title>
</head>
<body>

	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 20px;">Appointment
		Booked By Doctor ${username} .</h2>

	<div style="text-align: center; margin-bottom: 2vh;">

		<a class="btn btn-primary btn-sm" href="doctorhomep" role="button">
			Back </a>

	</div>

	<div class="table-responsive text-center">
		<table class="table table-bordered  table-sm table-striped ">
			<tr class="bg-dark text-white">

				<th scope="col">Appointment Id</th>
				<th scope="col">Time</th>
				<th scope="col">Date</th>
				<th scope="col">Fees</th>
				<th scope="col">Diagnosis</th>
				<th scope="col">Treatment</th>
				<th scope="col">Doctor Mail</th>
				<th scope="col">Patient Id</th>
				<th scope="col">Name</th>
				<th scope="col">Phone</th>
				<th scope="col">City</th>
				<th scope="col">Address</th>
				<th scope="col">State</th>
				<th scope="col">Gender</th>
				<th scope="col">Age</th>
				<th scope="col">Blood Group</th>
				<!-- 	<th scope="col">Actions</th> -->

			</tr>


			<tbody>
				<jstl:forEach items="${alist}" var="appoint">

					<tr>
						<td class="table-dark">${appoint.aid}</td>
						<td class="table-dark">${appoint.time}</td>
						<td class="table-dark">${appoint.date}</td>
						<td class="table-dark">${appoint.fees}</td>
						<td class="table-dark">${appoint.diagnosis}</td>
						<td class="table-dark">${appoint.treatment}</td>
						<td class="table-dark">${appoint.doctor.email}</td>
						<td class="table-dark">${appoint.patient.pid}</td>
						
						<td class="table-dark">${appoint.patient.pName}</td>
						<td class="table-dark">${appoint.patient.phone}</td>
						<td class="table-dark">${appoint.patient.city}</td>
						<td class="table-dark">${appoint.patient.address}</td>
						<td class="table-dark">${appoint.patient.state}</td>
						<td class="table-dark">${appoint.patient.gender}</td>
						<td class="table-dark">${appoint.patient.age}</td>
						<td class="table-dark">${appoint.patient.blood}</td>


						<%-- <td class="table-dark"><a
							href="updatedocpatient?pid=${patient.pid}"
							class="btn badge-primary badge btn-sm active" role="button"
							aria-pressed="true">UPDATE</a> <a
							href="deletedocpatient?pid=${patient.pid}"
							class="btn badge-secondary badge btn-sm active" role="button"
							aria-pressed="true">DELETE</a></td> --%>
					</tr>
				</jstl:forEach>

			</tbody>
		</table>

	</div>

	<div class="col-md-12 " style="text-align: center; margin-top: 40px;">

		<a class="btn btn-primary" href="doctorhomep" role="button"> Back
		</a>

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

