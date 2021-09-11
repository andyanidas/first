import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1-7: ");
//        int day= input.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("T");
//            case 3 -> System.out.println("W");
//            case 4 -> System.out.println("Tu");
//            case 5 -> System.out.println("F");
//            case 6 -> System.out.println("Sat");
//            case 7 -> System.out.println("sun");
//            default -> System.out.println("invalid input!");
//        }
        System.out.println("Which day is today?");
        String day = input.next();

        //case sensitivity
        switch (day) {
            case "Monday":
                System.out.println("Working very first day!");
                break;
            case "Tuesday":
                System.out.println("working normal day");
                break;
            case "Wednesda":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println("soon will be friday ");
                break;
            case "Friday":
                System.out.println("Final day of work");
                break;
            case "Saturday":
                System.out.println("happy day");
                break;
            case "Sunday":
                System.out.println("tomorrow will be working day");
                break;
            default:
                System.out.println("invalid input!");
                break;
        }



    }

}
