package interviewprep;

public interface Mammal {
	
	String name = "Animalito";
	
	default String getGenre(){
		return "Mammalito";
	}
	
	default String getName(){
		return this.name;
	}
	
	public String act();
	

	
	

}
