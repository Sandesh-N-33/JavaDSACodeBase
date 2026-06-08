package Patterns;

import java.util.Scanner;

public class P10HollowPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        byte height = sc.nextByte();

        for(byte i =1; i<=height;i++){
            for(byte j = 1; j<=height-i;j++){
                System.out.print("   ");
            }
            if(i==1 || i==height){
                for(byte k = 1; k<=(2*i)-1; k++){
                    System.out.print("*  ");
                }
            }
            else{
                System.out.print("*  ");
                for(byte k = 1; k<=(2*i)-3;k++){
                    System.out.print("   ");
                }
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
