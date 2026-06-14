package ArraysPractice;

import java.util.Scanner;

public class SpiralMatrix {
    static int[][] takeArrayInput(Scanner sc, int[][] arr, int r, int c) {
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void printMatrix(int[][] arr, int r, int c) {
        System.out.println("The entered matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printSpiralMatrix(int[][] arr, int r, int c) {
        System.out.println("The spiral matrix is: ");
//        for (int i = 0; i < r; i++) {
//            System.out.print(arr[i][i] + " ");
//        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of cols: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        arr = takeArrayInput(sc, arr, r,c);
        printMatrix(arr,r,c);
        printSpiralMatrix(arr,r,c);
    }
}
