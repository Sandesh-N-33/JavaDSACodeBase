package BasicMath;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        if(n<2){
            System.out.println("Please enter a valid no to check");
            return;
        }

        for(int i = 2;i*i<=n;i++){ // Used i*i<=n as factors come in pairs and factors start repeating once sqrt(n) is reached.
            if(n%i==0){
                System.out.println(n+" is not a prime no.");
                return;
            }
        }
        System.out.println(n+" is a prime no.");
    }
}
