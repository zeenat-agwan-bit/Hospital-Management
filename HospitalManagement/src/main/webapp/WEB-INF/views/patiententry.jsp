<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

<title>Patient Registration</title>
</head>
<body>
	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 4vh;">Patient's
		Registration Form :</h2>

	<div class="container-fluid">
		<div class="row justify-content-center custom-margin">
			<div class="col-md-4 col-sm-6">
				<form:form action="savepatient" modelAttribute="patient"
					method="post">

					<form class="shadow-lg p-4">

						<div class="row">

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Patient Id :</label> <input
									type="hidden" name="pid" placeholder="Patient ID"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Name :</label> <input
									type="text" name="pName" placeholder="Enter Name"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Phone :</label> <input
									type="text" name="phone" placeholder="Enter Mobile No."
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">City :</label> <input
									type="text" name="city" placeholder="Enter City"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Address :</label> <input
									type="text" name="address" placeholder="Enter Address"
									class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">State :</label> <input
									type="text" name="state" placeholder="Enter State"
									class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Age :</label> <input type="text"
									name="age" placeholder="Enter Age" class="form-control">
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

							<div class="form-group col-sm-6">
								<label class="font-weight-bold">Gender :</label>
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
								<button type="submit" class="btn btn-primary shadow-sm">Register</button>

								<a class="btn btn-primary" href="adminhomep" role="button">
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


<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page isELIgnored="false" %>

<html>
<body>
	<h3>Patient-Registration-Form</h3>
	<hr>
	<form:form action="savepatient"  modelAttribute="patient">
		<pre>
		

Email       		      <form:input path="email"/>	<form:errors path="email"/>

Password    			  <form:input path="password"/> <form:errors path="password"/>

Name          			  <form:input path="pName"/>    <form:errors path="pName"/>
                                                              
Phone        			  <form:input path="phone"/>    

City           			  <form:input path="city" /> <form:errors path="city"/>

Address         		  <form:input path="address" />  <form:errors path="address"/>

State          			  <form:input path="state"/>  <form:errors path="state"/>

Gender        			  <form:input path="gender"/>  <form:errors path="gender"/>

Age         			  <form:input path="age"/>  <form:errors path="age"/>

Blood Group        		  <form:input path="blood"/>  <form:errors path="blood"/>



                    <input type="submit" value="REGISTER">
        <pre>

	</form:form>
	<hr>
	<a href="adminhomep">Back</a>
</body>
</html>

	

	 --%>