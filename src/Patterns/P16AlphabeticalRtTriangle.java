package Patterns;

import java.util.Scanner;

public class P16AlphabeticalRtTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        byte height = sc.nextByte();
        char letter = 'A';

        for(byte i = 0; i<height; i++){
            for(byte j =0; j<=i;j++){
                System.out.print((char) (letter+j)+"  ");
            }
            System.out.println();
        }
    }
}
