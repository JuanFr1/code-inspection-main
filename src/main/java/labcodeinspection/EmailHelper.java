package labcodeinspection;

import java.util.Scanner;

public final class EmailHelper {
	
	/**
     * Private constructor to prevent instantiation of this utility class.
    */
	private EmailHelper() {}
	
	/**
     * Creates an Email object by prompting the user for their first name, last name, and department code.
     * This method gathers user input, sets the department, and generates the email details.
     *
     * @return an Email object with the provided information
    */
	public static Email createEmail() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		int depChoice = sc.nextInt();
		sc.close();

		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		
		return email;
	}
	
	/**
     * Displays the information of the given Email object.
     * If the email parameter is null, it outputs a message indicating that email information is not available.
     *
     * @param email the Email object whose information is to be displayed
    */
	public static void displayEmailInfo(Email email) {
        if (email != null) {
            email.showInfo();
        } else {
            System.out.println("Email information not available.");
        }
    }
	
}
