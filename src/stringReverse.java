public class stringReverse {
    public static void main(String[] args) {
        String words = "asdf";
        String wordsReverse = "";

        for(int i=words.length()-1; i>=0; i--){
            wordsReverse += words.charAt(i);
        }
        int a = 15;
        int b = 20;
        //a = a + b
        a +=b;

        System.out.println(a);
    }

}
