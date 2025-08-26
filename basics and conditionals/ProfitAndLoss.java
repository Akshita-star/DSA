//input sp and cp and find out whether profit or loss or nothing and print the profit and loss
import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args) {
        System.out.print("Enter cp:");
        Scanner scan=new Scanner(System.in);
        double cp=scan.nextDouble();
        System.out.print("Enter sp:");
        double sp=scan.nextDouble();
        if(cp==sp){
            System.out.println("NO LOSS OR PROFIT INCURRED");
        }else if(cp>sp){
            System.out.printf("LOSS INCURRED:");        
            System.out.println(cp-sp); 
        }else{
            System.out.println("PROFIT INCURRED:");
            System.out.println(sp-cp);
        }
        
    }
    
}
