import java.util.Scanner;

public class Calcul {

    public static void main(String[] args){
        int x = 14;
        int y = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("x%y = " + x%y); // % -> remainder (modulo operator) uldegdeliig n oldog operator
        System.out.println("x/y = " + x/y); // / -> huvaah temdeg
        System.out.println("----------------------------------------------------------------------------------");

        double num1,num2;
        String op;
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Second number: ");
        num2 = input.nextDouble();

        System.out.print("Which operator you want to do? (+-*/):");
        op = input.next();

        if(op.equals("+")){
            System.out.println("Sum of two number is : " + (num1+num2));
        }else if(op.equals("-")){
            System.out.println("difference of two number is : " + (num1-num2));
        }else if(op.equals("/")){
            System.out.println("num1/num2 = " + (num1/num2));
        }else if(op.equals("*")){
            System.out.println("multiple of two number:  " + (num1*num2));
        }else{
            System.out.println("Error You haven't entered a valid operator!!");
        }

        /*
        * too g hoorond n haritsuulahdaa  ><  == != zereg op ashiglaj bolno!!
        * useg bolon ugiig hoorond n haritsuulahdaa .equal() command ashiglana
        *
//        * */
//        String asd = "asdasd";
//        String bbb = "asdasd";
//        System.out.println(asd.equals(bbb));

        /*Heruul esvel Nairsag
        *Hello gej ehlene
        * dor hay 10n ugiin(oguulber) santai
            AI chat bot zohionoo
        *
        * example output:
        * Hello
        * ->hi
        * How are you?
        * ->good how are you? (if my answer is equal to "good how are you?")
        * I am good thanks
        * //-----------------------------
        * Hello
        * ->hi
        * How are you?
        * ->bad
        * good for me :D
        * ->who are you?
        * I am robot who are you?
        *
        * */
        System.out.println();


    }

}
