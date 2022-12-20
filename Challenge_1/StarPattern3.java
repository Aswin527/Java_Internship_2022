public class StarPattern3 {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){//12
            for(int j=1;j<=4;j++){//1234 - 123
                if((i==1 || i==4 || j==1 || j==4 )){//true
                    System.out.print("* ");//****- *  
                }else{
                    System.out.print("  ");    
                }
            }
            System.out.println(" ");
        }
    }
}
