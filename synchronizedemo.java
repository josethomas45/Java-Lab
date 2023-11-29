
class MultiplicationTable{
	void printMultiplicationTable(int number) {
		synchronized (this) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"X"+number+"="+i*number);
		}
		}
		
	}
}
class MyThread1 extends Thread{
	MultiplicationTable t;
	MyThread1(MultiplicationTable t) {
		this.t=t;
	}
	public void run() {
		t.printMultiplicationTable(2);
	}
}
class MyThread2 extends Thread{
	MultiplicationTable t;
	MyThread2(MultiplicationTable t) {
		this.t=t;
}
	public void run() {
		t.printMultiplicationTable(5);
	}
}
public class synchronizedemo {
	
	public static void main(String[] args) {
		
		MultiplicationTable j= new MultiplicationTable();
		MyThread1 t=new MyThread1(j);
		t.start();
		
		MultiplicationTable j1= new MultiplicationTable();
		MyThread2 t1=new MyThread2(j1);
		t1.start();
		
	}

}
