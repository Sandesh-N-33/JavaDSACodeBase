package Patterns;

import java.util.Scanner;

public class P1SolidSquare {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of columns/rows");
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i<n;i++){
            for(int j = 0; j < n; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
