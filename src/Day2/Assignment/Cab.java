package Day2.Assignment;


import java.util.Scanner;

public class Cab {
    public static double getFare(String source, String destination, int distance, int duration, String cabType) {
        int time = duration / 60;
        double farePrice = 0.00;
        if (cabType.equalsIgnoreCase("mini")) {
            farePrice = (distance * 13) + (time * 2);
            System.out.println("Calculated Fare is Rs." + farePrice);
        } else if (cabType.equalsIgnoreCase("sedan")) {
            farePrice  = (distance * 16) + (time * 2.5);
            System.out.println("Calculated Fare is Rs." + farePrice);
        } else if (cabType.equalsIgnoreCase("suv")) {
            farePrice = (distance * 20) + (time * 3);
            System.out.println("Calculated Fare is Rs." + farePrice);
        } else {
            System.out.println("Please Enter a valid CabType:");
        }
        return farePrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pickup Location:");
        String source = sc.nextLine();
        System.out.println("Enter the Drop Location:");
        String destination = sc.nextLine();
        System.out.println("Enter the distance:");
        int distance = sc.nextInt();
        System.out.println("Enter the Duration:");
        int duration = sc.nextInt();
        int time = duration/60;
        sc.nextLine();
        System.out.println("Available Cab types: \nMini(Rs.13/km & Rs.2/min)\nSedan(Rs.16/km & 2.5/min)\nSUV(Rs.20/km & 3/min");
        System.out.println("Select cab type:");
        String cabType = sc.nextLine();

        while (source.length()!=0 && destination.length()!=0 && distance!=0 && duration != 0) {
            double fare = getFare(source, destination, distance, duration, cabType);
            if (fare > 0) {
                System.out.println("Calculated fare for "+cabType+" is " + fare);
                break;
            }
        }

    }
}
