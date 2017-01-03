package day5.ex12dpComposite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

	private String name;
	
	private String startTag;
	
	private String endTag;
	
	private List<HtmlTag> childrentags = new ArrayList<HtmlTag>();
	
	public HtmlParentElement(String name){
		this.name = name;
	}
	
	@Override
	public String getTagName() {
		return this.name;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
		
	}
		
	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	
	 public void addChildTag(HtmlTag htmlTag) {
	       childrentags.add(htmlTag);
	 }

	 public void removeChildTag(HtmlTag htmlTag) {
	       childrentags.remove(htmlTag);
	 }

	public List<HtmlTag> getChildren() {
		return this.childrentags;
	}


	@Override
	public void generateHtml() {
		System.out.println(this.startTag);
		for (int i=0; i<childrentags.size(); i++){
			childrentags.get(i).generateHtml();
			//System.out.println(((HtmlParentElement)childrentags.get(i)).startTag);
		}
		//for (int i=childrentags.size()-1; i>=0; i--){
			//System.out.println(((HtmlParentElement)childrentags.get(i)).endTag);
		//}
		System.out.println(this.endTag);
		
	}
	
	

}
