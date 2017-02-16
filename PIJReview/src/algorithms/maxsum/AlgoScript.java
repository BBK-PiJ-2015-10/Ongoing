package algorithms.maxsum;

public class AlgoScript {

	public static void main(String[] args) {
		
		int [] test = {31,-41,59,26,-53,58,97,-93,-23,84};
		
		CubicSol cs = new CubicSol();
		System.out.println(cs.maxSum(test));
		
		
		QuadSolution qs = new QuadSolution();
		System.out.println(qs.maxSum(test));
		
		DynamicSolution ds = new DynamicSolution();
		System.out.println(ds.maxSum(test));
		
		OptSol os = new OptSol();
		System.out.println(os.maxSum(test));
		
		

	}

}
