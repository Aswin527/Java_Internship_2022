import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        System.out.println("Enter a Year:");
        Scanner scn=new Scanner(System.in);
        int year=scn.nextInt();
        if(year%4==0){
            if(year%100==0)
                if(year%400==0){
                    System.out.println("It's a Leap Year!");
                }else{
                    System.out.println("It's not a Leap Year!");
                }
            System.out.println("It's a Leap Year!");
        }else{
            System.out.println("It's not a Leap Year!");
        }
    }
}
