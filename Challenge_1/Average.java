import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        System.out.println("Enter count of Numbers:");
        Scanner scn= new Scanner(System.in);
        int size=scn.nextInt();
        System.out.println("Enter the Numbers:");
        int a[]=new int[size];
        int sum=0,average=0;
        for (int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }

        for (int j=0;j<a.length;j++){
            sum=sum+a[j];
        }
        average=sum/size;
        System.out.println("Average of the Numbers:"+average);
    }
}
