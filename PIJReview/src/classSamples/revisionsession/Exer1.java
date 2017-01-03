package classSamples.revisionsession;

import java.util.List;
import java.util.ArrayList;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		//res.add(6);
		
		res.stream().forEach(n->list.add(n));
		System.out.println(list);
		
		int result = -5 %2;
		System.out.println(result);

	}

}
