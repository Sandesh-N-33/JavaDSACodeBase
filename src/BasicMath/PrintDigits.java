package BasicMath;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        int digit = 0;
        while(n>0){
            digit = n%10;
            n /= 10;
            System.out.println(digit);
        }
    }
}
