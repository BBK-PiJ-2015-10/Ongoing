package com.gontuseries.university;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
//import javax.ws.rs.GET;
import javax.ws.rs.PUT;
//import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
//import com.sun.jersey.multipart.FormDataParam;

//import javax.ws.rs.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
//import org.glassfish.jersey.multipart.FormDataParam;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Path("/university")
public class UniversityRESTWS {
	
	/*
	 * This service is fed via webform http://localhost:8080/RESTfulWS/uploadform.html
	 * it selects a file from the form and saves it to a specific file location.
	 */
	
	///*
	 
	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public String uploadFile(
			@FormDataParam("file") InputStream uploadedInputStream,
		    @FormDataParam("file") FormDataContentDisposition fileDetail){
		
		saveToDisk(uploadedInputStream,fileDetail);
		
		return "File uploaded succesfully!!";
	}
	
	private void saveToDisk(InputStream uploadedInputStream,
			FormDataContentDisposition fileDetail){
		
		String uploadedFileLocation = "C:\\Users\\YasserAlejandro\\Dropbox\\MSc Computer Science Birkbeck\\Project Ext\\WebServices\\tonto\\" +fileDetail.getFileName();
		
		try {
			
			OutputStream out = new FileOutputStream(new File(uploadedFileLocation));
			
			int read =0;
			
			byte[] bytes = new byte[1024];
			
			out = new FileOutputStream(new File(uploadedFileLocation));
			
			while((read=uploadedInputStream.read(bytes))!=-1){
				out.write(bytes,0,read);
			}
			out.flush();
			out.close();
			
		} catch (IOException ex){
			ex.printStackTrace();
		}
		
		
	}
	
	
	//*/
	  
	///*
	
	//When the user enters the url http://localhost:8080/RESTfulWS/rest/university/get
	//This service will provide a file to the user
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getStudentFile(){
		
		String fileAddress = "C:\\Users\\YasserAlejandro\\Dropbox\\MSc Computer Science Birkbeck\\Project Ext\\WebServices\\hey.txt";
		File file = new File(fileAddress);
		
		ResponseBuilder response = Response.ok((Object)file);
		response.header("Content-Disposition","attachment; filename=DisplayName-hey.txt");
		return response.build();
		
	}
	
	//*/
	
	/* In this example data is entered through a form http://localhost:8080/RESTfulWS/entryform.html
	 * the submit button calls this webservice and @FormParam reads the parameters from the form.
	 */
	
	///*
	
	@POST
	@Path("/add")
	public String addStudentInfo(
			@FormParam("name") String name,
			@FormParam("age") int age
			){
		
		return "Web Services has added the student's information with name: "
				+name +" , and age : " +age;	
	}
	
	//*/
	
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
	
	//*/
	
	/*
	 
	//Below is an example with QueryParameters
	// * http://localhost:8080/RESTfulWS/rest/university?studentRollNo1=5&studentRollNo2=6
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
	
	//*/
	
	/*
	
	//http://localhost:8080/RESTfulWS/rest/university
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo0(){
		return "<html> "+"<title>"+"University Information" +"</title>"
		+ "<body><h1>"+"Name- University of London from HTML TONTO"+"</h1></body>"+"</html>";		
	}
	
	*/
	
	/*
	
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
