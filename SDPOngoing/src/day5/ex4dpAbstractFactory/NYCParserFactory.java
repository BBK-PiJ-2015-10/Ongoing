package day5.ex4dpAbstractFactory;

public class NYCParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		switch(parserType) {
		case "NYCORDER":
			System.out.println("NYC Parsing order XML...");
			return new NYCOrderXMLParser();
		case "NYCERROR":
			System.out.println("NYC Parsing error XML...");
			return new NYCErrorXMLParser();
		case "NYCFEEDBACK":
			System.out.println("NYC Parsing feedback XML...");
			return new NYCFeedbackXMLParser();
		case "NYCRESPONSE":
			System.out.println("NYC Parsing response XML...");
			return new NYCResponseXMLParser();
		}
		return null;
	}
	
	

}
