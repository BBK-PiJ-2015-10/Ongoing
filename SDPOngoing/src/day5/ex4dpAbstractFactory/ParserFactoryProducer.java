package day5.ex4dpAbstractFactory;

public class ParserFactoryProducer {
	
	public static AbstractParserFactory getFactory (String factorytype){
		switch(factorytype){
			case("NYCFactory"):
				return new NYCParserFactory();
			case("LondonFactory"):
				return new LondonParserFactory();
		}
		return null;
	}
	
}
