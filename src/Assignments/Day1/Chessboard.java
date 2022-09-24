package Assignments.Day1;


import java.util.Scanner;

public class Chessboard {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the desired matrix number of chess board: ");
        int n = sc.nextInt();
        //int m = 8;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for(int j=1; j<=n; j++){
                if((i+j)%2 == 0){
                    System.out.print("|W|");
                } else{
                    System.out.print("|B|");
                }
            }
            System.out.println();
        }
        System.out.println("Desired matrix "+n+"x"+n+" chess board is printed");

    }
}
