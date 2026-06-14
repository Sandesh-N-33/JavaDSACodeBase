package StringsPractice;

import java.util.Scanner;

public class RemoveSpaces {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        str = "";
        for(String word:words){
            str += word;
        }
        System.out.println("The updated string is: "+str);
    }
}
