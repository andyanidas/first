public class isItDivisible {

    public static void main(String[] args){
        //checking whether the give number is divisible by 5 and 11 or not
        int x = 25;
        if(x%5==0 && x%11==0){ //x%5==0 -> x iig 5t huvaagaad uldegdel n 0 tegtei tentsuu yu? (x 5t huvaagddaguu ?)
            System.out.println("ogogdson too 5 bolon 11t hoyuuland n huvaagdna");
        }else if(x%5==0 || x%11==0){
            System.out.println("ogogdson too 5 esvel 11 iin ali negend n huvaagdana");
        }else{
            System.out.println("ogogdson too 5,11 alind n ch huvaagdahgui");
        }

        if(x%2==0){
            System.out.println("ogogdson too tegsh!");
        }else{
            System.out.println("ogogdson too sondgoi");
        }

        /*
        hereglegchees too asuuna
        hereglegchiin oruulsan toog tegsh sondgoi esvel eyreg sorog bolhiig todorhoil
        ex:
        55
        -55
        -> tanii oruulsan too sondgoi eyreg too baina!

        * */

    }
}
