package project;



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class proj1 {
    public static void main(String[] args) {
        String username,password,accessUsername,accessPassword;
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Create your username: ");
        username = input.next();
        System.out.print("Create your password: ");
        password = input.next();


        WelcomingMsg();
        while(!exit){
            System.out.print("Enter your username: ");
            accessUsername = input.next();
            System.out.print("Enter your password: ");
            accessPassword = input.next();
            if(username.equals(accessUsername) && password.equals(accessPassword)){
                exit = true;
                System.out.println("Access Granted!");
            }else{
                System.out.println("Access Denied! \nPlease Try again");
            }
        }
        GuessNum();

    }

    public static void WelcomingMsg(){
        System.out.println("Welcome to my application \nPlease Enter your username and password to access this application");
    }

    public static void GuessNum(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int RandomNum = rand.nextInt(100);
        int guess,count=1;
        System.out.println("Guess a number between 0-100: ");
        guess = input.nextInt();

        while(RandomNum!=guess){
            count++;
            if(guess>RandomNum){
                System.out.println("Too high");
            }else{
                System.out.println("Too low");
            }
            System.out.println("Guess a number between 0-100: ");
            guess = input.nextInt();
        }
        System.out.println("Congratulations you have successfully guessed the number in " + count + " tries.");
    }



    public static void playGame(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Player number:");
        int playerNum = input.nextInt(); //5


        int[] players = new int[playerNum];

        for(int i=0; i<playerNum; i++){
            players[i] = rand.nextInt(100);
        }
    }
}
