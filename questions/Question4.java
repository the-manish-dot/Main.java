import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, original, digit, sum = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        original = num;

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        input.close();
    }
}