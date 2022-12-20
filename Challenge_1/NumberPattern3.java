import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String args[]){
        int count=1;
        for(int i=5;i>=0;i--){
            for(int j=i;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
