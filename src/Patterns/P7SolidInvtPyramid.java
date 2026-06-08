package Patterns;

import java.util.Scanner;

public class P7SolidInvtPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        byte n = sc.nextByte();

        for(int i =1; i<=n;i++){
            for(int j = 1; j<i; j++){
                System.out.print("   ");
            }
            for(int k = 1; k<=(2*(n-i))+1; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
