package Day3;

import java.util.Scanner;

public class First {
    public static void main(String[]args){
        int arr[]={1,2,1,1,5,5,6,7,8,1,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int value = sc.nextInt();

        System.out.println("the number of occurance for "+value+" is "+find(arr,value));


    }
    public static int find(int[] arr, int value){
        int i, count=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println(arr[i]+"=="+ value);
                count=count+1;
            }
            else{
                System.out.println(arr[i]+"!="+ value);
            }
        }
        return count;
    }

}
