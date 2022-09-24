package Day2;

import java.util.Scanner;

public class CostClass {
    static  int totalCost(int x) {
        return x;
    }
    static  int totalCost(int x,int y) {
        return x+y;
    }

}
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "Hello";

        System.out.println("please enter the number of items");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<num;i++){
            System.out.println("please enter the amount");
            int price=sc.nextInt();
            sum+=price;
        }
        if(sum<=500) {
            int y=150;
            int total  = CostClass.totalCost(sum, y);
            System.out.println(total);
        }else {
            int total = CostClass.totalCost(sum);
            System.out.println(total);
        }

    }
}
