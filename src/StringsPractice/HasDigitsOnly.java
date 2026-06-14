package StringsPractice;

import java.util.Scanner;

public class HasDigitsOnly {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] chStr = str.toCharArray();
        for (char ch:chStr) {
            if (ch < '0' || ch > '9') {
                System.out.println("The string contains non-digit characters");
                return;
            }
        }
        System.out.print("The string is having digits only");
    }
}
