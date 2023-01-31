package com.Smita.BankApp.controller;

import java.util.Scanner;

import com.Smita.BankApp.service.AccServiceImpl;

public class Admin {
	
	public static void main(String[] args) {
		
		AccServiceImpl ai = new AccServiceImpl();
		boolean bool=true;
		while(bool) {
		System.out.println("###########################################");
		System.out.println("#     ***Welcome to Bank Services***      #");
		System.out.println("###########################################\n");
		System.out.println("Press 1 for Create Account");
		System.out.println("Press 2 for View Account");
		System.out.println("Press 3 for Withdraw Money");
		System.out.println("Press 4 for Deposit Money");
		System.out.println("Press 5 for Upadte Account");
		System.out.println("Press 6 for Exit!\n");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			ai.createAcc();
			break;
		case 2:
			ai.viewAcc();
			break;
		case 3:
			ai.withdrawMoney();
			break;
		case 4:
			ai.depositMoney();
			break;
		case 5:
			ai.updateAcc();
			break;
		case 6:
			bool=false;
			System.out.println("Thank You! for using this Bank Service...");
			break;
		default:
			System.out.println("Invalid Choice!!!\n");
		}
		
		}
		
	}

}
