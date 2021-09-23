import java.util.Scanner;

public class RGB_MAIN {

    public static void main(String[] args){
        String RGBcode;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter RGB code that you want to run (-1 to exit): ");
        RGBcode = input.next();

        while(!RGBcode.equals("-1")){
            switch(RGBcode){
                case "RGB7170":
                    int floor = input.nextInt();
                    int doors = input.nextInt();
                    int toFind = input.nextInt();
                    RGB7170(floor,doors,toFind);
                    break;
                case "RGB7008":
                    System.out.println(RGB7008(input.nextInt()));
                    break;
                case "RGB7002":
                    int a = input.nextInt();
                    int b = input.nextInt();
                    int c = input.nextInt();
                    if(checkVaildTriangle(a,b,c)){
                        int answer = RGB7002(a,b,c);
                        System.out.println(answer);
                    }else{
                        System.out.println("invalid sides for triangle");
                    }

                    break;
                default:
                    System.out.println("Invalid RGB code!");
            }
            System.out.print("Enter RGB code that you want to run (-1 to exit): ");
            RGBcode = input.next();
        }
        System.out.println("Thank you for using my RGB problem solution Application!");

    }
    public static int RGB7008(int num){
        int ten;
        ten = num/10; // ten = 12
        ten = ten%10; // ten = 2
        return ten;
    }
    public static int RGB7002(int a,int b, int c){
        return a+b+c;
    }
    public static boolean checkVaildTriangle(int a, int b, int c){
        if(a + b < c || a + c < b || b + c < a){
            return false;
        }

        return true;
    }

    //floor =5 , doors =4 , toFind = 8
    public static void RGB7170(int floor, int doors, int toFind){
        int JohnFloor = toFind / doors;
        if(toFind % doors != 0){
            JohnFloor++;
        }

        int thDoor = toFind%doors;
        if(toFind%doors == 0){
            thDoor = doors;
        }
        System.out.println(JohnFloor + " " + thDoor);
    }
}
