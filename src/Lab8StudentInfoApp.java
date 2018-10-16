
import java.util.Scanner;

public class Lab8StudentInfoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "Bre", "Joe", "Lauren", "AJ", "Mike", "Alex", "Jordan", "Sarah", "Andrea", "Spencer" };
		String[] hometown = { "Saginaw, MI", "Kalamazoo, MI", "Trenton, MI", "Detroit, MI", "Bloomfield, MI",
				"Detroit, MI", "Fenton, MI", "Toledo, OH", "Novi, MI", "Royal Oak, MI" };
		String[] favFood = { "Chinese", "Pizza", "Tacos", "Spaghetti", "Cereal", "Pancakes", "Grilled Cheese", "Steak",
				"Tacos", "Tacos" };

		String userKnowMore = "no";
		do {
			
			try {

				System.out
						.println("Welcome to our java class. Which Student would you like to learn more about? (1-10)");

				int userInput = sc.nextInt();

				System.out.println(
						"Student " + userInput + " is " + names[userInput - 1] + ". What would you like to know about "
								+ names[userInput - 1] + " (enter 1 for hometown or 2 for favorite food): ");
				int userInput2 = sc.nextInt();

				if (userInput2 == 1) {
					System.out.println(names[userInput - 1] + " is from " + hometown[userInput - 1]
							+ ". Would you like to know more? (enter \"yes\" or \"no\"):");
					userKnowMore = sc.next();
				} else if (userInput2 == 2) {
					System.out.println(names[userInput - 1] + "'s favorite food is " + favFood[userInput - 1]
							+ ". Would you like to know more? (enter \"yes\" or \"no\"):");
					userKnowMore = sc.next();

				} else {
					System.out.println("That data does not exist.");
				}

			} catch (IndexOutOfBoundsException ex) {
				System.out.println("That student does not exist.");

			}

		} while (userKnowMore.equals("yes"));
		System.out.println("Thanks!");
		sc.close();
	}
}
