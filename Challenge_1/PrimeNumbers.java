import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String arg[]){
        System.out.println("Prime Numbers:\n");
        System.out.println("Enter the limit:");
        System.out.println("From:-:");
        Scanner scn=new Scanner(System.in);
        int limit_f=scn.nextInt();
        System.out.println("To:-:");
        int limit_t=scn.nextInt();
        for(int i=limit_f;i<=limit_t;i++){
            int counter=0;
            for(int j=i;j>=1;--j){
                if(i%j==0){
                    counter+=1;
                }
            }
            if(counter==2){
                System.out.println(i);
            }
        }
    }
    
}
