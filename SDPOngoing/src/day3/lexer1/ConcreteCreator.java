package day3.lexer1;

public class ConcreteCreator implements Creator {

	public static final String type1 = "type1";
	
	public static final String type2 = "type2";
	
	public static final String type3 = "type3";
	
	@Override
	public Product createProduct(String type) {
		
		switch(type){
		case type1:
			return new ConcreteProductType1();
		case type2:
			return new ConcreteProductType2();
		case type3:
			return new ConcreteProductType3();
		}
		return null;
		
	}

	
	
	
	

}
