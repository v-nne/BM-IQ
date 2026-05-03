package console;

import java.util.Scanner;

public class IdealWeightCalculator {
    public static void run(Scanner sc, String username){
        String gender;
        double height;
        int repeat;
        System.out.print("\033[H\033[2J");
        System.out.flush();


        System.out.println("======= Ideal Weight Calculator =======");

        do{
            int unitChoice = BmiCalculator.getUnitChoice(sc);
            System.out.print("\033[H\033[2J");
            System.out.flush();

            height = (unitChoice == 1) ? MyMethods.getValidInput(sc, "Enter your height in meters: ", 0.5, 2.5)
                    : MyMethods.getValidInput(sc, "Enter your height in inches: ", 20, 100);

            System.out.println("Enter your gender (M/F): ");
            gender = sc.next().toUpperCase();
            while(!gender.equals("M") && !gender.equals("F")){
                System.out.println("Invalid. Please enter 'M' or 'F': ");
                gender = sc.next().toUpperCase();
            }

            double idealWeight = calculateIdealWeight(unitChoice, height, gender);

            System.out.println("--------------------------");
            System.out.println("  Ideal Weight: " + String.format("%.1f", idealWeight) + (unitChoice == 1 ? " kg" : " lbs"));
            System.out.println("--------------------------");




            repeat = MyMethods.askToRepeat(sc);
            if (repeat == 2) break;


        }while(repeat == 1);
    }

    public static double calculateIdealWeight(int unitChoice, double height, String gender){//divine formula
        double idealWeight;

        if(unitChoice == 1){
            double heightInInches = height * 100 / 2.54;//conversion to inches
            if(gender.equals("M")){
                idealWeight = 50 + 2.3 * ((heightInInches) - 60);
            } else {
                idealWeight = 45.5 + 2.3 * ((heightInInches) - 60);
            }
        } else {
            if(gender.equals("M")){// this is the normal unit calculation
                idealWeight = 50 + 2.3 * (height - 60);
            } else {
                idealWeight = 45.5 + 2.3 * (height - 60);
            }
            idealWeight = idealWeight * 2.205;
        }

        return idealWeight;
    }
}