package Assignments.Day1;
import java.util.*;
public class Cab {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String pickup = "";
        String drop = "";
        while (pickup.length() == 0) {
            System.out.println("Enter the pick up location");
            pickup = sc.nextLine();
        }

        while (drop.length() == 0) {
            System.out.println("Enter the drop location");
            drop = sc.nextLine();
        }
        Cab cab = new Cab();
        cab.display(pickup, drop);
        double fare = cab.calculatefare(pickup, drop);

    }

    public void display(String pickup, String drop) {
        System.out.println("pickup location is: "+pickup);
        System.out.println("drop location is: "+drop);
        System.out.println("Calculated fare is:");

    }

    public double calculatefare(String pickup, String drop) {

        return 0;
    }


}
