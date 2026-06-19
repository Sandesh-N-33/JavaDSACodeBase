package BasicMath;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                int secondFactor = n/i;
                sum += (i+secondFactor);
            }
        }
        if (sum == n) {
            System.out.println("The no is a perfect number");
        } else {
            System.out.println("The no is not a perfect number");
        }
    }
}
