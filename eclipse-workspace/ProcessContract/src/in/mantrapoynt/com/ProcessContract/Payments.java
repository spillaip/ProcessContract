package in.mantrapoynt.com.ProcessContract;

class Payments {

	String PaymentType;
	String Frequency;
	String PaymentStructure; // level
	String Arrear;
	String Periods;
	String paymentAmount;
	String startDate;

	
	/**
	 * @param paymentType
	 * @param frequency
	 * @param paymentStructure
	 * @param arrear
	 * @param periods
	 * @param paymentAmount
	 * @param startDate
	 */

	public Payments() {
		super();
	}
	public Payments(String paymentDelimited) {
		super();
		String[] fields = paymentDelimited.split(",");
		PaymentType = fields[0];
		Frequency = fields[1];
		PaymentStructure = fields[2];
		Arrear = fields[4];
		Periods = fields[5];
		paymentAmount = fields[6];
		startDate = fields[7];


	}

	
	public String getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}

	public String getFrequency() {
		return Frequency;
	}

	/**
	 * @param paymentType
	 * @param frequency
	 * @param paymentStructure
	 * @param arrear
	 * @param periods
	 * @param paymentAmount
	 * @param startDate
	 */
	public Payments(String paymentType, 
			        String frequency, 
			        String paymentStructure, 
			        String arrear, 
			        String periods,
			        String paymentAmount, 
			        String startDate) {
		super();
		PaymentType = paymentType;
		Frequency = frequency;
		PaymentStructure = paymentStructure;
		Arrear = arrear;
		Periods = periods;
		this.paymentAmount = paymentAmount;
		this.startDate = startDate;
	}

	public void setFrequency(String frequency) {
		Frequency = frequency;
	}

	public String getPaymentStructure() {
		return PaymentStructure;
	}

	public void setPaymentStructure(String paymentStructure) {
		PaymentStructure = paymentStructure;
	}

	public String getArrear() {
		return Arrear;
	}

	public void setArrear(String arrear) {
		Arrear = arrear;
	}

	public String getPeriods() {
		return Periods;
	}

	public void setPeriods(String periods) {
		Periods = periods;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



}
