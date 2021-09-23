package Array;

public class array3 {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5,2,3,4,5,123,4,1,5,51,23,3,14,15,7,5,15,1};

        System.out.print("All even numbers inside array are : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("All odd numbers inside array are : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("The biggest number in my array is " + findMax(arr));
    }

    //{1,1,2,3,4,5,2,3,4,5,123,4,1,5,51,23,3,14,15,7,5,15,1};
    public static int findMax(int[] in){
        int maximum = in[0];
        for(int i=0; i<in.length; i++){
            if(in[i]>maximum){
                maximum = in[i];
            }
        }
        return maximum;
    }
}
