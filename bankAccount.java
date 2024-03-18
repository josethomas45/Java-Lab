package javaproj1;


import java.util.Scanner;

class InvalidAmountException extends Exception {
	InvalidAmountException(String msg) {
		super(msg);
	}
}

class InsufficientFundsException extends Exception {
	InsufficientFundsException(String msg) {
		super(msg);
	}
}

class Bank {
	String name;
	int accountnum;
	float balance;
	Scanner sc = new Scanner(System.in);
	
	public void create(int m) {
		accountnum = m;
		System.out.print("Enter the name : ");
		name = sc.nextLine();
		System.out.print("Enter the balance : ");
		balance = sc.nextFloat();
	}
	
	public void display() {
		System.out.println("\nThe details of the user");
		System.out.println("\nAccount number : " + accountnum);
		System.out.println("Name of the account user = " + name);
		System.out.println("Balance : " + balance);
	}
	
	public void withdraw() throws InsufficientFundsException,InvalidAmountException {
		System.out.print("Enter the amount to withdraw : ");
		int amt = sc.nextInt();
		if(amt > balance) {
			throw new InsufficientFundsException("Insufficient balance");
		} else if(amt <= 0) {
			throw new InvalidAmountException("Amount is not valid");
		} else {
			balance = balance-amt;
			System.out.println("Balance amount=" + balance);
		}
	}
	
	public void deposit() throws InvalidAmountException {
		System.out.print("Enter the amount to deposit : ");
		int amt1 = sc.nextInt();
		if(amt1 <= 0) {
			throw new InvalidAmountException("Amount is not valid");
		} else {
			balance = balance+amt1;
			System.out.println("Balance amount = " + balance);
		}
	}
}

public class bankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of accounts you want to enter : ");
		int n = sc.nextInt();
		Bank b[];
		b = new Bank[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("\nEnter the details");			
			b[i] = new Bank();
			b[i].create(i+10001);
			b[i].display();
		}
		
		int y;
		int l;
		
		do {	
			System.out.print("\nAvailable operations are : \n1 - deposit\n2 - withdrawal\n3 - search\nEnter your choice : ");
			y = sc.nextInt();
			switch(y) {
				case 1:				
					System.out.print("Enter the account number : ");
					int r = sc.nextInt();
					for(int i=0;i<n;i++) {
						if(r == b[i].accountnum) {
							try	{
								b[i].deposit();
							}
								catch(InvalidAmountException e) {
									System.out.println(e);
							}
						}
					}				
					break;
					
				case 2:					
					System.out.print("Enter the account number : ");
					int r1 = sc.nextInt();
						for(int i=0; i<n; i++) {
							if(r1 == b[i].accountnum) {
								try {
									b[i].withdraw();
								}
								catch(InsufficientFundsException e) {
									System.out.println(e);
								}
								catch(InvalidAmountException e) {
									System.out.println(e);
								}
							}
						}
					break;
					
				case 3:				
					System.out.print("Enter the account number to be searched : ");
					int acn = sc.nextInt();
					for(int i=0; i<n; i++) {
					if(acn == b[i].accountnum) {
						  b[i].display();
						}
					}
					break;
				}
				System.out.print("\nDo you want to continue ? 1 for YES and 0 for NO : ");
				l = sc.nextInt();
		} while(l == 1);
	 
	}
}