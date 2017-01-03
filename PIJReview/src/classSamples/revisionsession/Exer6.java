package classSamples.revisionsession;

import java.math.*;

public class Exer6 {
	
	public class Point {
		
		int x;
		
		int y;
		
		public Point(int x, int y){
			setLocation(x,y);
		}
		
		public void setLocation(int x, int y){
			this.x=x;
			this.y=y;
		}
		
		public int getX(){
			return this.x;
		}
		
		public int getY(){
			return this.y;
		}
		
		public double distanceFromOrigin(){
			return Math.sqrt(((x*x)+(y*y)));
		}
		
		@Override
		public String toString(){
			return String.format("(%1d,%1d)",x,y);
		}
		
	}
	
	public class Point3D extends Point implements Comparable<Point3D> {
		
		int z;
		
		public Point3D(int x, int y, int z){
			super(x,y);
			this.z=z;
		}
		
		public void setZ(int z){
			this.z=z;
		}
		
		@Override
		public void setLocation(int x, int y){
			super.setLocation(x, y);
			setZ(0);
		}
		
		public void setLocation(int x, int y, int z){
			super.setLocation(x, y);
			setZ(z);
		}
		
		public int getZ(){
			return this.z;
		}
		
		@Override
		public double distanceFromOrigin(){
			return Math.sqrt(((x*x)+(y*y)+(z*z)));
		}
		
		@Override
		public String toString(){
			return String.format("(%1d,%1d,%1d)",x,y,z);
		}

		
		public int compareVal(int a, int b){
			if (a<b){
				return -1;
			}
			else if (a>b){
				return 1;
			}
			else {
				return 0;
			}
		}
		
		
		@Override
		public int compareTo(Point3D o) {
			if (compareVal(this.x,o.x)!=0){
				return compareVal(this.x,o.x);
			}
			else if (compareVal(this.y,o.y)!=0){
				return compareVal(this.y,o.y);
			}
			else {
				return compareVal(this.z,o.z);
			}
		}

		
	}
	
	public void launch(){
		
		Point3D point3D= new Point3D(2,6,1);
		System.out.println(point3D);
		System.out.println(point3D.distanceFromOrigin());
		Point3D smaller = new Point3D(2,6,1);
		System.out.println(point3D.compareTo(smaller));
		
		
	}
	
	

	public static void main(String[] args) {
		
		Exer6 exer6 = new Exer6();
		exer6.launch();
		
		// TODO Auto-generated method stub

	}

}
