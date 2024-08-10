import java.util.*;
public class calender {
    public static void main(String[] args){
        Map<Integer,String> M=new HashMap<>();
        M.put(1,"Monday");
        M.put(2,"Tuesday");
        M.put(3,"Wednesday");
        M.put(4,"Thursday");
        M.put(5,"Friday");
        M.put(6,"Saturday");
        M.put(7,"Sunday");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if (num<=7)
        System.out.println(num+" indicates "+M.get(num) );
        else{
            int n=num%7;
            System.out.println(num+" indicates "+M.get(n));
        }


    }
}
