package BasicMath;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        int digit = 0;
        int sum = 0;
        while(n>0){
            digit = n%10;
            n /= 10;
            sum+=digit;
        }
        System.out.println(sum);
    }
}
