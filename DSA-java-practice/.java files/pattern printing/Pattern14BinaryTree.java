import java.util.Scanner;
public class Pattern14BinaryTree {
       public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int main_flag=1,flag;
        for(int i=1;i<=n;i++){
            flag=main_flag;
            for(int j=1;j<=i;j++){
                System.out.print(flag);
                if(flag==1)
                    flag=0;
                else
                    flag=1;

            }
            System.out.println();
            if(main_flag==0)
                main_flag=1;
            else
                main_flag=0;

        }
    
    }

}
