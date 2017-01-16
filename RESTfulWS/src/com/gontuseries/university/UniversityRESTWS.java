package com.gontuseries.university;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.FormParam;

//import java.io.File;

@Path("/university")
public class UniversityRESTWS {
	
	
	
	@POST
	@Path("/add")
	public String addStudentInfo(
			@FormParam("name") String name,
			@FormParam("age") int age
			){
		
		return "Web Services has added the student's information with name: "
				+name +" , and age : " +age;	
	}
	
	
	///*
	
	//Below is an example of matrix parameters
	//http://localhost:8080/RESTfulWS/rest/university;studentRollNo1=5;studentRollNo2=6
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentsInfo3(
			@MatrixParam("studentRollNo1") String studentRollNo1,
			@MatrixParam("studentRollNo2") String studentRollNo2){
		
		return "You sent me two roll numbers using matrixParam annotation---> "
				+studentRollNo1 +" and " +studentRollNo2 ;
	}
	
	
	/*
	 
	//Below is an example with QueryParameters
	 * http://localhost:8080/RESTfulWS/rest/university?studentRollNo1=5&studentRollNo2=6
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentsInfo2(
			@QueryParam("studentRollNo1") String studentRollNo1,
			@QueryParam("studentRollNo2") String studentRollNo2){
		
		return "You sent me two roll numbers using query parameters in the http url--> "
				+ studentRollNo1 +" and " + studentRollNo2;
	}
	
	
	*/
	
	//Below is an example of simple pathParam
	//http://localhost:8080/RESTfulWS/rest/university/4/5
	@GET
	@Path("{studentRollNo1}/{studentRollNo2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentsInfo1(
			@PathParam("studentRollNo1") String studentRollNo1,
			@PathParam("studentRollNo2") String studentRollNo2){
		
		return "You sent me two roll numbers using pathParam annotation ----> "
				+ studentRollNo1 +" and " + studentRollNo2;
	}
	
	
	/*
	
	//http://localhost:8080/RESTfulWS/rest/university
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo0(){
		return "<html> "+"<title>"+"University Information" +"</title>"
		+ "<body><h1>"+"Name- University of London from HTML TONTO"+"</h1></body>"+"</html>";		
	}
	
	
	//http://localhost:8080/RESTfulWS/rest/university/5
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo){
		
		return "Updated Succesfully";
	}
	
	*/
	/*
	

	
	
	//http://localhost:8080/RESTfulWS/rest/university
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo(){
		return "NAME- University of London from Plain TXT";
	}
	

	

	
	*/
	

}
