import java.util.Scanner;

public class guess {
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
        int Secret_Number = 3;
        boolean guessed = false; // its false so when the user gets it right the variable turns true

        while (guessed != true) {  // while guessed isint true run this
            int guesser = getIntInput("Enter Secret Number: ");
            if (guesser == Secret_Number) { // checks if the guess is equal
                System.out.print("You guessed right!");
                guessed = true; // ends while true
            }
            else{
                if (guesser < Secret_Number){
                    System.out.print("Too low! \n"); // if the guess is too low print this
                }
                else{
                    System.out.print("Too high! \n"); // If the guess is too high print this
                }
                System.out.print("Incorrect, try again! \n"); // Try again message 
            }
        }
    }
}