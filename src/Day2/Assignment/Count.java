package Day2.Assignment;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the digit to find the occurrence");
        int m = sc.nextInt();
        int count =0;
         while (n>0){
             int rem = n%10;
             if(rem==m)
                 count++;
                 n/=10;
         }
        System.out.println("Occurrences of "+m+" is "+count);
    }
}
