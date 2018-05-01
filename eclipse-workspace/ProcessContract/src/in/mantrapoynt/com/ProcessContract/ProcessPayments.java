package in.mantrapoynt.com.ProcessContract;

import java.util.ArrayList;

public class ProcessPayments {

	// Declare List to hold payment objects
	ArrayList<Payments> paymentList = new ArrayList<>();
	ArrayList<PaymentElement> paymentElementList = new ArrayList<>();

	//
	// Get array of payments delimited by comma
	//
	ProcessPayments(String[] paymentDelimited) {
		
		int paymentsStored = storePayments(paymentDelimited);
		int paymentsProcessed = processPayments(paymentList);


	}

	private int storePayments(String[] paymentDelimited) {

		// Store number of payments received
		int numberOfPayments = paymentDelimited.length;
		//
		// persist Payments objects from received data
		//
		for (int i = 0; i < numberOfPayments; i++) {
			paymentList.add(new Payments(paymentDelimited[i]));
			
		}
		
		
		return paymentList.size();
	}
	
	private int processPayments(ArrayList paymentList) {
		
		for (int i=0;i<paymentList.size();i++) {
			//
			// Process each payment
			// and generate streams
			//
			
		}
		
		return 0;
	}

	private double calculateIRR(ArrayList paymentElementList) {
		//
		// process IRR based on
		// the paymentelements
		// and the asset costs
		
		return 12.75;
	}
}
