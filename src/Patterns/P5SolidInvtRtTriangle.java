package Patterns;

import java.util.Scanner;

public class P5SolidInvtRtTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        byte n = sc.nextByte();

        for(int i=0;i<n;i++){
            for(int j=n-i; j>0;j--){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
