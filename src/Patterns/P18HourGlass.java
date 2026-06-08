package Patterns;

import java.util.Scanner;

public class P18HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of hourglass: ");
        byte height = sc.nextByte();

        for(int i = 1; i<=height; i++){
            if(i<=(height/2)){
                for(int j = 1; j<i;j++){
                    System.out.print("   ");
                }
                for(int k = 1; k<=(height-(2*i) + 2); k++){
                    System.out.print("*  ");
                }
            }
            else{
                for(int j = 1; j<=(height-i);j++){
                    System.out.print("   ");
                }
                for(int k = 1; k<=(i-2)*2-3; k++){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }

    }
}
