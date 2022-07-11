package com.paymoney.accounts;

import java.util.Scanner;

import com.paymoney.services.TargetsStatus;

public class DailyTargets {
	
	private int noOfTargets;
	private static final Scanner sc = new Scanner(System.in);
	TargetsStatus obj = new TargetsStatus();
	
	public int getNoOfTargets() {
		return noOfTargets;
	}

	public int[] getTargets(int[] targetArr) {

		System.out.println("Enter the number of targets thats needs to be achieved");
		noOfTargets = sc.nextInt();
		targetArr = new int[noOfTargets];
		
		System.out.println("Enter the values of targets : ");
		for (int i = 0; i < noOfTargets; i++) {
			targetArr[i] = sc.nextInt();
		}
		return targetArr;
	}
}
