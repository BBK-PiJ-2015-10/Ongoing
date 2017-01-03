package codility.lesson11;

import java.util.List;
import java.util.LinkedList;

public class CountSemiPrimes {

	private int number;
	
	private int[] values;
	
	private List<Integer> primes = new LinkedList<>();
	
	private List<Integer> semis = new LinkedList<>();
	
	private int[] answers;
	
	public static void main(String[] args) {
		
		CountSemiPrimes csp = new CountSemiPrimes();
		
		int[] set1 = {1,4,16};
		int[] set2 = {26,10,20};
		int target=26;
		csp.solutions(target,set1,set2);
		for (int i=0;i<set1.length;i++){
			int ans = csp.getAnswersArray()[i];
			System.out.println(ans);
		}
	}
	
	
	
	public int[] solutions(int N,int[]P,int[]Q){
		answers = new int[P.length];
		if (N<4){
			for (int l=0;l<answers.length;l++){
				answers[0]=0;
			}
			return answers;
		}
		calcPrimes(N);
		calcSemiPrimes();
		for (int i=0;i<P.length;i++){
			int lower=P[i];
			int upper=Q[i];
			answers[i]=getSemisCount(lower,upper);
		}	
		return answers;
	}
	
	public int getSemisCount(int lower, int upper){
		int result=0;
		for (int value: semis){
			if (value>upper){
				break;
			}
			if (value>=lower && value <=upper){
				result++;
			}
		}
		return result;
	}
	
	
	
	public void calcPrimes(int N){
		number = N;
		values = new int[N+2];
		values[0]=1;
		values[1]=1;
		for (int i=2;i<=N;i++){
			if(getValue(i)==0){
				values[i]=1;
				primes.add(i);
				boolean stop=false;
				int count=1;
				while (!stop){
					int result=i*count;
					if(result<=N){
						values[result]=1;
						count++;
					}
					else {
						stop=true;
					}
				}
			}
		}
	}
	
	public int getValue(int pos){
		return values[pos];
	}
	
	public List<Integer> getPrimes(){
		return this.primes;
	}
	
	
	public void calcSemiPrimes(){
		boolean done=false;
		while (!done){
			int current = primes.remove(0);
			int result = current*current; 
			if(result<=number){
				semis.add(result);
				for (int value : primes){
					result=value*current;
					if (result<=number){
						semis.add(result);
					}
					else {
						break;
					}
				}
			}
			else {
				done=true;
			}
		}
		sort(semis);
	}
	
	public List<Integer> getSemis(){
		return this.semis;
	}
	
	public void sort(List<Integer> list){
		list.sort((a,b)->a-b);
	}
	
	public int[] getAnswersArray(){
		return this.answers;
	}
	
	
	
	

}
