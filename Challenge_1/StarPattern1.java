public class StarPattern1 {
    public static void main(String args[]){
        for(int i=5;i>=0;i--){
            for(int j=i+1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=5;i>=0;i--){

            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=i-1;j>i;j--){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
