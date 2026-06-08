package Patterns;

import java.util.Scanner;

public class P8HollowRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and breadth of recatangle: ");
        byte length = sc.nextByte();
        byte breadth = sc.nextByte();

        for(int i = 1; i<=breadth;i++){
            for(int j = 1; j<=length;j++){
                if(i==1 || i==breadth){
                    System.out.print("*  ");
                }
                else if(j==1 || j==length){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
