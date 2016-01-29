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
	private static int numPets;

	private static String[] types;

	private static String[] names;

	private static String[] addresses;

	private static int[] ages;

	private static double[] petFees;

	private static boolean hasRabies;

	private static char[] genders;

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set the number of Pets based on
		numPets = RequestInput.getInt("How many pets would you like to register? ");
		// Register number of pets chosen
		registerPets();
		// Display registered pets to the user
		displayPets();
		// Exit the system
		exitPetRegApp();
	}

	/**
	 *
	 */
	private static void displayPets() {
		// TODO Implement Displaying of Pets
	}

	/**
	 *
	 */
	private static void exitPetRegApp() {
		// Close the Scanner object
		scanner.close();
		// Give a farewell message to the user
		System.out.println("Thank you for using the Register Pets Application!\n Good Bye.");
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerBird() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a bird it is $60 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the bird? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerCat() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a cat it is $105 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the cat? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerDog() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a dog it is $120 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerFish() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a fish it is $10 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the fish? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerHorse() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a dog it is $540 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the horse? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/**
	 * Method which iterates through loops setting pet values.
	 */
	private static void registerPets() {
		// Setup variable to create continuous loop based on invalid pet type
		boolean hasInvalidPet = true;
		// Variable to hold if pet will be registered
		boolean willRegister;
		// Loop until valid pet type is entered
		while (hasInvalidPet) {
			// Request for a pet type
			String type = RequestInput.getString("What type of pet do you have? ");
			switch (type) {
			case "dog":
				willRegister = registerDog();
				hasInvalidPet = false;
				break;
			case "cat":
				System.out.println("Add a cat.");
				willRegister = registerCat();
				hasInvalidPet = false;
				break;
			case "fish":
				System.out.println("Add a fish.");
				willRegister = registerFish();
				hasInvalidPet = false;
				break;
			case "horse":
				System.out.println("Add a horse.");
				willRegister = registerHorse();
				hasInvalidPet = false;
				break;
			case "reptile":
				System.out.println("Add a reptile.");
				willRegister = registerReptile();
				hasInvalidPet = false;
				break;
			case "bird":
				System.out.println("Add a bird.");
				willRegister = registerBird();
				hasInvalidPet = false;
				break;
			default:
				System.out.println("Invalid Animal.");
				break;
			}
		}
	}

	/**
	 * Method to register a dog into the system
	 *
	 * @return
	 */
	private static boolean registerReptile() {
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To register a reptile it is $85 a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the reptile? ");
		// return the set variable for if the user will register the animal
		return willRegister;
	}
}
