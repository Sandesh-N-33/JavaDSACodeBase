package Patterns;

import java.util.Scanner;

public class P6SolidPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        byte n = sc.nextByte();

        for(int i = 1; i<=n;i++){
            for(int j = 0; n-i-j>0; j++){
                System.out.print("   ");
            }
            for(int k = 0; k<(2*i)-1; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
