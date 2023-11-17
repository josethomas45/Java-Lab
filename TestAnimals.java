package javaproj1;

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
	
	public Spider(){
		super(8);
	}
	@Override
	public void eat() {
		System.out.println("The spider eat's Insects");
	}
}
interface pet{
	String getName();
	void setName(String name);
	void play();
}

class Cat extends Animal implements pet{
	private String name;
	public Cat(String name) {
		super(4);
	    this.name=name;
	}
	Cat(){
		this("");
	}
	
	@Override
	public void eat() {
		System.out.println("The cat eat's fish");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("The cat is playing");
	}
}
class Fish extends Animal implements pet{
	private String name;
	public Fish() {
		super(0);
	}

	
	public void eat() {
		System.out.println("The fish eat's plants");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("The fish is playing");
	}
	
	public void walk() {
		System.out.println("The fish has no legs");
	}
}
public class TestAnimals {
      public static void main(String[] args) {
    	  System.out.println("FISH");
    	  Fish fish=new Fish();
    	  fish.setName("Mimi");
    	  System.out.println("The fish's name is "+fish.getName());
    	  fish.walk();
    	  fish.eat();
    	  fish.setName("Momo");
    	  System.out.println("The fish's name is "+fish.getName());
    	  
    	  System.out.println("CAT");
    	  Cat cat=new Cat();
    	  cat.setName("Fluffy");
    	  System.out.println("The cat's name is "+cat.getName());
    	  cat.walk();
    	  cat.eat();
    	  cat.setName("isMoose");
    	  System.out.println("The cat's name is "+cat.getName());
    	  
    	  System.out.println("SPIDER");
    	  Spider spider=new Spider();
    	  spider.eat();
    	  spider.walk();

      }
}