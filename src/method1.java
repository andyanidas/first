public class method1 {

    public static void nemelt(){
        nemelt2();
        System.out.println("This is a nemelt method");
    }

    public static void nemelt1(){
        System.out.println("This is a nemelt1 method");
    }
    public static void nemelt2(){
        nemelt1();
        System.out.println("This is a nemelt2 method");
    }
    public static void main(String[] args){
        nemelt();
        System.out.println("This is a main method");
    }

}
