package recursive;

import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    public static int factorial (int num) {
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
