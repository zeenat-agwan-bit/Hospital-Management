<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page import="com.pushkal.domain.* , java.util.*"%>
<%@page
	import="java.util.List , com.pushkal.domain.Patient,com.pushkal.domain.AppointmentBooking"%>
<%@page isELIgnored="false"%>
<html>
<body>
	<h3>Booking-Entry-Form For Doctor ${email}</h3>
	<hr>
	<form:form action="savedocappoint" method="post"
		modelAttribute="patient">


		Name :
		<spring:bind path="patient.pName">
			<input type="text" name="pName">
		</spring:bind>
		</br> Mail :
		<spring:bind path="patient.email">
			<input type="email" name="email">
		</spring:bind>


		</br> Phone :
		<spring:bind path="patient.phone">
			<input type="text" name="phone">
		</spring:bind>
	</form:form>

	<form:form action="savedocappoint" method="post"
		modelAttribute="appointbooking">
 
 		 ID :
		<spring:bind path="appointbooking.ap_id">
			<input type="text" name="ap_id">
		</spring:bind>


		</br> Time :
		<spring:bind path="appointbooking.time">
			<input type="time" name="time">
		</spring:bind>

		</br> Date :
		<spring:bind path="appointbooking.date">
			<input type="date" name="date">
		</spring:bind>

		</br> CNP :
		<spring:bind path="appointbooking.cnp">
			<input type="text" name="cnp">
		</spring:bind>


		</br> Fees :
		<spring:bind path="appointbooking.fees">
			<input type="text" name="fees">
		</spring:bind>


		</br> Description :
		<spring:bind path="appointbooking.description">
			<input type="text" name="description">
		</spring:bind>
		</br>
		<input type="submit" value="Register" />
	</form:form>
	<a href="doctorhomea">BACK </a>
	<hr>
</body>
</html>