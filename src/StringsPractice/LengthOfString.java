package StringsPractice;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        int count = 0;
        for(char ch:strArr){
            count++;
        }
        System.out.print("The length of the string is "+count);
    }
}
