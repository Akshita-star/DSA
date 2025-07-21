import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int max=a;
        if(max<b){
            if(b>c)max=b;
            else max=c;
        }
        System.out.println(max);
    }
    
}
