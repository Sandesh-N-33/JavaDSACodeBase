package ArraysPractice;

import java.util.Scanner;

public class PrintDiagonal {
    static int[][] takeArrayInput(Scanner sc, int[][] arr, int n) {
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void printMatrix(int[][] arr, int n) {
        System.out.println("The entered matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printDiagonal(int[][] arr, int n) {
        System.out.println("The diagonal elements of the matrix are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows/columnns: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        arr = takeArrayInput(sc, arr, n);
        printMatrix(arr, n);
        printDiagonal(arr, n);
    }
}
