import java.util.Scanner;

public class RGB7008 {
    public static void main(String [] args){
        int num,ten;
        Scanner in = new Scanner(System.in);
        num = in.nextInt(); //123/10 = 959%10 = 9

        ten = num/10; // ten = 12
        ten = ten%10; // ten = 2
        System.out.println(ten);
    }
}
 //3265123 % 10 = 3
// 3265123 % 100 = 23