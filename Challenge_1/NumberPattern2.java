import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String args[]){
        System.out.println("Enter number of Rows:");
        Scanner scn =new Scanner(System.in);
        int rows=scn.nextInt();
        int count=1;
        for(int i=rows;i>=0;i--){
            for(int j=i;j<=rows;j++){
                System.out.print((count++)+" ");
            }
            System.out.println(" ");
        }
    }
}
