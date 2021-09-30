package nestedLoop;

import java.util.Scanner;

public class nestedFor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int Size = input.nextInt();

        for(int i=0;i<Size; i++){
            for(int space=0;space<Size-i-1;space++){
                System.out.print(" ");
            }
            for(int star=0;star<Size; star++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}

/*
Size = 5

----*****   i=0 space = 4
---*****    i=1 space = 3
--*****     i=2 space = 2
-*****      i=3 space = 1
*****       i=4 space = 0

 */
