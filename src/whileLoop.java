import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an positive integer: ");
        int i=100;
//        int num = input.nextInt();
        int num = 5;

        do{
            System.out.println(num + "*" + i + " = " + i*num);
            i++;
        }while(i<=10);
    }
}
