package Patterns;

import java.util.Scanner;

public class P3SolidRtAngleTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of triangle: ");
        byte n = sc.nextByte();

        for(byte i = 0; i<n;i++){
            for(byte j = 0; j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
