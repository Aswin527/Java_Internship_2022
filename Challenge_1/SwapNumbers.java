import java.util.Scanner;

public class SwapNumbers {
    public static void main(String args[]){
        System.out.println("Enter two numbers:");
        System.out.println("A:- ");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("B:- ");
        int b=scn.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swappiing:");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
