package ArraysPractice;

import java.util.Scanner;

public class ReverseArray {
    static int[] takeArrayInput(Scanner sc, int[] arr){
        System.out.println("Enter the array elements: ");
        int n = arr.length;
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printIntArray(int[] arr){
        System.out.println("The array is: ");
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = takeArrayInput(sc,arr);

        int s = 0;
        int e = n-1;

        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;e--;
        }

        printIntArray(arr);
    }
}
