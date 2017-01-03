package classSamples.revisionsession.classSamples;

import java.util.Set;
import java.util.HashSet;

public class DivaExample {
	
	public class Diva {
		
		private String requirements;
		
		private int numberOfAssistants;
		
		public String getRequirements(){
			return this.requirements;
		}
		
		public int getAssistants(){
			return this.numberOfAssistants;
		}
		
		public Diva(String requirements, int numberOfAssistants){
			setRequirements(requirements);
			setAssistants(numberOfAssistants);
		}
		
		public void setRequirements(String requirements){
			this.requirements=requirements;
		}
		
		public void setAssistants(int numberofAssistants){
			this.numberOfAssistants = numberofAssistants;
		}
		
		@Override
		public String toString(){
			StringBuilder sb = new StringBuilder();
			sb.append("Requirements: " +getRequirements());
			sb.append("Assistants: " + getAssistants());
			return sb.toString();
		}
		
		@Override
		public boolean equals(Object ob){
			if (ob == this){
				return true;
			}
			if (!(ob instanceof Diva)){
				return false;
			}
			Diva anotherOne = (Diva) ob;
			return (this.getRequirements().equals(anotherOne.getRequirements()) &&
					(this.getAssistants()) == (anotherOne.getAssistants())
					);
		}
		
		@Override
		public int hashCode(){
			return getAssistants()+ getRequirements().length();
			//anything that creates a unique code.... probably not what is above
		}
		
		
	}
	
	
	public void launch(){
		
		Diva first = new Diva("michael",23);
		//System.out.println(first);
	
		Diva second = new Diva("michael",23);
		
		Diva third = new Diva("Rafaela",22);
		
		double five = 5.0;
		double two = 2;
		//double div = five/two;
		double div2 = 5.0/2.0;
		System.out.println(five/two);
		
		
		int[][][] tester = {{{1},{2}},{{1,2,3},{4,5,6}}};
		
		
		//Object two;
		//two = "ale";
		//System.out.println(two.hashCode());
		//System.out.println(one.equals(two));
		
		//if (one == two){
			//System.out.println(true);
		//}
		//else {
			//System.out.println(false);
		//}
		
		
		//System.out.println(first.equals(second));
		
		//System.out.println(first.hashCode());
		//System.out.println(second.hashCode());
		
		//Set<String> tester = new HashSet<>();
		//tester.add("ale");
		///tester.add("cane");
		//tester.add("ale");
		//System.out.println(tester.size());
		
		//Set<Diva> divaset = new HashSet<>();
		//divaset.add(first);
		//divaset.add(second);
		//System.out.println(divaset.size());
		
		
	
	}

	public static void main(String[] args) {
		
		DivaExample example = new DivaExample();
		example.launch();
		
		
		
		// TODO Auto-generated method stub

	}

}
