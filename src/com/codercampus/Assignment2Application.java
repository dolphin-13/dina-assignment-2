package com.codercampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		int userInput = 0;
		int guessCtr = 0;
		int number = generateRandomNumber();

		Scanner s = new Scanner(System.in);

		while (guessCtr < 6) {
			System.out.print("Pick a number between 1 and 100 ");
			userInput = s.nextInt();
			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again ");
			} else if (userInput == number) {
				System.out.println("You Win!");
				break;
				//System.exit(0);
			} else if (userInput < number) {
				System.out.println("Please pick a higher number ");
				guessCtr++;
			} else {
				System.out.println("Please pick a lower number ");
				guessCtr++;
			}
			if (guessCtr == 5) {
				System.out.println("You lose!");
				System.out.println("The number to guess was: " + number);
				break;
			}
		}
		s.close();
	}

	private static int generateRandomNumber() {
		Random random = new Random();
		int genNumber = random.nextInt(100) + 1;
		return genNumber;
	}
}
