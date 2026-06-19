package BasicMath;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

    static int powerOf(int a, int b){
        int pow = 1;
        for(int i = 1; i<=b;i++){
            pow *= a;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        int orgN = n;

        int digit = 0;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            arr.add(digit);
            count++;
        }
        int sum = 0;
        for(Integer ele:arr){
            sum = powerOf(ele,count) + sum;
            if(sum>orgN){
                System.out.println("Is not an armstrong nnumber");
                return;
            }
        }
        if(sum==orgN){
            System.out.println("Is armstrong number");
        }
        else{
            System.out.println("Is not an armstrong number");
        }
    }
}
