package StringsPractice;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] chStr = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start<end) {
            char temp = chStr[start];
            chStr[start] = chStr[end];
            chStr[end] = temp;
            start++;
            end--;
        }
        str = String.valueOf(chStr);
        System.out.print("The reversed string is " + str);
    }
}
