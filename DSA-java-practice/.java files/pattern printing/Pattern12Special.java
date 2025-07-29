import java.util.Scanner;
public class Pattern12Special{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            if(i!=n/2+1){//centre part
                for(int k=1;k<=n/2;k++){//for space
                    System.out.print(" ");
                 }
                System.out.print("*");
            }else{
                for(int j=1;j<=n;j++){
                    System.out.print("*");

                }
            }           
            System.out.println();
        }
    }
    
}