import java.util.Scanner;

public class andOr {

    public static void main(String[] args){
//        int x =15,y = 20, z=44;
////           ||-> OR  &&-> AND operators
//
//        if(x>y && x>z){ //if x is greater than y and x is greater than z then biggest is X
//            System.out.println("Biggest is: " + x);
//        }else if(z>y){
//            System.out.println("Biggest is: " + z);
//        }else{
//            System.out.println("Biggest is: " + y);
//        }

        /*
        2 toog haritsuulahdaa == ashiglana if(x==y)
        2 String iig haritsuulahdaa .equal() command ashiglana if(abc.equal(input))



        *  AND (&&) operatoriin 2 taliin nohtsol zaaval burdeh yostoi!!!!
        *  OR (||) operatoriin 2 taliin nohtsoliin ali neg n zaaval burdeh yostoi!!!!

        * */
        String answer1, answer2;
        Scanner in  = new Scanner(System.in);
        System.out.println("Is it raining? ");
        answer1 = in.next();
        System.out.println("Is it Snowing? ");
        answer2 = in.next();

        if(answer1.equals("yes") || answer2.equals("yes")){
            System.out.println("Take umberella before you go out");
        }

        //modula operator %
        // 19%5 = 4

    }
}
