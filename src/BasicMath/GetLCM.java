package BasicMath;

import java.util.Scanner;

public class GetLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a*b;

        while (b > 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println((prod/a) + " is LCM.");
    }
}
