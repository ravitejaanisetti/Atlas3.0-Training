package Assignments.Day1;

import java.util.Scanner;

public class GST {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        double Amount = sc.nextInt();
        double GST = 0.18 * Amount;
        System.out.println("GST on Given amount is "+GST);

    }
}
