
public class Name {

	public String firstName;
	public char midInit;
	public String lastName;

	public Name(String firstName, char midInit, String lastName) {
		this.firstName = firstName; 
		this.midInit = midInit; 
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMidInit() {
		return midInit;
	}

	public void setMidInit(char midInit) {
		this.midInit = midInit;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() { 
		return firstName + " " + midInit + " " + lastName;
	}
}
