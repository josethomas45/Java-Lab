
abstract class Animal{
	
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs");
	}
	
}

class Spider extends Animal{
	Spider(){
		super(8);
	}
	@Override
	public void eat() {
		System.out.println("Spider eats");
	}
}
interface Pet{
	String getName();
	void setName(String name);
	void play();
	}
	
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name=name;
	}
		
		@Override
	public void eat() {
		System.out.println("Cat eats fish");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void play(){
		System.out.println("The cat is playing");
	}
		
}
	class Fish extends Animal implements Pet{
		private String name;
		public Fish(String name) {
			super(0);
			this.name=name;
		}
		public void eat() {
			System.out.println("fish eats");
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void play() {
			System.out.println("The fish is playing");
		}
		public void walk(){
			System.out.println("Fish cant walk");
		}
		
	}
	


public class interfacetest {
	
	public static void main(String[] args) {
	
    Fish d = new Fish();
    Cat c = new Cat();
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();
    
    System.out.println("FISH");
    d.setName("Demo");
    d.eat();
    d.walk();
    d.setName("min");
    
    System.out.println("\n");
    
    System.out.println("CAT");
    c.setName("Fluffy");
    c.walk();
    c.eat();
    c.setName("Moose");
    
    System.out.println("\n");
    
    System.out.println("SPIDER");
    e.eat();
    e.walk();

	}

}
