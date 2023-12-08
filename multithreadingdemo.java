package sample;

import java.util.Random;
class Numbermanager{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public synchronized void  generatenumber() {
		generatedNumber=new Random().nextInt(10)+2;
		System.out.println("Generated Random number:"+generatedNumber);
		numberGenerated=true;
		notifyAll();
	}
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber %2!=0) {
			wait();
		}
		int squre=(int)Math.pow(generatedNumber, 2);
		System.out.println("The cube of "+numberGenerated+" is "+squre);
		numberGenerated=false;
	}
	public synchronized void printOddNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber %2==0) {
			wait();
		}
		int cube=(int)Math.pow(generatedNumber, 3);
		System.out.println("The cube of "+numberGenerated+" is "+cube);
				numberGenerated=false;
	}
}
class NumberGenerator extends Thread{
	Numbermanager m=new Numbermanager();
	public NumberGenerator(Numbermanager m) {
		this.m=m;
	}
	public void run() {
		while(true) {
			m.generatenumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
class EvenprinterThread extends Thread{
	Numbermanager m=new Numbermanager();
	public EvenprinterThread(Numbermanager m) {
		this.m=m;
	}
	public void run() {
		while(true) {
			try {
				m.printEvenNumbers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class OddprinterThread extends Thread{
	Numbermanager m=new Numbermanager();
	public OddprinterThread(Numbermanager m) {
		this.m=m;
	}
	public void run() {
		while(true) {
			try {
				m.printOddNumbers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multithreaddemo {

	public static void main(String[] args) {
		Numbermanager m=new Numbermanager();
		NumberGenerator z=new NumberGenerator(m);
		EvenprinterThread e=new EvenprinterThread(m);
		OddprinterThread o=new OddprinterThread(m);
		z.start();
		e.start();
		o.start();
	}

}
