package com.paymoney.accounts;

import java.util.Scanner;

public class DailyTransactions {
	
	private int noOfTransactions;
	private static final Scanner sc = new Scanner(System.in);

	public int getNoOfTransactions() {
		return noOfTransactions;
	}
	
	public int[] getTransactions(int[] transactionArr) {
		int temp;
		System.out.println("Enter the number of transactions done today ");
		noOfTransactions = sc.nextInt();
		transactionArr = new int[noOfTransactions];
		
		System.out.println("Enter the values of transcations : ");
		for (int i = 0; i < noOfTransactions; i++) {
			temp = sc.nextInt();
			if(temp>0) {
				transactionArr[i] = temp;
			}
		}
		return transactionArr;
	}
}
