package Class14;

import java.util.Scanner;

public class Class14_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Devx restaurant\n");
        System.out.println("Please choose one of this following options");
        System.out.println("1. Appetizers");
        System.out.println("2. Main course");


        int firstOption = sc.nextInt();
        if (firstOption == 1) {
            System.out.println("1. Spring rolls");
            System.out.println("2. Egg rolls");

            int appetizerChoice = sc.nextInt();
            if (appetizerChoice == 1) {
                System.out.println("Your Spring Rolls are being prepared");
            } else if (appetizerChoice == 2) {
                System.out.println("Your Egg Rolls are being prepared");

            } else {
                System.out.println("Invalid Input, try again");
            }


        } else if(firstOption == 2) {
            System.out.println("1. Chicken Curry");
            System.out.println("2. New York Rib eye");

            int maineCourseChoise = sc.nextInt();

            if (maineCourseChoise == 1) {
                System.out.println("Your chicken curry is being prepared bu our Chef");

            } else if (maineCourseChoise == 2) {
                System.out.println("Your New York rib eye is being grilled by our Chef");

            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Wrong Choice, we have only appetizers and maincours");
        }
    }
}