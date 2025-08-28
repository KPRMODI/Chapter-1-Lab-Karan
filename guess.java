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
        boolean guessed = false;

        while (guessed != true) { 
            int guesser = getIntInput("Enter Secret Number: ");
            if (guesser == Secret_Number) {
                System.out.print("You guessed right!");
                guessed = true;
            }
            else{
                if (guesser < Secret_Number){
                    System.out.print("Too low! \n");
                }
                else{
                    System.out.print("Too high! \n");
                }
                System.out.print("Incorrect, try again! \n");
            }
        }
        }
    }
