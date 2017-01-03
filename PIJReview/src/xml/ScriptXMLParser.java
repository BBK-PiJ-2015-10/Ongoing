package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;

//import javax.xml.xpath.XPathFactory;
//import javax.xml.xpath.XPath;
//import javax.xml.xpath.XPathExpressionException;

//import java.net.MalformedURLException;

//import java.io.IOException;
//import org.xml.sax.SAXException;

//import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.xml.sax.ErrorHandler;
import org.xml.sax.helpers.DefaultHandler;

public class ScriptXMLParser {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Welcome to my XML Java Parser");
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		String URL = "http://localhost:1234/iwtxml/shopping.xml";
		Document Doc = builder.parse(URL);
		ErrorHandler error = new DefaultHandler();
		//error.toStrin
		
		/*
		
		//Grabbing items from an internal file
		ItemListParser ilp = new ItemListParser();
		String URL = "http://localhost:1234/iwtxml/shopping.xml";
		List<LineItem> items = ilp.parse(URL);
		
		
		//Adding some new items
		items.add(new LineItem(new Product("Toaster",29.95),3));
		items.add(new LineItem(new Product("Hair Dryer",24.95),1));
		
		//Building a dom
		ItemListBuilder ilb = new ItemListBuilder();
		Document doc = ilb.build(items);
		
		//Writing items to a local file
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT,"yes");
		
		String location = "C:\\Users\\YasserAlejandro\\SDP\\Ongoing\\PIJReview\\src\\xml\\output.xml";
		
		Result output = new StreamResult(new File(location));
		
		Source input = new DOMSource(doc);
		transformer.transform(input,output);
		
		*/
	}
		

		
		



}
