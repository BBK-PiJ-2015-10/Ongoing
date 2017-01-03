package day3.lexer3;

public class XpayToPayDAdapter extends XpayImpl implements PayD{

	@Override
	public String getCustCardNo() {
		return getCreditCardNo();
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		setCreditCardNo(custCardNo);
	}

	@Override
	public String getCardOwnerName() {
		return getCustomerName();
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		setCustomerName(cardOwnerName);
		
	}

	@Override
	public String getCardExpMonthDate() {
		return getCardExpMonth();
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		setCardExpMonth(cardExpMonthDate);
	}

	@Override
	public Integer getCVVNo() {
		short shortresult = getCardCVVNo();
		int result = shortresult;
		return (Integer) result;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		setCardCVVNo(cVVNo.shortValue());	
	}

	@Override
	public Double getTotalAmount() {
		return getAmount();
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		setAmount(totalAmount);
	}

}
