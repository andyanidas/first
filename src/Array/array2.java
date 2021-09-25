package Array;

public class array2 {
    public static void main(String[] args){
        int[] monthlyBill = {1,1,-9,8,-10,100,-200};
        int totalSpend=0;

        for(int i=0;i< monthlyBill.length; i++){
            if(monthlyBill[i]<0){
                totalSpend = totalSpend + monthlyBill[i];
            }
        }
        System.out.println("you have spend " + -1*totalSpend + "$ in this month");
    }
}

/*
String iin length
String iig tom useg bolgii
String iig jijig useg bolgii
String reverse bolgii (asd -> dsa)
String ogogdood hergelgcheed sting avaad hoorond n zalga
* */