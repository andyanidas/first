package nestedLoop;

import java.util.Scanner;

public class nestedFor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int Size = input.nextInt();

        for(int i=0; i<Size; i++){
            for(int star=0;star<Size-i; star++){
                System.out.print('-');
            }
            System.out.println();
        }
    }
}
/*
Size = 5

*****   i=0 star = 5
****    i=1 star = 4
***     i=2 star = 3
**      i=3 star = 2
*       i=4 star = 1

 */

