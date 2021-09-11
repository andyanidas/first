import java.util.Scanner;

public class forLoop {

    //for loop
    public static void main(String[] args){
        //for(initialize;condition;update){body}
        //initialize -> loop ehelhed neg l udaa unshina!!!
        //condition -> loop ehled body hesegruu oruulah eshiig shiidne
        //update -> body heseg ajillaj duussnii daraa condition ehelhees omno ajillana
        System.out.println("Enter any positive number: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        int sum=0; //+1 +2 +3 +4

        for(int i=1 ; i<=userInput ; i++){
            sum = sum + i; //sum =6
        }
        System.out.println("sum of " + userInput + " = " + sum);

        for(int i=userInput ; i>0 ; i--){ //userInput = 50
            System.out.print(i + " ");
        }

//        i = i + 1 -> i++ post increment
//        i = i + 1 -> ++i pre increment
//        i = i - 1 -> i-- post decrement
//        i = i - 1 -> --i pre decrement




    }
}
//
//    char a= 'a';
//    char b= 'b';
//    System.out.println(a>b);
