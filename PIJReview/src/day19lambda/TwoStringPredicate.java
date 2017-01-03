package day19lambda;

@FunctionalInterface
public interface TwoStringPredicate {
	
	boolean better(String str1, String str2);

}
