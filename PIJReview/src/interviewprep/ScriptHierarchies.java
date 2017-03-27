package interviewprep;

public class ScriptHierarchies {

	public static void main(String[] args) {
		
		ScriptHierarchies sh = new ScriptHierarchies();
		sh.run();

	}
	
	
	public void run(){
		
		Person person = new Student("Ale",31);
		System.out.println(person.getName());
		
		person.setName("Tontolone");
		System.out.println(person.getName());
		
		
		Mammal mamal = new Dog();
		System.out.println(mamal.getName());
		System.out.println(mamal.getGenre());
		
		
		
	}

}
