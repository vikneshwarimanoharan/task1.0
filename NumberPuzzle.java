import java.util.Scanner;

public class NumberPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit integer: ");
        int number = scanner.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Invalid number");
        } else {
            int result;
            if (number > 50) {
                int firstDigit = number / 10;
                int secondDigit = number % 10;
                result = Math.abs(firstDigit - secondDigit);
            } else {
                int reversedNumber = (number % 10) * 10 + (number / 10);
                int firstDigit = reversedNumber / 10;
                int secondDigit = reversedNumber % 10;
                result = Math.abs(firstDigit - secondDigit);
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
