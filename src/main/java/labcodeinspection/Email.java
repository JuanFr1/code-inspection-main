package labcodeinspection;

import java.util.Locale;

public class Email {

	private transient final String m_firstName;
	private transient final String m_lastName;
	private transient String password;
	private transient  String department;
	private transient final int defaultpasswordLength = 8;
	private transient String email;
	
	/**
     * Constructs an Email object with the specified first and last names.
     *
     * @param firstName the first name of the user
     * @param lastName  the last name of the user
    */	
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	
	/**
     * Displays the user's information, including first name, last name, department, email, and password.
    */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
     * Sets the department for the email based on the user's choice.
     * The department is assigned based on the following options:
     * 1 = Sales, 2 = Development, 3 = Accounting.
     *
     * @param depChoice an integer representing the department choice
    */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
		
	}
	
	/**
     * Generates the user's email address and a random password.
     * The email format combines first and last names, department, and a specified domain.
    */
	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
     * Generates a random password of the specified length, using alphanumeric and special characters.
     *
     * @param length the length of the password to be generated
     * @return a randomly generated password string
    */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.ENGLISH) + this.m_lastName.toLowerCase(Locale.ENGLISH) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
