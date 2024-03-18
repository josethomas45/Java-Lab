package javaproj1;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Create threads for each number
        Thread thread1 = new Thread(new MultiplicationTablePrinter(num1));
        Thread thread2 = new Thread(new MultiplicationTablePrinter(num2));
        Thread thread3 = new Thread(new MultiplicationTablePrinter(num3));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MultiplicationTablePrinter implements Runnable {
    private final int number;

    public MultiplicationTablePrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}


    