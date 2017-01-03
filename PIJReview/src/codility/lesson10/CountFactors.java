package codility.lesson10;

public class CountFactors {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountFactors cf = new CountFactors();
		
		System.out.println(cf.solution(9));

	}
	
	public int solution(int N){
		if (N==1){
			return 1;
		}
		int count=0;
		int maxLeft=1;
		int minRight=N;
		count+=2;
		//count++;
		for (int next=2;next<N;next++){
			if(next>=minRight){
				break;
			}
			if((N % next)==0){
				count+=2;
				//count++;
				int div=N/next;
				if (div==next){
					count--;
					break;
				}
				maxLeft=next;
				minRight=div;
			}
		}
		return count;
	}

}
