package Day7;

public class Recursive {
     static int factorial(int x){
        if(x==1){
            return x*1;
        } else{
            return x*factorial(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
