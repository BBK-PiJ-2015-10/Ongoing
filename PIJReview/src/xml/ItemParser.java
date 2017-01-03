package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import org.xml.sax.SAXException;

public class ItemParser {
	
	private XPath path;
	
	private DocumentBuilder builder;
	
	
	
	public ItemParser()throws ParserConfigurationException{
		builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		path = XPathFactory.newInstance().newXPath();
	}
	
	public List<LineItem> parseURL(String url) throws IOException, SAXException, XPathExpressionException{
		List<LineItem> items = new ArrayList();
		
		Document doc = builder.parse(url);
		
		int itemcount = Integer.parseInt(path.evaluate("count(/items/item)",doc));
		for (int i=1;i<=itemcount;i++){
			String description = path.evaluate("/items/item["+i+"]/product/description",doc);
			double price = Double.parseDouble(path.evaluate("/items/item["+i+"]/product/price",doc));
			int quantity = Integer.parseInt(path.evaluate("/items/item["+i+"]/quantity",doc));
			items.add(new LineItem(new Product(description,price),quantity));	
		}	
		return items;		
	}
	

}
