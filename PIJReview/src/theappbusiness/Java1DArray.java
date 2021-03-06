package theappbusiness;

import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		
		Java1DArray ja = new Java1DArray();
		
		/*
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int i=0;i<n;i++){
			int size = Integer.parseInt(s.next());
			int jump = Integer.parseInt(s.next());
			int [] values = new int[size];
			for (int k=0;k<size;k++){
				values[k]=Integer.parseInt(s.next());
			}
			if(ja.evalArray(values,size,jump)){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		*/
		 
		int[] test1 = {0,0,0,0,0};
		ja.runTest(true,test1,5,3,1);
		
		int[] test2 = {0,0,0,1,1,1};
		ja.runTest(true,test2,6,5,2);
		
		int[] test3 = {0,1,0};
		ja.runTest(false,test3,3,1,3);
		
		int[] test4 = {0,0,1,1,1,0};
		ja.runTest(false,test4,6,3,4);
		
	}
	
	
	public boolean evalArray(int[] values,int size,int fast){
		int initialNode=0;
		int limit=size-1;
		int forward=1;
		int backward=-1;
		int jump=fast;
		
		Stack<Integer> path = new Stack();
		Set<Integer> closed = new HashSet();
		
		path.push(initialNode);
		
		int currentNode=path.peek();
		
		while (!path.isEmpty()){
			currentNode=path.peek();
				if (currentNode>limit){
					return true;
				}
				if ((currentNode+jump)>limit){
					return true;
				}
				else {
					int potential=currentNode+jump;
					if ((values[potential]==0) && (!closed.contains(potential))){
						path.push(potential);
					}
					else {
						if (!closed.contains(potential)){
							closed.add(potential);
						}
						potential=currentNode+forward;
						if ((potential)>limit){
							return true;
						}
						else {
							if ((values[potential]==0) && (!closed.contains(potential))){
								path.push(potential);
							}
							else {
								if (!closed.contains(potential)){
									closed.add(potential);
								}
								potential=currentNode+backward;
								closed.add(currentNode);
								if ((potential)<0){
									return false;
								}
								else {
									path.pop();
								}
							}
						}
					}	
				}	
			}				
		return false;
	}
	
	public void runTest(boolean expected,int[] values, int target, int fast,int testRef){
		String result;
		if (expected==evalArray(values,target,fast)){
			result="passed";
		}
		else {
			result="failed";
		}
		System.out.println("Test # "+testRef +" " +result);
	}

}
