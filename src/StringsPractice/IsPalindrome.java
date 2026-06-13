package StringsPractice;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] chStr = str.toLowerCase().toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start<end) {
            if(chStr[start]!=chStr[end]){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.print("The string is palindrome");
    }
}
