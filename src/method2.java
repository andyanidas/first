import java.util.Scanner;

public class method2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while(!exit){ // while(false)
            System.out.print("Enter 2 number: ");
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.print("Which operator you want to do? (+-*/):");
            String op = in.next();
            double answer = calcul(x,y,op);
            System.out.println("Answer: " + answer);

            System.out.println("Do you want to exit? (yes/no)");
            String wantExit = in.next();
            if(wantExit.equals("yes")){
                exit = true;
            }
        }





//        int MAX = findMax(x,y);
//        System.out.println("Maximum value of the two integer that u have entered is " + MAX);

    }


    //void -> hooson yamar negen zuil(argument/parameter) butsaahgui
    //public static int-> ene method integer butsaana shuu gedgiig ilerhiilj baigaa

    //method that takes arguments/parameters
    //method with return value;
    public static int findMax(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static double calcul(double num1, double num2, String op){
        double result; //here my result is undefined

        if(op.equals("+")){
            result =  num1+num2;
        }else if(op.equals("-")){
            result =  num1-num2;
        }else if(op.equals("/")){
            result = num1/num2;
        }else if(op.equals("*")){
            result = num1*num2;
        }else{
            result = 0;
        }


        //here my result is not undefined
        return result;
    }

}
/*HomeWork:
write a method called printWeeks(int x) that takes 1 argument as integer
but return 1 argument as String and put that method into while/for loop
so that method will always be called while input is between 1-7
(Return string suppose be name that corresponding to the number)
* */
