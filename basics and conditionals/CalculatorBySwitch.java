import java.util.Scanner;
public class CalculatorBySwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1->add 2->sub 3->divide 4->multi");
        int x=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        switch(x){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a/b);break;
            case 4:
            System.out.println(a*b);break;
            default:
            System.out.println("invalid");
        }
    }
    
}