package classSamples.revisionsession;

public class Exer5 {

    public static Boolean isReverse(String input1, String input2){
    	String str1 = input1.toLowerCase();
    	String str2 = input2.toLowerCase();
    	if (str1.isEmpty() && str2.isEmpty()){
    		return true;
    	}
    	else if (str1.length()!=str2.length()){
    		return false;
    	}
    	else if (!str1.substring(0,1).equals(str2.substring(str2.length()-1,str2.length()))){
    		return false;
    	}
    	else {
    		return isReverse(str1.substring(1),str2.substring(0,str2.length()-1));
    	}
    }
    
	
	public static void main(String[] args) {
		
		System.out.println(isReverse("yasser","ressay"));
	

	}

}
