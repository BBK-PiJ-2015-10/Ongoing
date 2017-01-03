package day3.lexer3;

public class exer3AdapterScript {

	public static void main(String[] args) {
		
		PayD adapter = new XpayToPayDAdapter();
		adapter.setCustCardNo("07834405");
		System.out.println(adapter.getCustCardNo());
		adapter.setCardOwnerName("Bibbio");
		System.out.println(adapter.getCardOwnerName());
		adapter.setCardExpMonthDate("June");
		System.out.println(adapter.getCardExpMonthDate());
		adapter.setCVVNo(233);
		System.out.println(adapter.getCVVNo());
		adapter.setTotalAmount(5000.00);
		System.out.println(adapter.getTotalAmount());
		
		
		
	

	}

}
