package Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        //String s = sc.nextLine();
        StringBuffer sb = new StringBuffer("");
        sb.append(sc.nextLine());


            if(sb.toString().equals(sb.reverse().toString())){
                System.out.println("Given string is a palindrome");
            } else{
                System.out.println("Given string is not a palindrome");
            }
        }

}
