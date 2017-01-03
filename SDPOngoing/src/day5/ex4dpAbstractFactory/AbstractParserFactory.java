package day5.ex4dpAbstractFactory;

public interface AbstractParserFactory {
	
	public XMLParser getParserInstance(String parserType);

}
