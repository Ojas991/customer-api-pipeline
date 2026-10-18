package com.example.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static String checkGuess(int secretNumber, int guess) {
        if (guess < secretNumber) {
            return "Too low!";
        }
        if (guess > secretNumber) {
            return "Too high!";
        }
        return "Correct! You win!";
    }

    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100) + 1;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I'm thinking of a number from 1 to 100.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter your guess: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a whole number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Choose a number between 1 and 100.");
                    continue;
                }

                attempts++;
                String result = checkGuess(secretNumber, guess);
                System.out.println(result);

                if (guess == secretNumber) {
                    System.out.println("Attempts: " + attempts);
                    break;
                }
            }
        }
    }
}
