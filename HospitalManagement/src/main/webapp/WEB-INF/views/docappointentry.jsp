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


		<%-- Name :
		<spring:bind path="patient.pName">
			<input type="text" name="pName">
		</spring:bind>
		
		</br> --%>
		 Patient Id :
		<spring:bind path="patient.pid">
			<input type="text" name="pid">
		</spring:bind>


	<%-- 	</br> Phone :
		<spring:bind path="patient.phone">
			<input type="text" name="phone">
		</spring:bind> --%>
	</form:form>

	<form:form action="savedocappoint" method="post"
		modelAttribute="appointbooking">
 
 		 Appointment ID :
		<spring:bind path="appointbooking.ap_id">
			<input type="text" name="aid">
		</spring:bind>


		</br> Time :
		<spring:bind path="appointbooking.time">
			<input type="text" name="time">
		</spring:bind>

		</br> Date :
		<spring:bind path="appointbooking.date">
			<input type="text" name="date">
		</spring:bind>

		</br> Fees :
		<spring:bind path="appointbooking.fees">
			<input type="text" name="fees">
		</spring:bind>


		</br> Diagnosis :
		<spring:bind path="appointbooking.diagnosis">
			<input type="text" name="diagnosis">
		</spring:bind>


		</br> Treatment :
		<spring:bind path="appointbooking.treatment">
			<input type="text" name="treatment">
		</spring:bind>
		</br>
		<input type="submit" value="Register" />
	</form:form>
	<a href="doctorhomea">BACK </a>
	<hr>
</body>
</html>