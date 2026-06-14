package StringsPractice;

import java.util.Scanner;

public class StringToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] chStr = str.toCharArray();
        for (int i = 0; i < chStr.length; i++) {  // use .length for array and .length() for String
            //a-z = 97-122 & A-Z = 65-90
            // If using the for each loop, the used iterator would be just a copy of the character and not the character in the array itself
            // Hence any attempt made to update the character will be of no use
            if (chStr[i] >= 'a' && chStr[i] <= 'z') {
                chStr[i] = (char) (chStr[i] - 32);
            }
        }
        str = String.valueOf(chStr);
        System.out.print("The updated string is:  " + str);
    }
}
