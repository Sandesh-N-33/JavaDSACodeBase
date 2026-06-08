package Patterns;

import java.util.Scanner;

public class P20NumRowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        byte height = sc.nextByte();

        for(int i = 1; i<=height;i++){
            for(int j = 1; j<=(height-i);j++){
                System.out.print("   ");
            }
            for(int k = 1; k<=(2*i)-1; k++){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
