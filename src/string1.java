public class string1 {
    public static void main(String[] args){
        String something = "this is first line \nthis is \"second\" line\nthis is third line";
        String anotherthing = " \\ this is a backslash";
        /*
        \n -> newline
        \t -> tab
        \a -> alert
        \b -> backspacce
         */

        String imdbScore = "Name\t\tScore\tReleased Year";
        String listItem = "NoteBookkk\t9.1\t\t2011";
        String listItem1 = "Benjamin\t8\t\t2015";

        System.out.println(imdbScore);
        System.out.println(listItem);
        System.out.println(listItem1);
        System.out.println("--------------------------------------------------------");
        String longSentence = "Grade andy sentences";
//        System.out.println(longSentence.substring(5));
        longSentence = longSentence.concat(" Last added sentence");
        System.out.println(longSentence);
        //index gedeg n ehneesee heddehi characteriig ilerhiilsen dugaar
        //buh index 0s ehlene

        for(int i=0; i<longSentence.length();i++){
            System.out.print(longSentence.charAt(i) + " ");
        }
        System.out.println("--------------------------------------------------");
        String name = "andyaaaa";
        String name1 = "dndz";
        System.out.println(name.compareTo(name1));
        System.out.println(name.toUpperCase());
        name = name.replace('a','l');
        System.out.println(name);

    }
}
//   hello this book name is "lord of the ring"