import java.util.*;
public class calender_using_map {
    public static void main(String[] args){
        Map<Integer,String> M=new HashMap<>();
        M.put(1,"Monday");
        M.put(2,"Tuesday");
        M.put(3,"Wednesday");
        M.put(4,"Thursday");
        M.put(5,"Friday");
        M.put(6,"Saturday");
        M.put(0,"Sunday");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter today \n 1:Monday \n 2:Tuesday \n 3:Wednesday \n 4:Thursday \n 5:Friday \n 6:Saturday \n 0:Sunday ");
        int today=sc.nextInt();
        System.out.println("Enter number");
        int num=sc.nextInt();
        int n=(today+num)%7;
        System.out.println("From today ("+M.get(today)+") the "+num+"th day is "+M.get(n));
        


    }
}