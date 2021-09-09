import java.util.Scanner;

public class findBiggest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1,num2,num3;
        System.out.print("Enter 3 number: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        if(num1>num2){
            if(num1>num3){
                System.out.println("Biggest number is :" + num1);
            }else{
                System.out.println("Biggest number is :" + num3);
            }
        }else{
            if(num2>num3){
                System.out.println("Biggest number is :" + num2);
            }else{
                System.out.println("Biggest number is :" + num3);
            }
        }
    }

}
