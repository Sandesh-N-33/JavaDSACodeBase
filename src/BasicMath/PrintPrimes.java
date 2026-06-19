package BasicMath;

import java.util.Scanner;

public class PrintPrimes {

    static boolean isPrime(int n){
        boolean isPrimeNo = true;
        for(int i =2;i<n;i++){
            if(n%i==0){
                isPrimeNo = false;
                return isPrimeNo;
            }
        }
        return isPrimeNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
