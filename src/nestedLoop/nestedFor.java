package nestedLoop;

import java.util.Scanner;

public class nestedFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int Size = input.nextInt();
//        for(int i=0; i<Size;i++){
//            for(int j=0; j<Size;j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        for(int i =0; i<Size; i++){
            for(int j =0;j<Size;j++){
                if(i==0 || i ==Size-1 || j==0 || j ==Size-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
Size = 5

*****
****
***
**
*

 */
