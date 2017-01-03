package Revision;

public class CreationalPatterns {
	
	interface Shape {
		
		public void draw();
	}
	
	class Square implements Shape {
		
		@Override
		public void draw(){
			System.out.println("Drawing an Square");
		}
	}
	
	class Triangle implements Shape {
		
		@Override
		public void draw(){
			System.out.println("Drawing a Triangle");
		}
	}
	
	class Circle implements Shape {
		
		@Override
		public void draw(){
			System.out.println("Drawing a Circle");
		}
	}
	
	public class ShapeFactory {
		
		public Shape getShape (String name) {
			Shape result = null;
			switch (name) {
			case "Square" : result = new Square();
			break;                
			case "Circle" : result = new Circle();
			break;
			}
			return result;
		}
		
		
	}
	
	
	public void launch(){
		
        Singleton.getInstance();
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape test = factory.getShape("Square");
		
		Shape test2 = new Square();
		test.draw();
		
		
	}
	
	

	public static void main(String[] args) {
		
		Singleton.getInstance();
		
		CreationalPatterns script = new CreationalPatterns();
		script.launch();
		
		//ShapeFactory factory = new ShapeFactory();
		
		
		
		// TODO Auto-generated method stub

	}

}
