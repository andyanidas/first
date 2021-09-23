public class method3 {

    public static void main(String[] args){
        int a = 15,b=20,c=1;
        System.out.println(findMaxOf3(a,b,c));
    }

    public static int findMaxOf3(int a, int b, int c){
        int maxim;
        maxim = findMax2(findMax2(a,b),c);
        return maxim;
    }
    public static int findMax2 (int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
