import java.util.Scanner;

public class Main {

    public static boolean palindrome(String input) {
        for (int i= 0; i< input.length() / 2; i++){
            // - 1 since loop is n - 1 and length is n.
            if (input.charAt(i) != input.charAt(input.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("Welcome to the palindrome program! Here I can tell you if your word is a palindrome");
        boolean loop = true;
        while(loop){
            System.out.println("What word would you like to input?");
            // handles incorrect input and case sensitivity
            while (true) {
                userInput = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            
                if (userInput.contains(" ")) {
                    System.out.println("Only one word accepted, try again");
                }

                if (userInput.trim().isEmpty()){
                    System.out.println("Please input a word...");
                }

                else{
                    break;
                }
            }

            System.out.println("Is the word: " + userInput + " a palindrome?");
            System.out.println(palindrome(userInput));

            System.out.println("Would you like to try again? Press any key to continue or type in \"no\" to exit.");
            String continueInput = scanner.nextLine().toLowerCase();

            if (continueInput.equals("no")) {
                loop = false;
            }
            
        }
        scanner.close();
        System.out.println("Goodbye!");
    }

}