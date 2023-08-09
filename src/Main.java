import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;
        int numDigits = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sum += power(digit, numDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }

    // Function to calculate the power of a number
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
