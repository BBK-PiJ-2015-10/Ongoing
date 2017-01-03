package xml;

import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class ItemListBuilder {

	private DocumentBuilder builder;
	
	private Document doc;
	
	public ItemListBuilder() throws ParserConfigurationException{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		doc = builder.newDocument();
	}
		
	private Element createTextElement(String name,String text){
		Element e = doc.createElement(name);
		Text t = doc.createTextNode(text);
		e.appendChild(t);
		return e;
	}
	
	private Element createProduct(Product p){
		Element e = doc.createElement("product");
		e.appendChild(createTextElement("description",p.getDescription()));
		e.appendChild(createTextElement("price",""+p.getPrice()));
		return e;
	}
	
	private Element createLineItem(LineItem anItem){
		Element e = doc.createElement("item");
		e.appendChild(createProduct(anItem.getProduct()));
		e.appendChild(createTextElement("quantity",""+anItem.getQuantity()));
		return e;
	}
	
	private Element createItems(List<LineItem> items){
		Element e = doc.createElement("items");
		for (LineItem item: items){
			e.appendChild(createLineItem(item));
		}
		return e;
	}
	
	
	public Document build(List<LineItem> items){
		doc.appendChild(createItems(items));
		return doc;
	}
	
	

	

	
	
	
}
