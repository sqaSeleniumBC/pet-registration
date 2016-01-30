/**
 * File Name: PetRegistration.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 27, 2016
 */
package com.sqa.jf.pet.registration;

import java.util.*;

import com.sqa.jf.util.helper.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0 <br>
 *        <br>
 *        Create an application which registered a local pet into the pet data
 *        system. The application should ask how many pets they would like to
 *        register. For each pet they should be asked what type (dog, cat, fish,
 *        bird, reptile, or horse). If the type is not a valid registered pet it
 *        should let the user know. If it is, it should echo the price to
 *        register the pet for 1 year and confirm price with user. (Use a switch
 *        statement). If the user decides to follow through with the
 *        registration process, they should than enter the pets Name (String),
 *        Address(String), Age(int), Whether they have a rabies shot (boolean),
 *        Yearly Pet Fees (double), and Gender (char). The number of pets that
 *        will be entered into the array should be determined at the start of
 *        the application. Upon exiting the registered pet details should be
 *        echoed to the user. Good Luck!
 */
public class PetRegistration {

	// Declare class static variables
	private static String[] types;

	private static String[] names;

	private static String[] addresses;

	private static int[] ages;

	private static double[] petFees;

	private static boolean[] hasRabies;

	private static char[] genders;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Register Pets based on user supplied number
		registerPets(RequestInput.getInt("How many pets would you like to register? "));
		// Display registered pets to the user
		displayPets();
		// Exit the system
		exitPetRegApp();
	}

	/**
	 *
	 */
	private static void displayPets() {
		// Iterate types array for Displaying of Pets
		if (types != null) {
			// Iterate through types array and display Strings
			for (int i = 0; i < types.length; i++) {
				// Display Animal
				System.out.println("Animal (" + types[i] + ") - " + names[i]);
				System.out.println("\tAge: " + ages[i]);
				System.out.println("\tGender: " + genders[i]);
				System.out.println("\tFees Per Year:" + petFees[i]);
				System.out.println("\tHas Rabies Shot: " + hasRabies[i]);
				System.out.println("\tAddress: " + addresses[i]);
			}
			// else no items in types array
		} else {
			// Let user know they have not registerd any pets
			System.out.println("You have not registered any animals :(");
		}
	}

	/**
	 * Exit the Pet Registration Application
	 */
	private static void exitPetRegApp() {
		// Close the Scanner object
		scanner.close();
		// Give a farewell message to the user
		System.out.println("Thank you for using the Register Pets Application!\n Good Bye.");
	}

	/**
	 * Method to register an animal into the system
	 *
	 * @return
	 */
	private static void registerAnimal(String type, double regPrice) {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a " + type + " it is $" + regPrice + " a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the " + type + "? ");
		// If the user has requested to register the pet
		if (willRegister == true) {
			// Add the type of animal being registered to the types array
			types = RequestInput.addStringElement(types, type);
			// else they did not want to register their pet
		} else {
			System.out.println("Sorry to hear you do not want to register your " + type);
		}
	}

	/**
	 * @param numPets
	 */
	private static void registerPets(int numPets) {
		// Register number of pets chosen
		for (int i = 0; i < numPets; i++) {
			// Register Pet
			validatePetRegistration();
		}
		requestAnimalDetails();
	}

	/**
	 * Get the aniamls details for names, addresses, ages, petFees, hasRabies,
	 * and genders in a contextual order
	 */
	private static void requestAnimalDetails() {
		// Initialize arrays
		names = new String[types.length];
		addresses = new String[types.length];
		ages = new int[types.length];
		genders = new char[types.length];
		hasRabies = new boolean[types.length];
		petFees = new double[types.length];
		// Request details for all animal inside the types array
		for (int i = 0; i < types.length; i++) {
			// Let the user know what they will be entering into the system
			System.out.println(
					"It seems you are registering a " + types[i] + ", could you please provide the following details:");
			// Capture the name of the animal inside of the names array
			names[i] = RequestInput.getString("Please provide the " + types[i].toLowerCase() + "'s name:");
			genders[i] = RequestInput.getChar("What is the animals gender:", 'M', 'F', 'f', 'm');
			ages[i] = RequestInput.getInt("How old is " + names[i] + "?");
			petFees[i] = RequestInput.getDouble("How much does " + names[i] + " cost you per year?");
			hasRabies[i] =
					RequestInput.getBoolean("Have you gotten your " + types[i] + "'s rabies shot this year yet?");
			addresses[i] = RequestInput.getString("Finally, can you provide a valid mailing address?");
		}
	}

	/**
	 * Method which iterates through loops setting pet values.
	 */
	private static void validatePetRegistration() {
		// Setup variable to create continuous loop based on invalid pet type
		boolean hasInvalidPet = true;
		// Loop until valid pet type is entered
		while (hasInvalidPet) {
			// Request for a pet type
			String type = RequestInput.getString("What type of pet do you have? ");
			switch (type.toLowerCase()) {
			case "dog":
				registerAnimal(type, 120.00);
				// willRegister = registerDog();
				hasInvalidPet = false;
				break;
			case "cat":
				registerAnimal(type, 110.00);
				hasInvalidPet = false;
				break;
			case "fish":
				registerAnimal(type, 5.00);
				hasInvalidPet = false;
				break;
			case "horse":
				registerAnimal(type, 550.00);
				hasInvalidPet = false;
				break;
			case "reptile":
				registerAnimal(type, 30.00);
				hasInvalidPet = false;
				break;
			case "bird":
				registerAnimal(type, 20.00);
				hasInvalidPet = false;
				break;
			default:
				System.out.println("Invalid Animal.");
				break;
			}
		}
	}
}