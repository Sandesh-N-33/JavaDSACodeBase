package BasicMath;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        int newNo = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            newNo = newNo*10 + digit;
        }
        System.out.println("The reversed no is "+ newNo);
    }
}
