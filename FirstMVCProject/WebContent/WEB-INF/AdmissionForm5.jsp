<html>
	<body>
		<h1>FORM 5</h1>
		
		<h1>${headerMessage}</h1>
		
		<h1>STUDENT ADMISSION FORM FOR TAILORED PROGRAMS</h1>
		
		<form action="/FirstMVCProject/submitAdmissionForm5.html" method="post">
			
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
			<p>
			<input type="submit" value="Submit this form by clicking here"/>
			</p>
		</form>
	</body>
</html>