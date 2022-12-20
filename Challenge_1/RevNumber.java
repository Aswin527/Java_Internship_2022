import java.util.Scanner;

class RevNumber{
    public static void main (String args[]){
        System.out.println("Enter a number:");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int ini_num=num;
        int temp=0;
        int rev_no=0;
        while(num!=0){
            temp=num%10;
            num=num/10;
            rev_no=rev_no*10+temp;
        }
        System.out.println("Rev Number:--"+rev_no);
        if(ini_num==rev_no){
            System.out.println("Number is Paliendrom !!");
        }else{
            System.out.println("Number is not Paliendrom !!");
        }
    }
}