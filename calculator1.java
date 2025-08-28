import java.util.Scanner;

public class calculator1 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        float Grade1 = getIntInput("Enter first test score: "); // I get the input for first test score as a float
        float Grade2 = getIntInput("Enter Second test score: "); // I get the input for second test score as a float
        float Grade3 = getIntInput("Enter Third test score: "); // I get the input for third test score as a float 

        float average = (Grade1 + Grade2 + Grade3) / 3; // calculates average as float
        System.out.print("Your average is: "+ Math.round(average * 100.00) / 100.00 +"\n"); // Outputs average and I used AI to help with rounding and formatting with \n    
        
        if (average >= 90 & average <= 100){ // I used AI to find the syntax for the if statement
            System.out.print("Your letter grade is: A"); // prints grade letter A
        }
        else if (average >= 80 & average <=89) { // Used AI to find out it is typed as "else if" as I previously knew it as elif in python
            System.out.print("Your letter grade is: B"); 
        }
        else if (average >= 70 & average <=79) { // Code keeps checking specific requirements for the letter grades
            System.out.print("Your letter grade is: C");
        }
        else if (average >= 60 & average <=69) {
            System.out.print("Your letter grade is: D");
        }
        else if (average < 60) {
            System.out.print("Your letter grade is: F");
        }
    }
}