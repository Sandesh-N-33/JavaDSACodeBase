package Patterns;

import java.util.Scanner;

public class P9HollowRtTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height and approach for right triangle: ");
        byte height = sc.nextByte();
        byte approach = sc.nextByte();

//        approach 1: own
        if(approach==1){
            for (byte i = 1; i <= height; i++) {
                byte hyp = i;
                for (byte j = 1; j <= hyp; j++) {
                    if (i == 1) {
                        System.out.print("*  ");
                        break;
                    } else if (i == height) {
                        System.out.print("*  ");
                    } else {
                        if (j == 1 || j == hyp) {
                            System.out.print("*  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                }
                System.out.println();
            }
        }
//        approach 2: babbar
        else{
            for (byte i = 1; i <= height; i++) {
                if (i == 1 || i == 2 || i == height) {
                    for (byte j = 1; j <= i; j++) {
                        System.out.print("*  ");
                    }
                } else {
                    System.out.print("*  ");
                    for (byte j = 1; j <= (i - 2); j++) {
                        System.out.print("   ");
                    }
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }
}
