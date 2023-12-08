/* File 	  : QuickSortDemo.java
 * Description: QuickSort
 * Author	  : Jose Thomas
 * Version	  : 1.0
 * Date		  : 08/12/2023
 */

package javaproj1;

import java.util.Scanner;
public class QuickSortDemo {
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[low]; 
        int i = low;
        for (int j = low + 1; j <= high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, low, i); 
        return i;
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        sc.nextLine(); 

        String[] string2 = new String[limit];
        System.out.println("Enter string:");
        for (int i = 0; i < limit; i++) {
            string2[i] = sc.nextLine();
        }

        quickSort(string2, 0, limit - 1);

        System.out.print("Sorted string : ");
        for (int i = 0; i < limit; i++) {
            System.out.print(string2[i]+"  ");
        }
    }
}
