package day5.ex12dpComposite;

public class HtmlElement extends HtmlTag {

	private String name;
	
	private String startTag;
	
	private String endTag;
	
	private String tagBody;
	
	public HtmlElement(String name){
		this.name=name;
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
	
	@Override
	public void setTagBody(String tagBody) {
	    this.tagBody=tagBody;   
	}

	@Override
	public void generateHtml() {
		System.out.print(startTag);
		System.out.print(tagBody);
		System.out.println(endTag);
	}
	
	

}
