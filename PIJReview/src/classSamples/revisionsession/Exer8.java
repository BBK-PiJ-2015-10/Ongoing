package classSamples.revisionsession;

public class Exer8 {

	class Pill {	
				
		public void method2(){
			System.out.println("Pill_2");
		}
		
		public void method4(){
			System.out.println("Pill_4");
		}
	}
	
	class Box extends Pill {
			
		@Override
		public void method2(){
			System.out.println("Box_2");
		}
		
		public void method3(){
			System.out.println("Box_3");
		}
		
	}
	
	class Cup extends Box {
		
		public void method1(){
			System.out.println("Cup_1");
		}
		
		@Override
		public void method2(){
			System.out.println("Cup_2");
		}
	}
	
	
	
	class Jar extends Box {
		
		public void method1(){
			System.out.println("Jar_1");
		}
		
		@Override
		public void method2(){
			System.out.println("Jar_2");
		}
		
	}
	
	public void launch(){
		
		Box var1 = new Box();
		Pill var2 = new Jar();
		Box var3 = new Cup();
		Box var4 = new Jar();
		Object var5 = new Box();
		Pill var6 = new Pill();
		
		/*
		 * var 2 is a Pill. However, if you call m2 it will give you the local
		 * implementation of Jar. Though, any method of Jar that is not in Pill
		 * won't work.
		 * 
		 */
		
		
		
		var1.method2();
		var2.method2();
		var3.method2();
		var4.method2();
		//var5.method2();Error var5 is declared as an object.
		var6.method2();
		var1.method3();
		//var2.method3();Error a pill doesn't have m3
		var3.method3();
	    var4.method3();
		//((Cup) var1).method1();Error it is declared as a Box and pointing to a Box. You can't cast it
	    //to something it has not been pointed to.
		//You can't cast a telephone to a mobile phone.
		((Jar) var2).method1();
		//You can cast a telephone that is an instance of a mobile to a mobile.
		((Cup) var3).method1();
		//var 4 is declared as box and pointing as a Jar. You can't cast it to something else, a "cup".
		//((Cup)var4).method1();
		((Jar)var4).method2();
		((Box)var5).method3();
		//var4.method4();
		//((Pill)var5).method3();
		//I can cast an Object => smartphone to a phone. If I call a method 
		//overwritten by smartphone it will give me smartphone, if not it will
		//give me phone.
		//((Jar)var2).method3();
		//((Cup)var3).method3();
		//((Cup) var5).method3();   
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exer8 var1 = new Exer8();
		var1.launch();

	}

}
