package com.paymoney.driver;

import com.paymoney.accounts.DailyTargets;
import com.paymoney.accounts.DailyTransactions;
import com.paymoney.services.TargetsStatus;

public class MainClass {
	
	public static int[] transactionArr;
	public static int noOfTransactions;
	public static int[] targetArr;
	public static int noOfTargets;

	public static void main(String[] args) {
		
		DailyTransactions obj1 = new DailyTransactions();
		transactionArr = obj1.getTransactions(transactionArr);
		noOfTransactions = obj1.getNoOfTransactions();

		DailyTargets obj2 = new DailyTargets();
		targetArr = obj2.getTargets(targetArr);
		noOfTargets = obj2.getNoOfTargets();
		
		TargetsStatus obj3 = new TargetsStatus();
		for(int i=0; i<targetArr.length; i++) {
			obj3.printTargetStatus(noOfTransactions, targetArr[i], transactionArr);
		}
	}

}
