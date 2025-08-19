//arraylist operations
import java.util.ArrayList;
public class ArrayListOpeartions {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(6);   
        arr.add(0,10);//input
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.get(0));
        arr.set(0,50);//modify
        System.out.println(arr.get(0));
        arr.add(90);//adds at last even though size exceeded
        System.out.println(arr);
        System.out.println(arr.size());
        //size was given 6 but it extends itself to 7 also
        



           
    }
}
