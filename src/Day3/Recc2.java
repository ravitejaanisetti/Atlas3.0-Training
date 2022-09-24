package Day3;

public class Recc2 {

    public static void main(String args []){
        System.out.println("Sum of digits 1234 is "+sumDigits(1234));
    }
    public static int sumDigits (int n){
        if (n < 10) {
            return n;
        }
        else{
            return (n%10)+sumDigits(n/10);
        }
        }

    }

