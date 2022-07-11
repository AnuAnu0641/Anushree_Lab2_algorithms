package com.denominations.util;

import java.util.Scanner;

public class DenominationValues {

	static int noOfDenominations;
	private static Scanner sc = new Scanner(System.in);
	
	public int getNoOfDenominations() {
		return noOfDenominations;
	}

	public int[] inputCurrency(int[] currencyArr) {
		System.out.println("Enter the size of currency denominations");
		noOfDenominations = sc.nextInt();
		currencyArr = new int[noOfDenominations];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < noOfDenominations;) {
			currencyArr[i] = sc.nextInt();
			if (currencyArr[i] != 0) 
				i++;
		}
		return currencyArr;
	}
}
