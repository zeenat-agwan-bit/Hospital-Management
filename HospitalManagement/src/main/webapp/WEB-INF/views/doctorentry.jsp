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

<title>Doctor Registration</title>
</head>
<body>
	<div class="col-md-6 text right">
		<br />
		<section class="container-fluid">
			<section class="row-justify-content-center">
				<form:form action="savedoctor" modelAttribute="doctor" method="post">

					<form class="form-container shadow-lg text-white">
						<h2
							style="text-align: center; font-weight: bold; font-size: 30px; color: white;">Doctor's
							Registration Form :</h2>

						<div class="row">
							<div class="form-group col-sm-6">
								<label for="exampleInputEmail1" class="font-weight-bold text-white">Email :</label> <form:input
									type="email" placeholder="Enter Email" path="email"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp"/> <small id="emailHelp"
									class="form-text text-white">We'll never share your
									email with anyone else.</small>
							</div>


							<div class="form-group col-sm-6">
								<label for="exampleInputPassword1" class="font-weight-bold text-white">Password :</label> <input
									type="password" name="password" placeholder="Enter Password"
									class="form-control" id="exampleInputPassword1">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold text-white">Name :</label> <input type="text" name="dname"
									placeholder="Enter Name" class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold text-white">Phone :</label> <input type="text" name="phone"
									placeholder="Enter Mobile No." class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold text-white">City :</label> <input type="text" name="city"
									placeholder="Enter City" class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold text-white">Address :</label> <input type="text" name="address"
									placeholder="Enter Address" class="form-control">
							</div>

							<div class="form-group col-sm-6">
								<label class="font-weight-bold text-white">State :</label> <input type="text" name="state"
									placeholder="Enter State" class="form-control">
							</div>


							<div class="form-group col-sm-6">
								<label for="exampleFormControlSelect1" class="font-weight-bold text-white">Qualification :</label> <select
									name="qualification" placeholder="Select Qualification"
									class="form-control" id="exampleFormControlSelect1">
									<option>MBBS</option>
									<option>MPhil</option>
									<option>PhD</option>
									<option>DPhil</option>
									<option>DClinSurg</option>
									<option>MD(Res)</option>
									<option>MCM</option>
									<option>MSurg</option>
									<option>MD</option>
									<option>DO</option>
									<option>MSc</option>
									<option>DCM</option>
									<option>DMSc</option>
									<option>MMedSc</option>
									<option>DSurg</option>
									<option>DMedSc</option>

								</select>
							</div>

							<div class="form-group col-sm-6">
								<label for="exampleFormControlSelect1" class="font-weight-bold text-white">Specialization :</label>
								<select name="specialization"
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
								<label class="font-weight-bold text-white">Gender :</label>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="customRadioInline1" name="gender"
										value="male" name="customRadioInline1"
										class="custom-control-input"> <label
										class="custom-control-label text-white" for="customRadioInline1">Male
									</label>
								</div>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="customRadioInline2" name="gender"
										value="female" name="customRadioInline1"
										class="custom-control-input"> <label
										class="custom-control-label text-white" for="customRadioInline2">Female
									</label>
								</div>
							</div>


							<div class="form-group col-md-12 "
								style="text-align: center; margin-top: 20px;">
								<button type="submit" class="btn btn-primary shadow-sm">Register</button>

								<a class="btn btn-primary" href="adminhomed" role="button">
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




<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page isELIgnored="false" %>

<html>
<body>
	<h3>Doctor-Registration-Form</h3>
	<hr>
	<form:form action="savedoctor"  modelAttribute="doctor">
		<pre>
		

Email       		      <form:input path="email"/>	<form:errors path="email"/>

Password    			  <form:input path="password"/> <form:errors path="password"/>

Name          			  <form:input path="dname"/>    <form:errors path="dname"/>
                                                              
Phone        			  <form:input path="phone"/>    

City           			  <form:input path="city" /> <form:errors path="city"/>

Address         		  <form:input path="address" />  <form:errors path="address"/>

State          			  <form:input path="state"/>  <form:errors path="state"/>

Gender        			  <form:input path="gender"/>  <form:errors path="gender"/>

Qualification  	     	  <form:input path="qualification"/>  <form:errors path="qualification"/>

Specialization    	      <form:input path="specialization"/>  <form:errors path="specialization"/>

		


                    <input type="submit" value="REGISTER">
        <pre>

	</form:form>
	<hr>
	<a href="adminhomed">Back</a>
</body>
</html>

		
		
		
		 --%>