package com.plantplaces.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.inject.Named;

import org.apache.tomcat.util.http.fileupload.IOUtils;

/**
 * Re-usable file implementation
 * @author YasserAlejandro
 *
 */
@Named
public class FileDAO implements IFileDAO  {
	
	/**
	 * Save data from an input stream to an output location.
	 * @param inputStream
	 * @param file
	 * @throws IOException
	 */
	@Override
	public void save(InputStream inputStream,File file) throws IOException {
		//we are preparing an output stream so that we can write data to that specified file.
		OutputStream output = new FileOutputStream(file);
		//Copy the inputstream to the output location.
		IOUtils.copy(inputStream,output);	
	}
	
	

}
