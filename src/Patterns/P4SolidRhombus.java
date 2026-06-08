package Patterns;

import java.util.Scanner;

public class P4SolidRhombus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of rhombus: ");
        byte n = sc.nextByte();

        for(int i = 0; i<n; i++){
            for(int j = 1; n-i-j>0;j++){
                System.out.print("   ");
            }

            for(int k = 0; k<n;k++){
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
