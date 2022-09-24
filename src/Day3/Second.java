package Day3;

import java.util.Scanner;

public class Second {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int value = sc.nextInt();

        System.out.println("the number of occurance for "+value+" is "+cube(arr,value));


    }
    public static int cube(int arr [], int value){
        int i, count=0;
        if(i!=0){
            System.out.println("Cube of given value is "+value*value*value);
        }
        return i;
    }
}
