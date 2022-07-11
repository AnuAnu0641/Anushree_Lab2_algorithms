package com.paymoney.services;

public class TargetsStatus implements ITargetsStatus{

	@Override
	public void printTargetStatus(int noOfTransactions, int targetArrValue, int[] transactionArr) {
		int sum = 0;
		int transactionCount = 0;
		for (int j = 0; j < noOfTransactions; j++) {
				sum = sum + transactionArr[j];
				if (sum >= targetArrValue ) {
					transactionCount = j;
					break;
			} 
			
		}
		if (transactionCount <= 0)
			System.out.println("Given target "+targetArrValue+" is not achieved. ");
		else
			System.out.println("Given target " + targetArrValue + " is achieved at transaction " + transactionCount);
	}
}
