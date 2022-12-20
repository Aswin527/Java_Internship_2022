import java.util.Scanner;

public class AmstrongNum {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int original_no=0;
        int rem=0;
        int result=0;
        while(num!=0){
            rem=rem%10;
            result=result+(int)Math.pow(rem, String.valueOf(num).length());
            num=num/10;
        }
        if(result==original_no){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not an Amstrong Number");
        }
    }
}
