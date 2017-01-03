package day1.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ScriptDriver {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Driver Script");
		
		//Patient patient1 = new EnglishPatient("Madrid",34);
		
		Class c1 = null;
		//Constructor constructor1 = null;
		Driver driver1 = null;
		
		try {
			c1 = Class.forName("day1.ex2.Driver");
			
		}
		catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}
		
		//Constructor constructor1 = null;
		
		try {
			driver1 = (Driver) c1.getConstructor(String.class,String.class,int.class).newInstance("Spaniard","Madrid",10);
		}
		
		catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
		} 
		catch (InstantiationException e) {
				e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
				e.printStackTrace();
		} 
		catch (IllegalArgumentException e) {
				e.printStackTrace();
		} 
		catch (InvocationTargetException e) {
				e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
