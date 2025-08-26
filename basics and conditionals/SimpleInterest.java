import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter values of p r t :");
        double p=scan.nextDouble();
        double r=scan.nextDouble();
        double t=scan.nextDouble();
        System.out.println(p*r*t/100);

    }
   
}