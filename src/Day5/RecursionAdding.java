package Day5;

import java.util.concurrent.Flow;

public class RecursionAdding {
    public static int recadd(int a, int b){
        if(b==0)
            return a;
        int sum=a^b;
        int carry=(a&b)<<1;
        return recadd(sum,carry);
    }
    public static int recsub(int a, int b){
        int x=~b;// complementing change 1 to 0 and 0 to 1
        int m=recadd(a,x);
        return m+1;
    }
    public static void main(String[] args) {
        System.out.println("Addition of two numbers is "+recadd(5,6));
        System.out.println("Substraction of two numbers is "+recsub(11,6));
    }
}
