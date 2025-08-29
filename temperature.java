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
        float Fahrenheit = getIntInput("Enter temperature in Fahrenheit: "); // I get the input and assign it as a float
        float Celsius = (Fahrenheit - 32) * 5/9; // Calculate celsius with the formula
        System.out.print(Fahrenheit +"°F is "+ Math.round(Celsius * 100.0) / 100.0+"°C"); // I used AI to found out how to round the number to 2 decimal places
    }
}