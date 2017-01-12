<html>
	<body>
		<h1>${headerMessage}</h1>
		
		<h3>Congratulations if you want a practical class, enroll at Birkbeck
		if you prefer more theoretical knowledge, enroll at UCL or King's College
		</h3>
		
		<h2>Details submitted by you::</h2>
		
		<table>
			<tr>
				<td>Student Name: </td>
				<td>${student7.studentName}</td>
			</tr>
			<tr>
				<td>Student Hobby: </td>
				<td>${student7.studentHobby}</td>
			</tr>
			<tr>
				<td>Student Mobile :</td>
				<td>${student7.studentMobile}</td>
			</tr>
			<tr>
				<td>Student DOB: </td>
				<td>${student7.studentDOB}</td>
			<tr>
				<td>Student skills: </td>
				<td>${student7.studentSkills}</td>
			</tr>
			<tr>
				<td>Student Address: </td>
				<td>country: ${student7.studentAddress.country}
					city:    ${student7.studentAddress.city}
					street:  ${student7.studentAddress.street}
					pincode: ${student7.studentAddress.pincode}
				</td>	
			</tr>
			
			
		</table>

	</body>
</html>