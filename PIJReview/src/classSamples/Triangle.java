package classSamples;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func(6);
		
		/*
		int[] triala;
		triala = new int[4];
		
		int[][] trialb;
		trialb = new int[4][];
		
		
		String[] employeeArray;
		employeeArray = new String[5];
		employeeArray[0]="Alice";
		employeeArray[1]="Tontolone";
		
		int[] employeeArrayB = {12,14,16,18};
		
		int[][] matrix1;
		matrix1 = new int[3][4];
		
		int[][] matrix2 = {{3,4,5},{10,11,12},{25,26,27}};
		
		int[][][] matrix3;
		
		*/

	}
	
	
    static void func(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int[] row : triangle) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }
	

}
