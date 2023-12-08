/* File 	  : doublelinkedlist.java
 * Description    : DoublyLinked List
 * Author	  : Jose Thomas
 * Version	  : 1.0
 * Date		  : 08/12/2023
 */

package javaproj1;

import java.util.LinkedList;
import java.util.Scanner;

class DoublyLinkedList<T>{
	private LinkedList<T> list = new LinkedList<>();
	public void insertLast(T element) 
	{
		list.addLast(element);
	}
	public void insertFront (T element)
	{
		list.addFirst(element);
	}
	public void insertAtAnyPosition(int index, T element)
	{
		list.add(index, element);
	}
	public void  removeAtAnyPos(int index)
	{
	 list.remove(index);	
	}
	public void display() 
	{
	 for(T element: list) {
		 System.out.println(element+" ");
	 }
	 System.out.println();
	}
}



public class doublelinkedlist {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("---------------");
            System.out.println("1. Insert at Front:");
            System.out.println("2. Insert at Last:");
            System.out.println("3. Insert at any Position:");
            System.out.println("4. Remove at any Position:");
            System.out.println("5. Display:");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
            case 1: 
            	System.out.println("Enter the Element:");
            	int elements=sc.nextInt();
            	doublyLinkedList.insertFront(elements);
            	break;
            case 2:
            	System.out.println("Enter the Element:");
            	elements=sc.nextInt();
            	doublyLinkedList.insertLast(elements);
            	break;
            case 3:
            	System.out.println("Enter the Element:");
            	elements=sc.nextInt();
            	System.out.println("Enter the Position:");
            	int pos = sc.nextInt();
            	doublyLinkedList.insertAtAnyPosition(pos,elements );
            	break;
            case 4:
            	System.out.println("Enter the Position:");
            	pos = sc.nextInt();
            	doublyLinkedList.removeAtAnyPos(pos);
            	break;
            case 5:
            	System.out.println("Doubly Linked List:");
            	doublyLinkedList.display();
            	break;
            default:
            	System.out.println("Thank you");
            	break;
            }
		} while(choice<6);
            	
	}

}




