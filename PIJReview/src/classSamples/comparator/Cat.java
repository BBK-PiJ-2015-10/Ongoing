package classSamples.comparator;

public class Cat {

	private String name;
	
	private Integer age;
	
	public Cat(){	
	}
	
	public Cat(String name, int age){
		this.name = name;
		this.age=age;
	}
	
	public Integer getAge(){
		return this.age;
	}
	
	public String getName(){
		return this.name;
	}
	
}
