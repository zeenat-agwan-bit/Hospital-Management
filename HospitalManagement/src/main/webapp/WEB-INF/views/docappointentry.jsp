<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
</html>