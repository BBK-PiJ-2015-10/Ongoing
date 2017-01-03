package day5.ex4dpAbstractFactory;

public class LondonParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		switch(parserType) {
		case "LondonORDER":
			System.out.println("London Parsing order XML...");
			return new LondonOrderXMLParser();
		case "LondonERROR":
			System.out.println("London Parsing error XML...");
			return new LondonErrorXMLParser();
		case "LondonFEEDBACK":
			System.out.println("London Parsing feedback XML...");
			return new LondonFeedbackXMLParser();
		case "LondonRESPONSE":
			System.out.println("London Parsing response XML...");
			return new LondonResponseXMLParser();
		}
		return null;
	}
	
	

}
