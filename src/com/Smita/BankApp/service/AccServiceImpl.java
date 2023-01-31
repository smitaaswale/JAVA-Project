package com.Smita.BankApp.service;

import java.util.Scanner;

import com.Smita.BankApp.entity.Account;

public class AccServiceImpl implements AccountService {

	Account acc = new Account();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createAcc() {
		
		System.out.print("Enter Your Account Number: ");
		int accNo = sc.nextInt();
		acc.setAccNo(accNo);
		
		System.out.print("Enter Your Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		acc.setName(name);
		
		System.out.print("Enter Your Address: ");
		String add = sc.nextLine();
		acc.setAdd(add);
		
		System.out.print("Enter Your Pan No.: ");
		String panNo = sc.next();
		acc.setPanNo(panNo);
		
		System.out.print("Enter Amount you want to deposite: ");
		double bal = sc.nextDouble();
		acc.setBal(bal);
		
		System.out.println("Your Account Created Successfully!!!\n ");
		
	}

	@Override
	public void viewAcc() {
		
		System.out.println("*****Printing Account Details*****");
		System.out.println();
		System.out.println(acc.toString()+"\n");
}

	@Override
	public void withdrawMoney() {
		System.out.print("Enter Account No.: ");
		int useAccNo = sc.nextInt();
		if(useAccNo == acc.getAccNo()) {
			System.out.print("Enter the amout to Withdraw: ");
			double amt = sc.nextDouble();
			if(amt<=acc.getBal()) {
				double balAmt = acc.getBal() - amt;
				acc.setBal(balAmt);
				System.out.print("Withdraw Successfull!!! \nCurrent Balance is :"+ acc.getBal());
				System.out.println("\n");
				
			}else {
				System.out.println("Insufficient fund!!!\n");
			}
			
		}else {
			System.out.println("Need to Create Account First!!\n");
		}
		
	}

	@Override
	public void depositMoney() {
		System.out.print("Enter Account No.: ");
		int useAccNo = sc.nextInt();
		if(useAccNo == acc.getAccNo()) {
			System.out.print("Enter the amount to deposit: ");
			double dpamt = sc.nextDouble();
			double tamt = acc.getBal() + dpamt;
			acc.setBal(tamt);
			System.out.print(dpamt+" Amount Deposited Successfull!!! \nCurrent Balance is :"+ acc.getBal());
			System.out.println("\n");
		}else {
			System.out.println("Need to Create Account First!!\n");
		}
	}

	
	
	@Override
	public void updateAcc() {
		System.out.print("Enter the account no. :");
		int useAccNo = sc.nextInt();
		boolean bool=true;
		while(bool) {
		if(useAccNo == acc.getAccNo()) {
			System.out.println("Press 1 for Update Name");
			System.out.println("Press 2 for Update Address");
			System.out.println("Press 3 for Upadte Pan No.");
			System.out.println("Press 4 for Exit!\n");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter Name you want to update: ");
				String upName = sc.next();
				acc.setName(upName);
				System.out.println("Name Updated Sucessfully!!! \nYour Updated name is: "+acc.getName());
				System.out.println();
				break;
			case 2:
				System.out.print("Enter Address you want to update: ");
				String upAddr = sc.next();
				acc.setAdd(upAddr);
				System.out.println("Address Updated Sucessfully!!! \nYour Updated Address is: "+acc.getAdd());
				System.out.println();				
				break;
			case 3:
				System.out.print("Enter Pan No you want to update: ");
				String upPanNo = sc.next();
				acc.setPanNo(upPanNo);
				System.out.println("Pan No. Updated Sucessfully!!! \nYour Updated Pan No. is: "+acc.getPanNo());
				System.out.println();				
				break;
			case 4:
				bool=false;
				break;
			default:
				System.out.println("Invalid Choice!!!\n");
					
			}
		}else {
			System.out.println("Need to Create Account First!!\n");
		}	
		}
		

			
	}

}
