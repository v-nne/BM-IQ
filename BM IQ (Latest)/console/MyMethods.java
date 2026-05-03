package console;

import java.util.Scanner;

public class MyMethods {
    public static double getValidInput(Scanner sc, String prompt, double min, double max){
        double value;
        while(true){
            System.out.println(prompt);

            if (sc.hasNextDouble()){
                value = sc.nextDouble();
                if (value >= min && value <= max){
                    break;
                }else{
                    System.out.printf("Please enter a value between %.1f and %.1f.\n", min, max);
                }
            }else {
                System.out.println("Invalid input. Please enter a value");
                sc.next();
            }
        }
        return value;
    }


    public static int askToRepeat(Scanner sc){
        System.out.println("-----------------------------");
        System.out.println("1. Calculate Again");
        System.out.println("2. Return to main menu");
        System.out.println("-----------------------------");
        return getValidIntInput(sc, "", 1, 2);
    }
    public static int getValidIntInput(Scanner sc, String prompt, int min, int max){
        int value;
        while(true){
            System.out.println(prompt);

            if (sc.hasNextInt()){
                value = sc.nextInt();
                if (value >= min && value <= max){
                    break;
                }else{
                    System.out.printf("Please enter a value between %.1f and %.1f.\n", min, max);
                }
            }else {
                System.out.println("Invalid input. Please enter a value");
                sc.next();
            }
        }
        return value;
    }
}
