package Patterns;

import java.util.Scanner;

public class P13Butterfly {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of butterfly(even only): ");
        byte height = sc.nextByte();
        byte mid = (byte) (height / 2);

        for (byte i = 1; i <= mid; i++) {
            for (byte j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            for (byte k = 1; k <= (height - (2 * i)); k++) {
                System.out.print("   ");
            }
            for (byte j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (byte i = mid; i >= 1; i--) {
            for (byte j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            for (byte k = 1; k <= (height - (2 * i)); k++) {
                System.out.print("   ");
            }
            for (byte j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
