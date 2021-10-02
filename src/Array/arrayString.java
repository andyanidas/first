package Array;

public class arrayString {
    public static void main(String[] args) {
        String[] words = {"hello", "this", "isthee", "worddddd", "list"};
        String longestWord = words[0];
        for(String word: words){
            if(longestWord.length()<word.length()){
                longestWord = word;
            }
        }
        System.out.println("Longest word in my list is " + longestWord);

//        for(int i=0;i<words.length;i++){
//            String word = words[i];
//            System.out.println(word);
//        }
//        int[] numbers = {1,2,3,4,5,6,7,8,9};
//        for(int number: numbers){
//            System.out.println(number);
//        }
//        for(int i=0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

    }
}
