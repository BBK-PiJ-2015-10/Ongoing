package codility.lesson1;

public class IterationsBinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(1 % 2);
		
		IterationsBinaryGap bg = new IterationsBinaryGap();
		
		int num = 214748364;
		
		String ale = Integer.toBinaryString(num);
		System.out.println(ale);
		String test = "000000000010101010101010011";
		
		//System.out.println(bg.countGap(test,0,0,0,false,'0'));
		
		System.out.println(bg.solution(num));

	}
	
	public int solution (int N){
		String input = Integer.toBinaryString(N);
		return countGap(input,0,0,0,false,'0');
	}
	
	public int countGap(String number,int pos,int global,int temp,Boolean start,char prior){
		if(number.length()==pos){
			return global;
		}
		if (number.charAt(pos)=='1' & (prior=='0')){
			if (start){
				if (temp>global){
					global=temp;
				}
			}	
			else {
				start=true;
			}
			temp=0;
		}
		else if (number.charAt(pos)=='1' & (prior=='1')){
			temp=0;
		}
		else 
		{
			if (start){
				temp++;
			}
		}
		return countGap(number,pos+1,global,temp,start,'0');
	}



}
