package classSamples.revisionsession.classSamples;

public class Output {
	
	private final static Integer SIZE = 7;
	
	private Integer[] array;
	
	public Output(int num){
		array = new Integer[num];
	}
	
	private int evaluate(Integer b) throws Exception {
		Integer result = 0;
		try {
			for (int i=0;i<b; i++){
				result +=array[i];
			}
		}  catch (ArithmeticException ex1){
			System.out.println("ArithmeticException clause");
		} catch (Exception ex){
			System.out.println("Exception " +ex);
			throw ex;
		} finally {
			System.out.println("Finally of evaluate");
		}
		return result;
    }	
	

	public static void main(String[] args) throws Exception {
		
		Output o;
		try {
			o = new Output(SIZE);
			System.out.println("Value returned by evaluate " +o.evaluate(8));
		}  catch (RuntimeException ex){
			System.out.println("Caught: " +ex);
			throw new Exception (ex);
		} finally {
			System.out.println("In finally");
        }   
	}

}
