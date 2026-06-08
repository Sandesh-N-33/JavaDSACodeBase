package Patterns;

import java.util.Scanner;

public class P21PascalAlphabeticalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        byte height = sc.nextByte();

        for(int i = 1; i<=height;i++){
            for(int j = 1; j<=(height-i);j++){
                System.out.print("   ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print((char) ('A'+k-1)+"  ");
            }
            for(int l = i-1; l>=1; l--){
                System.out.print((char) ('A'+l-1)+"  ");
            }
            System.out.println();
        }
    }
}
