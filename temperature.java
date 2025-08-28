import java.util.Scanner;

public class temperature {
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
        float Grade1 = getIntInput("Enter first test score: "); // I get the input and 
        float Grade2 = getIntInput("Enter Second test score: "); // I get the input and 
        float Grade3 = getIntInput("Enter Third test score: "); // I get the input and 

        float average = (Grade1 + Grade2 + Grade3) / 3;
        System.out.print("Your average is: "+ Math.round(average * 100.00) / 100.00); // Outputs average and I used AI to help with rounding and formatting
    }
}