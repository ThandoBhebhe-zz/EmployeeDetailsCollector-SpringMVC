<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Employee Confirmation</title>
</head>

	<p>
	You are now register as<br>
	Name: ${employee.name}<br>	
	Surname: ${employee.surname}<br>
	Employee ID: ${employee.empId}<br>
	Programming Language: ${employee.programmingLanguage}<br>
	From: ${employee.countryName}<br>
	Operating System(s): <br>
	</p>
	
	<!-- looping over operating system entries and printing each one -->
	<ul>
	<c:forEach var="temp" items="${employee.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
	</ul>

</html>