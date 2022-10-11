package com.greatlearning.paymoney.main;

import java.util.Scanner;

public class Driver {

	private static int getNoOftransaction(int arr[], int target) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total +=arr[i];

			if (total >= target) {
				return i + 1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of transaction array :");
		int txnsize = s.nextInt();
		int txn[] = new int[txnsize];
		System.out.println("Enter the values of array:");
		for (int i = 0; i < txnsize; i++) {
			txn[i] = s.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved:");
		int noOftargets = s.nextInt();
		for (int i = 0; i < noOftargets; i++) {
			System.out.println("Enter target # no " + (i+1));
			int target = s.nextInt();
			int countTxn = getNoOftransaction(txn, target);
			if (countTxn < 0) {
				System.out.println("Target not achieved");
			} else {
				System.out.println("Target achieved in: " + countTxn);
			}
		}
	}

}
