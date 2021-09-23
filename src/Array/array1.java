package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        //array -> collection of something
        int[] arr = {1,1,2,3,4,5,2,3,4,5,123,4,1,5,51,23,3,14,15,7,5,15,1};
        String[] words = {"boldo","dorjoo","aaa"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value that you want to add: ");
        int number = input.nextInt();
        System.out.print("which position you want to add: ");
        int index = input.nextInt();
        int[] newArr = addX(index,arr,number);

        for(int i=0; i< newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }

    }
    public static int[] addX(int index, int arr[], int number)
    {
        int[] newArray = new int[arr.length+1];
        int newArrayIndex = 0;

        for(int i=0; i< arr.length; i++,newArrayIndex++){
            if(i==index-1){
                newArray[i] = number;
                newArrayIndex++;
            }
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
