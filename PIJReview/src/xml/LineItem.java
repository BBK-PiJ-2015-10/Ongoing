package xml;

public class LineItem {
	
	private Product theProduct;
	
	private int quantity;
	
	public LineItem(Product theProduct,int quantity) {
		this.theProduct = theProduct;
		this.quantity = quantity;
	}
	
	public double getTotalPrice(){
		return theProduct.getPrice()*quantity;
	}
	
	public String format(){
		//return String.format("%-30s%8.2f%5d%8.2f",theProduct.getDescription(),
				//quantity,getTotalPrice());
		String result = theProduct.getDescription()+ " "+
				quantity +" " + getTotalPrice();
		return result;
	}
	
	public Product getProduct(){
		return this.theProduct;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	
	
	
	

}
