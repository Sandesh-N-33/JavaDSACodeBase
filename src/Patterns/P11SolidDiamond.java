package Patterns;

import java.util.Scanner;

public class P11SolidDiamond {
    static void main() {
        //Diamond is only for odd nos
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of diamond: ");
        byte height = sc.nextByte();
        byte mid = (byte) ((height/2)+1);

        for(byte i = 1; i<=height;i++){
            if(i<=mid){
                for(byte j = 1; j<=mid-i; j++){
                    System.out.print("   ");
                }
                for(byte k= 1; k<=(2*i)-1; k++){
                    System.out.print("*  ");
                }
            }
            else{
                for(byte j = 1; j<=i-mid; j++){
                    System.out.print("   ");
                }
                for(byte k= 1; k<=2*(height-i)+1; k++){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
