import java.util.Scanner;
public class ApOfNTerms {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=1,d=2;
        for(int i=0;i<n;i++){
            System.out.println(a+i*d);//worlks for everything
        }
    }
    
}
