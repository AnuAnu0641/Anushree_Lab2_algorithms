package com.denominations.payment;

public class AmountPaid {
	
	int[] currencyArr;
	int amount;
	
	public AmountPaid(int[] currencyArr, int amount) {
		this.currencyArr = currencyArr;
		this.amount = amount;
	}

	public int[] notesCount(int[] currencyArr, int amount) {
		
		int[] notesCounter = new int[currencyArr.length];

		for (int i = 0; i < currencyArr.length; i++) {
			if (amount >= currencyArr[i]) {
				notesCounter[i] = amount / currencyArr[i];
				amount = amount - notesCounter[i] + currencyArr[i]; // use modulus
			}
		}
		
		if (amount > 0) {
			System.out.println("the exact target not reachable");
			return new int[currencyArr.length];
		} else {
			return notesCounter;
		}
	}

	public void payAmount() {
		
		AmountPaid obj = new AmountPaid(currencyArr,amount);
		obj.notesCount(currencyArr, amount);
		int[] notesCounterArray = notesCount(currencyArr, amount);

		for (int index = 0; index < notesCounterArray.length; index++) {
			if (notesCounterArray[index] != 0) {
				System.out.println(currencyArr[index] + ":" + notesCounterArray[index]);
			}
		}
	}

}
