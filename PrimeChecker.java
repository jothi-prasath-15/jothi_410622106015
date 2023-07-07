package jothi;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			if (isPrime(number)) {
			    System.out.println(number + " is a prime number.");
			} else {
			    System.out.println(number + " is not a prime number.");
			}
		}
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible, not prime
            }
        }

        return true; // Number is prime
    }
}
