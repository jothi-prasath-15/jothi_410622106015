package jothi;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the total number of elements: ");
			int n = scanner.nextInt();

			int[] numbers = new int[n];
			System.out.println("Enter " + n + " numbers:");

			for (int i = 0; i < n; i++) {
			    numbers[i] = scanner.nextInt();
			}

			double average = calculateAverage(numbers);
			System.out.println("The average is: " + average);
		}
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
