import java.util.Scanner;

public class Hello {

    public static void main(String[] args){
        int a = 15;
        int b = 20;
        long c = 1111111111111111111l;

        Scanner input = new Scanner(System.in);

        if(b != a){
//            System.out.println("a is bigger than b");
        }else{
//            System.out.println("b is greater than a");
        }
        // == is equal
        // != is not equal
        // >= <= < > greater than or less than operators
//        String name;
//        int age;
//        System.out.print("Enter your name: ");
//        name = input.nextLine();
//        name = input.next();
//        System.out.print("Enter your age: ");
//        age = input.nextInt();
//
//        System.out.println("Hello " + name + " nice to meet you \nYou born in year of " + (2021-age) + ".");
        String answer;
        System.out.println("Hello how are you? ");
        answer = input.nextLine();
        if(answer.equals("good how are you?")){
            System.out.println("i am good thanks for asking");
        }


    }
}
