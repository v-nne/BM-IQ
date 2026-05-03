package console;

import console.BmiCalculator;
import console.MyMethods;
import java.util.Scanner;

public class WaterIntakeCalculator {
    public static void run(Scanner sc, String username){
        double weight;
        int activityLevel;
        int repeat = 0;
        System.out.println("======= Water Intake Calculator =======");

        do{
            int unitChoice = BmiCalculator.getUnitChoice(sc);
            System.out.println("\033[H\033[2J");
            System.out.flush();

            weight=(unitChoice == 1)? MyMethods.getValidInput(sc, "Enter your weight in kilogram: ", 10, 600)
                    : MyMethods.getValidInput(sc, "Enter your weight in pounds", 22, 1300);
            System.out.println("Enter your activity level:\n1. No activity\n2. Lightly Active\n3. Very Active");
            activityLevel = MyMethods.getValidIntInput(sc, "Enter 1, 2 or 3: ", 1, 3);
            double water = calculateWaterIntake(unitChoice, weight, activityLevel);
            System.out.println("--------------------------");
            System.out.println("  Water Intake: " + String.format("%.1f", water) + (unitChoice == 1 ? " l" : " gal"));
            System.out.println("--------------------------");

            repeat = MyMethods.askToRepeat(sc);
            if (repeat == 2) break;
            System.out.println();

        }while(repeat == 1);

    }



    public static double calculateWaterIntake(int unitChoice, double weight, int activityLevel){
        double totalWaterIntake;

        if(unitChoice ==1){
            totalWaterIntake = weight * 0.033;
            if(activityLevel == 2) totalWaterIntake += 0.5;
            if(activityLevel == 3) totalWaterIntake += 1.0;
        } else {
            totalWaterIntake = ((weight / 2.205) * 0.033) / 3.785;//converts to gal
            if (activityLevel == 2) totalWaterIntake += 0.5 / 3.785;
            if (activityLevel == 3) totalWaterIntake += 1.0 / 3.785;
        }

        return totalWaterIntake;

    }
}
