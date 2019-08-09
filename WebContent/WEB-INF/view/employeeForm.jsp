<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>Enter you employee details</h2>
<br>
<form:form action="employeeConfirmationPageMethod" modelAttribute="employee">
	Name: <form:input type="text" path="name"/><br>
	
	Surname:<form:input type="text" path="surname"/><br>
	Employee ID: <form:input type="text" path="empId"/><br>
	<form:select path="countryName">
		<form:options items="${employee.ll}"/>
	</form:select><br>
	
	Programming Language: <form:radiobuttons path="programmingLanguage" items="${employee.lhm}" /><br>
	
	<!-- creating checkboxes with different labels and binding it to 'operatingSystems' in my Employee class-->
	What operating system(s) are you familiar with: 
	<form:checkbox path = "operatingSystems" value = "win" label="Windows 10"></form:checkbox>
	<form:checkbox path = "operatingSystems" value = "mac" label="Macintosh"></form:checkbox>
	<form:checkbox path = "operatingSystems" value = "lin" label="Linux"></form:checkbox>
	<br>
	
	<input type="submit" value="REGISTER"/>
</form:form>

