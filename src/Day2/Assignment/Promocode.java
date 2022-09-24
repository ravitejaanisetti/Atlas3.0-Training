package Day2.Assignment;

import java.util.Scanner;

public class Promocode {
    public static void main(String[]args){
        System.out.println("Promocodes Available:\nabcd\nefgh\nijkl");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the promo code:");
        String promocode = sc.nextLine();

        //String pc1 = abcd;

        double abcd = 0.10*amount;
        double efgh = 0.20*amount;
        double ijkl = 0.30*amount;

        switch (promocode){
            case "abcd":
            System.out.println("Promo code applied");
                System.out.println("Got "+abcd+" % off");
                System.out.println("Amount After Discount: "+(amount-abcd));

            break;
            case "efgh":
                System.out.println("Promo code applied");
                System.out.println("Got "+efgh+" % off");
                System.out.println("Amount After Discount: "+(amount-efgh));
                break;
            case "ijkl":
                System.out.println("Promo code applied");
                System.out.println("Got "+ijkl+" % off");
                System.out.println("Amount After Discount: "+(amount-ijkl));
                break;
            default:
                System.out.println("Invalid Promo code! please enter a valid promo code");

        }
    }

}





