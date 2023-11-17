package javaproj1;

import java.util.Scanner;
class InvalidamountException extends Exception{
	InvalidamountException(String str){
		super(str);
	}
}
class Insufficiantfundexception extends Exception{
	Insufficiantfundexception(String str){
		super(str);
	}
}
class Customer{
	
	int Accountnumber;
	int balance;
	String Accounttype;
	String name;
	Scanner sc=new Scanner(System.in);
	public void setcustomerdetails() {
		System.out.println("Enter the account number:");
		Accountnumber=sc.nextInt();
		System.out.println("Enter the account type:");
		Accounttype=sc.next();
		System.out.println("Enter the customer name:");
		name=sc.next();
		sc.nextLine();
		System.out.println("Enter the account opening balance:");
		balance=sc.nextInt();
	}
	public void getcustomerdetails() {
		System.out.println("______________________________");
		System.out.println("The customer details are:");
		System.out.println("Accountnumber: "+Accountnumber);
		System.out.println("Accounttype: "+Accounttype);
		System.out.println("Customer name: "+name);
		System.out.println("Account Balance: "+balance);
		System.out.println("______________________________");
	}
	
}
public class BankTest {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		InvalidamountException amountException=new InvalidamountException("amountException");
		Insufficiantfundexception fundexception=new Insufficiantfundexception("fundexception");
		System.out.println("Enter the number of customers:");
		int customerNo=sc.nextInt();
		Customer [] customer=new Customer[customerNo];
		for(int i=0;i<customerNo;i++) {
			customer[i]=new Customer();
			customer[i].setcustomerdetails();
		}
		
		do {
			System.out.println("______________________________");
			System.out.println("1)Display Account Details");
			System.out.println("2)Search by account number");
			System.out.println("3)Deposit the amount");
			System.out.println("4)Withdraw the amount");
			System.out.println("Enter your choice:");
			System.out.println("______________________________");
		    choice=sc.nextInt();
		    switch (choice) {
		    
		    case 1:
		    	for(int i=0;i<customerNo;i++) {
					customer[i].getcustomerdetails();
				}
		    	break;
		    case 2:
		    	int count=0;
		    	System.out.println("Enter the account number to search:");
		    	int accountNo=sc.nextInt();
		    	for(int i=0;i<customerNo;i++) {
		    		if(customer[i].Accountnumber==accountNo) {
		    			customer[i].getcustomerdetails();
		    		}
		    	}
		    	if(count==0)
		    	{
		    		System.out.println("Account not found");
		    	}
		    	
		    	break;
		    case 3:
		    	System.out.println("Enter the account number:");
		    	accountNo=sc.nextInt();
		    	try {
		    		System.out.println("Enter the amount to deposit:");
			    	int depositamount=sc.nextInt();
			    	if (depositamount<0)
			    		throw amountException;
			    	else {
			    	for(int i=0;i<customerNo;i++) {
			    		if(customer[i].Accountnumber==accountNo) {
			    			customer[i].balance=customer[i].balance+depositamount;
			    			customer[i].getcustomerdetails();
			    		}
			    		}
			    	}
		    	}
		    	catch(InvalidamountException e) {
		    		System.out.println("Invalid amount");
		    	}break;
		    	
		    case 4:
		    	System.out.println("Enter the account number:");
		    	accountNo=sc.nextInt();
		    	try {
		    		System.out.println("Enter the amount to withdraw:");
			    	int withdrawamount=sc.nextInt();
			    	if(withdrawamount<=0) {
			    		throw amountException;
			    	}
			    	else {
			    	for(int i=0;i<customerNo;i++) {
			    	
			    		if(customer[i].Accountnumber==accountNo) {
			    			if(withdrawamount>customer[i].balance) {
			    				throw fundexception;
			    			}
			    			else {
			    				customer[i].balance=customer[i].balance-withdrawamount;
			    				customer[i].getcustomerdetails();   			}
			    		}
			    		
			    	}
		    	}
		    
		        	
		    	
		    	}
		    	catch(InvalidamountException e) {
		    		System.out.println(e.getMessage());
		    	}
		        catch(Insufficiantfundexception e) {
		        	System.out.println("Error lack of amount");
		        }break;
		}
	}while(choice<5);

}
}


