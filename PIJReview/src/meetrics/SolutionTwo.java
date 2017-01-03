package meetrics;

import java.util.Map;
import java.util.HashMap;

public class SolutionTwo {
	
	private Map<String,Integer> calls = new HashMap<>();
	
	private Map<String,Integer> callscost = new HashMap<>();
	
	private String maxphone = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SolutionTwo s2 = new SolutionTwo();
		String test = "00:01:07,400-234-09000:05:01,701-080-08000:05:00,500-234-090";
		
		int max=s2.getNumberofCalls(test);
		
		for (int k=0;k<max*20;k+=20){
			System.out.println(s2.getCallDetails(test,k));
			System.out.println(s2.getPhoneNumber(test,k));
		}
		
		
		//String first = test.substring(0,20);
		//String second = test.substring(20,40);
		
		
		//System.out.println(s2.getPhoneNumber(second,0));
		
		//System.out.println(s2.getCallDetails(second,0));
		
		//System.out.println(test.substring(20,40));
		//System.out.println(test.substring(40,60));
				

	}
	
	public int solution(String s){
		int monthlybill=0;
		if (s.length()<20){
			return monthlybill;
		}
		int i =getNumberofCalls(s);
		int maxDuration=0;
		for (int k=0;k<=i*20;k+=20){
			String number =getPhoneNumber(s,k);
			Integer duration =extractTime(getCallDetails(s,k));
			if (calls.containsKey(number)){
				int temp =calls.get(number);
				temp+=duration;
				calls.put(number,temp);
				if(temp>maxDuration){
					maxDuration=temp;
					maxphone=number;
				}
				//callscost
			}
			else {
				calls.put(number,duration);
				if(duration>maxDuration){
					maxDuration=duration;
					maxphone=number;
				}
			}
		}
		calls.remove(maxphone);
		for (String value :calls.keySet()){
			monthlybill=monthlybill+calls.get(value);
		}
		return monthlybill;
	}
	
	public int getNumberofCalls(String text){
		return (text.length()/20);
	}
	
	public String getPhoneNumber(String text,int delta){
		return text.substring(delta+9,delta+20);
	}
	
	public String getCallDetails(String text,int delta){
		return text.substring(delta,delta+8);
	}
	
	public int getUnit(String calltime,int begin, int end){
		return Integer.parseInt(calltime.substring(begin,end));
	}
	
	public int getMinutes(String calltime){
		return getUnit(calltime,3,5);
	}
	
	public int getSeconds(String calltime){
		return getUnit(calltime,6,8);
	}
	
	public int getHours(String calltime){
		return getUnit(calltime,0,2);
	}
	
	public int roundUpMinutes(String calltime){
		int roundedMin=0;
		if(getSeconds(calltime)>0){
			roundedMin=1;
		}
		roundedMin+=getMinutes(calltime);
		return roundedMin;	
	}
	
	public int extractTime(String calltime){
		int totalSeconds;
		totalSeconds=getHours(calltime)*60*60;
		totalSeconds+=getMinutes(calltime)*60;
		totalSeconds+=getSeconds(calltime);
		return totalSeconds;
	}
	
	public int extractCost(String calltime){
		int callCost;
		if( (getHours(calltime)==0) && (getMinutes(calltime)<5)){
			callCost=extractTime(calltime)*3;
		}
		else {
			callCost=150*roundUpMinutes(calltime);
			callCost+=getHours(calltime)*60*150;
		}
		return callCost;
	}
	
	


}
