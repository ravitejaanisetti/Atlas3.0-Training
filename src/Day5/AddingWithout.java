package Day5;

public class AddingWithout {
    //addition without a+sign
    //without
    public static int addIterative(int a, int b){
        while(b!=0){
            int carry=(a&b);//from equation
            System.out.println("value of b before shift is "+b);
            a=a^b; //sum of 2 using XDR
            b=carry<<1; //left shift
            System.out.println("value of b is "+b);
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println("a + b is "+addIterative(5,6));
    }
}
