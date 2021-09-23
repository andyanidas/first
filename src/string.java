import java.util.Scanner;

public class string {

    public static void main(String[] args){
        String sen = "Hello";
        String askName = "Enter your name:";
        String askGender = "Enter your gender:";
        String name;
        String gender;
        Scanner input=  new Scanner(System.in);
        System.out.print(askName);
        name = input.nextLine();
        System.out.print(askGender);
        gender = input.next();
      //while(!gender.equals("male") && !gender.equals("female"))
        while(!(gender.equals("male") || gender.equals("female"))){
            System.out.print("Please enter a valid gender (male/female): ");
            gender = input.next();
        }

        if(gender.equals("male")){
            sen = sen + " Mr." + name + " welcome to my application";
        }else{
            sen = sen + " Ms." + name + " welcome to my application";
        }
        System.out.println(sen);
    }
}
