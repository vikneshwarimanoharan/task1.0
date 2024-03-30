import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-9): ");
        int number = scanner.nextInt();
        scanner.close();

        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (number >= 0 && number <= 9) {
            System.out.println("Number name(s): " + numberNames[number]);
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 9.");
        }
    }
}
