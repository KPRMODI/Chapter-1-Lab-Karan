import java.util.Scanner;

public class quiz {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
            System.out.print(prompt);
            int input = scanner.nextInt();
            scanner.nextLine(); // Clear the newline left in the buffer (AI helped me with this code)
            return input; // AI added this code to help with error
        
    }
    
    public static void main(String[] args) {
        String Answer1 = "Queen"; //Answer questions
        int Answer2 = 64;
        String Answer3 = "King";
        int Final_Score = 0; // score tracker

        String Question1 = getInput("What is the most powerful piece in chess: ");
        if (Question1.equals(Answer1)) { //Used AI to find out syntax for .equals()
            System.out.println("Correct");
            Final_Score += 1;
        } 
        else {
            System.out.println("Incorrect");
        }

        int Question2 = getIntInput("How many total board pieces are there on the chess board?: ");
        if (Question2 == Answer2) { // use == since its an int
            System.out.println("Correct");
            Final_Score += 1;
        } 
        else {
            System.out.println("Incorrect");
        }

        String Question3 = getInput("What is the piece you protect the most?: "); //For the third question I had a bug so I had to use AI to help bug fix it for me
        if (Question3.equals(Answer3)) {
            System.out.println("Correct");
            Final_Score += 1;
        }
        else{
            System.out.println("incorrect");
        }
        System.out.println("Final Score: " + Final_Score + "/3");
    }
 }