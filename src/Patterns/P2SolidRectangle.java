package Patterns;

import java.util.Scanner;

public class P2SolidRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        byte r = sc.nextByte();
        System.out.print("Enter no of columns: ");
        byte c = sc.nextByte();
        sc.close();

        for(byte i = 0; i<r; i++){
            for(byte j = 0; j<c;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
