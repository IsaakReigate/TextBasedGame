package textbasedgame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TextBasedGame {

    public static Scanner scan = new Scanner(System.in);

    public static void introduction() {
        System.out.println("Welcome to my text-based game:");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
        }

        System.out.println("Do you have a save-password?");
        String savePassword = scan.next();
        if (savePassword.equalsIgnoreCase("PLACE HOLDER FOR PASSWORD")) {
            //returns save scenario
        } else {
            System.out.println("Proceeding to game...\n\n\n");
        }
    }

    public static void main(String[] args) {
        introduction();

        System.out.println("You've done it.\nWe're here.");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }

        System.out.println("There's three ways in.\nI'll let you take the lead this time.");

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (Exception e) {
        }

        System.out.println("There's the window above us, the front door and the roof.");
        System.out.println("How do you wanna do this?");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (Exception e) {
        }
        System.out.println("1.Window\n2.Front Door\n3.Roof\n");
        int windowFrontRoof = scan.nextInt();

        switch (windowFrontRoof) {
            case (1):
                System.out.println("\nThe door, got it.");
                
            case (2):
                System.out.println("");
            case (3):
                System.out.println("");
        }

    }

}
