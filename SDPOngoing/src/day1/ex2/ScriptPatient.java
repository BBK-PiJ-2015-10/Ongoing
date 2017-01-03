package day1.ex2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ScriptPatient {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Reflections");
		
		Class c1 = null;
		//Class c2 = null;
		
		try {
			c1 = Class.forName("day1.ex2.EnglishPatient");
			//c2 = Class.forName("day1.ex2.Patient");
			
		}
		catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}
		
		Constructor constructor1 = null;
		
		try {
				
			constructor1 = c1.getConstructor(String.class,int.class);
			//constructor1 = c2.getConstructor(String.class,String.class,int.class);
			
			Patient driver1 = null;
			driver1 = (EnglishPatient) constructor1.newInstance("London",35);
			driver1.speak();
			//System.out.println(patient1.opinion());
			
		
			
		}
		
		catch (NoSuchMethodException | SecurityException e) {
				// Exceptions thrown
				e.printStackTrace();
		} 
		catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
		
		

	}

}
