package recursive;

import java.util.Scanner;

public class recursivePower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.print("Enter power: ");
        int pow = input.nextInt();
        System.out.println(num + "^" + pow + "=" + power(num,pow));
    }

    public static int power(int num,int pow) {
        if(pow == 1){
            return num;
        }
        return num*power(num,pow-1);
    }
}
