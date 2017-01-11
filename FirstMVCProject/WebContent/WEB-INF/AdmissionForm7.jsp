<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<body>
		<h1>FORM 7</h1>
		
		<h1>${headerMessage}</h1>
		
		<h1>STUDENT ADMISSION FORM FOR TAILORED PROGRAMS</h1>
		
		<form:errors path="student7.*"/>
		
		<form action="/FirstMVCProject/submitAdmissionForm7.html" method="post">
			
			<table>
				<tr>
					<td>Student's Name :</td>
					<td>
						<input type="text" name="studentName" />
					<td>
				</tr>
				<tr>
					<td>Studen's hobby :</td>
					<td>
						<input type="text" name="studentHobby" />
					</td>
				</tr>
				<tr>
					<td>Student's mobile</td>
					<td>
						<input type="text" name="studentMobile"/>
					</td>
				</tr>
				<tr>
					<td>Student's DOB</td>
					<td>
						<input type="text" name="studentDOB" />
					</td>
					
				</tr>
				<tr>
					<td>Student's skills set</td>
					<td>
						<select name="studentSkills" multiple>
							<option value="Java Core">Java Core</option>
							<option value="Spring Core">Spring Core</option>
							<option value="Spring MVC">Spring MVC</option>
						</select>
					</td>
				</tr>
			</table>
			
			<table>
				<tr>
					<td>Student's Address: </td>
				</tr>
				<tr>
					<td>country: <input type="text" name="studentAddress.country"/> </td>
					<td>city: <input type="text" name="studentAddress.city"/> </td>
					<td>street <input type="text" name="studentAddress.street"/></td>
					<td>pinCode <input type="text" name="studentAddress.pincode"/></td>
				</tr>
			</table>
			<p>
			<input type="submit" value="Submit this form by clicking here"/>
			</p>
		</form>
	</body>
</html>