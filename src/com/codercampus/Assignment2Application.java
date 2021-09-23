package com.codercampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		int userInput = 0;
		int shot = 1;
		int number = randomNumber();

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Pick a number between 1 and 100 ");
			if (s.hasNextInt()) {
				userInput = s.nextInt();
				if (userInput == number) {
					System.out.println("You Win!");
					break;
				} else if (userInput < number) {
					System.out.println("Please pick a higher number ");
				} else {
					System.out.println("Please pick a lower number ");
				}
				if (shot == 5) {
					System.out.println("You lose!");
					System.out.println("The number to guess was: " + number);
					break;
				}
				shot++;
			}
		}
		s.close();
	}

	private static int randomNumber() {
		Random random = new Random();
		int genNumber = random.nextInt(100) + 1;
		return genNumber;
	}
}
