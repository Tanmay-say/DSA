import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter something
        System.out.print("Enter something: ");

        // Read the input from the user
        String input = scanner.nextLine();

        // Display the input back to the user
        System.out.println("You entered: " + input);

        // Close the scanner
        scanner.close();
    }
}
