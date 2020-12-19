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


<title>Reception Page.</title>


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




					<li class="nav-item active"><a class="nav-link"
						href="login.jsp">Sign Out <span class="sr-only">(current)</span></a>
					</li>
				</ul>

			</div>
		</nav>



	</div>

	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: white; margin-top: 20px;">HELLO
		Receptionist ${username} !</h2>
	</br>


	<div class="list-group list-container col-md-4 text right">



		<a href="recpatiententry"
			class="list-group-item list-group-item-action active">Add Patient</a>
		<a href="recpatientlist"
			class="list-group-item list-group-item-action ">Patient List</a> <a
			href="recappointentry"
			class="list-group-item list-group-item-action active">Add
			Appointment</a> <a href="recappointlist"
			class="list-group-item list-group-item-action  ">Appointment List</a>


		<a href="index.jsp" class="list-group-item list-group-item-danger">Sign
			Out</a>

	</div>


</body>
</html>
