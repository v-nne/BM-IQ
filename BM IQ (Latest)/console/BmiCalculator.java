package console;


import java.util.Scanner;
import java.util.Locale;                             
public class BmiCalculator{
    public static void run(Scanner sc, String username){
        
        sc.useLocale(Locale.US);          
		System.out.print("\033[H\033[2J");
		System.out.flush();


        int repeat=0;

        do{
            int unitChoice = getUnitChoice(sc);
			System.out.print("\033[H\033[2J");
			System.out.flush();	
            double weight=(unitChoice == 1)? MyMethods.getValidInput(sc, "Enter your weight in kilogram: ", 10, 600)
                        : MyMethods.getValidInput(sc, "Enter your weight in pounds", 22, 1300);
            double height = (unitChoice == 1) ? MyMethods.getValidInput(sc, "Enter your height in meters: ", 0.5, 2.5)
                        :MyMethods.getValidInput(sc, "Enter your height in inches", 20, 100);
            double bmi = calculateBMI(unitChoice, weight, height);
            System.out.println("Your BMI is "+ bmi);
            System.out.println(getCategory(bmi));
            repeat = MyMethods.askToRepeat(sc);
            if (repeat == 2) break;

        }while (repeat == 1);
    }



    public static int getUnitChoice(Scanner sc){
        int choice;

        while(true){
            System.out.println("Select a preferred unit:  \n"
                + "1. Metric (kg m)\n"
                + "2 Imperial (lbs, in)\n"
                + "Please select either option 1 or option 2");

            if(sc.hasNextInt()){
                choice = sc.nextInt();               
                if (choice == 1 || choice == 2){
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter either 1 or 2");
                }                                   
            } else {                                 
                System.out.println("Invalid input. Please enter a number(1 or 2)");
                sc.next();
            }
        }
        return choice;
    }




    public static double calculateBMI(int unitChoice, double weight, double height){
        double totalBMI;

        if(unitChoice ==1){
            totalBMI = weight /(height*height);
        } else {
            totalBMI = (703 * weight)/ (height*height);  
        }

        return totalBMI;
    }
    public static String getCategory(double bmi){
        if(bmi < 18.5)
            {return "Underweight";}

        else if(bmi < 25.0){
            return "Normal weight";}
        else if(bmi < 30.0){
            return "Overweight";}
        else{
            return "Obese";}
    }
}