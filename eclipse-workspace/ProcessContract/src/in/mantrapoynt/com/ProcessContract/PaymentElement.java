package in.mantrapoynt.com.ProcessContract;

public class PaymentElement {

	String contractId;
	String paymentElementId;
	String paymentElementDate; // mm/dd/yyyy
	String paymentElementAmount;
	String paymentElementDateBilled; // mm/dd/yyyy
	String paymentElementAccrued;
	String paymentElementDateDisbursed; // mm/dd/yyyy
	String paymentElementSequence;

	PaymentElement(String element) {
		super();
		String[] elements = element.split(",");

		contractId = elements[0];
		paymentElementId = elements[1];
		paymentElementDate = elements[2];
		paymentElementAmount = elements[3];
		paymentElementDateBilled = elements[4];
		paymentElementAccrued = elements[5];
		paymentElementDateDisbursed = elements[6];
		paymentElementSequence = elements[7];

	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getPaymentElementId() {
		return paymentElementId;
	}

	public void setPaymentElementId(String paymentElementId) {
		this.paymentElementId = paymentElementId;
	}

	public String getPaymentElementDate() {
		return paymentElementDate;
	}

	public void setPaymentElementDate(String paymentElementDate) {
		this.paymentElementDate = paymentElementDate;
	}

	public String getPaymentElementAmount() {
		return paymentElementAmount;
	}

	public void setPaymentElementAmount(String paymentElementAmount) {
		this.paymentElementAmount = paymentElementAmount;
	}

	public String getPaymentElementDateBilled() {
		return paymentElementDateBilled;
	}

	public void setPaymentElementDateBilled(String paymentElementDateBilled) {
		this.paymentElementDateBilled = paymentElementDateBilled;
	}

	public String getPaymentElementAccrued() {
		return paymentElementAccrued;
	}

	public void setPaymentElementAccrued(String paymentElementAccrued) {
		this.paymentElementAccrued = paymentElementAccrued;
	}

	public String getPaymentElementDateDisbursed() {
		return paymentElementDateDisbursed;
	}

	public void setPaymentElementDateDisbursed(String paymentElementDateDisbursed) {
		this.paymentElementDateDisbursed = paymentElementDateDisbursed;
	}
	
	public String getPaymentElementSequence() {
		return paymentElementSequence;
	}

	public void setPaymentElementSequence(String paymentElementSequence) {
		this.paymentElementSequence = paymentElementSequence;
	}
	
}
