package ArraysPractice;

import java.util.Scanner;

public class TransposeMatrix {

    static int[][] takeArrayInput(Scanner sc, int[][] arr) {
        System.out.println("Enter the matrix elements: ");
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void printMatrix(int[][] arr) {
        System.out.println("The entered matrix is: ");
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printTranspose(int[][] arr) {
        System.out.println("The transpose matrix is: ");
        int c = arr.length;
        int r = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of cols: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        arr = takeArrayInput(sc, arr);
        printMatrix(arr);
        printTranspose(arr);
    }
}
