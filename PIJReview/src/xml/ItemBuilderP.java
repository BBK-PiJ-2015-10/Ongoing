package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.util.List;

public class ItemBuilderP {
	
	private Document doc;
	
	public ItemBuilderP() throws ParserConfigurationException{
		doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
	}
	
	private Element createTextElement(String name, String text){
		Element e = doc.createElement(name);
		Text t = doc.createTextNode(text);
		e.appendChild(t);
		return e;
	}
	
	private Element createProductElement(Product p){
		Element e = doc.createElement("product");
		e.appendChild(createTextElement("description",p.getDescription()));
		e.appendChild(createTextElement("price",""+p.getPrice()));
		return e;
	}
	
	private Element createLineItemElement(LineItem item){
		Element e = doc.createElement("item");
		e.appendChild(createProductElement(item.getProduct()));
		e.appendChild(createTextElement("quantity",""+item.getQuantity()));
		return e;
	}
	
	private Element createItems(List<LineItem> items){
		Element e = doc.createElement("items");
		for (LineItem item : items){
			e.appendChild(createLineItemElement(item));
		}
		return e;
	}
	
	private Document build(List<LineItem>items){
		doc.appendChild(createItems(items));
		return doc;
	}
	

}
