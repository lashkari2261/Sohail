package BankExample;

public class Custmer {
	/*
	 * Variables name phone address email balance DOB PIN Account Number
	 * 
	 * 
	 * default constructor parameterized constructor toString
	 * 
	 * 
	 * check my balance / provide pin deposit / amount withdraw / amount requested
	 * is not more than what i have
	 */

	// access modifiers 4
	// 1. public - the entire project can access
	// 2. protected
	// 3. default
	// 4. private - you can only access it inside of that same class

	private String fullName;
	private String phoneNumber;
	private String address;
	private String email;
	private double balance;
	private String dob;
	private String pin;
	private int accNumber;

	public Custmer() {
		this.fullName = "";
		this.phoneNumber = "";
		this.address = "";
		this.email = "";
		this.balance = 0;
		this.dob = "";
		this.pin = "";
		this.accNumber = 0;
	}

	public Custmer(String fullName, String phoneNumber, String address, String email, String dob, String pin,
			int accNumber) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.pin = pin;
		this.accNumber = accNumber;

		this.balance = 0;
	}

	// check balance - you have to provide the right pin
	public double checkBalance(String providePIN) {
		if (pin.equals(providePIN)) {
			// correct pin
			System.out.println("Your Balance is $" + balance);
			return balance;
		} else {
			// incorrect pin
			System.out.println("Incorrect PIN");
			return -1;
		}
	}

	// deposit - you have to provide the accNumber and pin
	public boolean deposit(double amount, int accNumber, String pin) {
		if (this.accNumber != accNumber || !this.pin.equals(pin)) {
			System.out.println("Incorrect Credentials!");
			return false;
		}
		// add amount
		this.balance += amount;
		System.out.println("$" + amount + " has been deposited to your account!");
		return true;
	}

	// withdraw - pin
	public double withdraw(double amount, String pin) {
		if (this.pin.equals(pin) == false) {
			System.out.println("Wrong PIN!");
			return -1;
		}
		if (amount > balance) {
			System.out.println("Insuffiecient Balance!");
			return -1;
		}

		System.out.println("$" + amount + " has been withdrawn from your account!");
		balance -= amount;
		return amount;

	}

	// another example of withdraw function
	public boolean withdraw2(double amount, String pin) {
		if (this.pin.equals(pin) == false) {
			System.out.println("Wrong PIN!");
			return false;
		}
		// check for negative amount
		if (amount <= 0) {
			System.out.println("Incorrect Amount Entry!");
			return false;
		}

		if (amount > balance) {
			System.out.println("$" + amount + " amount requested is more than the curreent balance of $" + balance);
			System.out.println("$" + balance + " is widrawn successfully!");
			balance = 0;
			System.out.println("Your balance is now $" + balance);
			return true;
		}
		
		System.out.println("$" + amount + " has been withdrawn!");
		balance -= amount;
		return true;
		
	}

	// encapsulation - is the idea of hiding your variables and defining control
	// you do this by making the variables private
	// and then making getter and setter methods to define the control

	// Getters / Accessors - methods to access the private variables
	public String getFullName() {
		return fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getDOB() {
		return dob;
	}

	public int getAccountNumber() {
		return accNumber;
	}

	// Setter / Mutators - methods are used to change/update the value
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setPhoneNumber(String phoneNumebr) {
		this.phoneNumber = phoneNumebr;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public String toString() {
		String temp = "----------------------------------------------------\n" + "Customer Account#: " + accNumber
				+ "     Balance: $" + balance + "\n" + "Full Name: " + fullName + ", DOB: " + dob + "\n" + "Address: "
				+ address + ", Email: " + email + ", Phone: " + phoneNumber + "\n"
				+ "----------------------------------------------------";
		return temp;
	}

}
