package com.denominations.driver;

import java.util.Scanner;

import com.denominations.payment.AmountPaid;
import com.denominations.sorting.MergeSort;
import com.denominations.util.DenominationValues;

public class MainClass {
	
	static int[] currencyArr;
	static int noOfDenominations;
	static int amount;
	private static final Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		DenominationValues obj = new DenominationValues();
		noOfDenominations = obj.getNoOfDenominations();
		currencyArr[noOfDenominations] = obj.inputCurrency(currencyArr);
		
		System.out.println("Enter amount to be paid");
		amount = sc.nextInt();
		
		for(int i=0; i<currencyArr.length; i++)
			System.out.print(currencyArr+" ");
		
		MergeSort.mergeSort(currencyArr, 0, noOfDenominations-1);
		
		AmountPaid amountObj = new AmountPaid(currencyArr, amount);
		amountObj.payAmount();
		
	}

}
