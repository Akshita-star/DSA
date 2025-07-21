import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int grade=scan.nextInt();
        if(grade>=81&&grade<=100){
            System.out.println("very good");
        }else if(grade>=61 &&grade<=80){
            System.out.println("good");
        }else if(grade>=41 &&grade<=60){
            System.out.println("average");
        }else{
            System.out.println("fail");
        }
    }
    
}
