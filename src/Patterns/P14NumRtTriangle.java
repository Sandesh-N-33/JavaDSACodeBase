package Patterns;

import java.util.Scanner;

public class P14NumRtTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        byte height = sc.nextByte();

        for(byte i = 1; i<=height; i++){
            for(byte j =1; j<=i;j++){
                System.out.printf("%d  ",j);
            }
            System.out.println();
        }
    }
}
