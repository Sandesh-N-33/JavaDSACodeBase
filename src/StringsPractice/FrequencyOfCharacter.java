package StringsPractice;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to be used: ");
        char target = sc.next().charAt(0);
        int count = 0;
        char[] chStr = str.toCharArray();
        for (char ch: chStr) {
            if (ch == target) {
                count++;
            }
        }
        System.out.print("The frequency of character '"+ target+ "' is :  " + count);
    }
}
