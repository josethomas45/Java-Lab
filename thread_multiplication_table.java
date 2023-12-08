package javaproj1;

import java.util.Scanner;
public class thread_multiplication_table{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number that you want run in thread1: ");
		int number1=sc.nextInt();
		System.out.print("Enter the number that you want run in thread2: ");
		int number2=sc.nextInt();
		System.out.print("Enter the number that you want run in thread3: ");
	    int number3=sc.nextInt();
		Multitable m=new Multitable();
		Mythread1 a=new Mythread1(m,number1);
		Mythread2 b=new Mythread2(m,number2);
		Mythread3 c=new Mythread3(m,number3);
		a.start();
		b.start();
		c.start();
	}
} 
class Multitable{
	synchronized void printmultiplicationTable(int number) {
			for(int i=1;i<=10;i++) { 
				System.out.println(number+"X"+i+"="+i*number);
		}
	}
}
class Mythread1 extends Thread{
	Multitable a;
	int number1;
	 Mythread1(Multitable a,int number1) {
		 this.number1=number1;
		this.a=a;
	}
	 public void run() {
		 a.printmultiplicationTable(number1);
	 }
	
}
class Mythread2 extends Thread{
	Multitable b;
	int number2;
	Mythread2(Multitable b,int number2){
		this.number2=number2;
		this.b=b;
	}
	public void run() {
		b.printmultiplicationTable(number2);
	}
}
class Mythread3 extends Thread{
	Multitable c;
	int number3;
	Mythread3(Multitable c,int number3){
		this.number3=number3;
		this.c=c;
	}
	public void run() {
		c.printmultiplicationTable(number3);
	}
}




	




