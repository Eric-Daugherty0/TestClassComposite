//student class
public class Student {
	//
	private int numCredits;
	private double GPA; 
	private String firstName;
	private char midInit;
	private String lastName;
	private int month;
	private int day;
	private int year; 
	
	//constructor method with fields from my student class.
	public Student(String firstName, char midInit, String lastName, int month, int day, int year, int numCredits, double GPA) {
	this.numCredits = numCredits; 
	this.GPA = GPA; 
	this.firstName = firstName; 
	this.midInit = midInit; 
	this.lastName = lastName; 
	this.month = month; 
	this.day = day; 
	this.year = year;
	}

    //my getter and setters that get and set instance variables.
	public int getNumCredits() {
		return numCredits;
	}


	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}


	public double getGPA() {
		return GPA;
	}


	public void setGPA(double gPA) {
		GPA = gPA;
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


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

    //toString to return my instance variables
	@Override
	public String toString() {
		return "[number of Credits =" + " " + numCredits + ", GPA =" + " " + GPA + ", Name ="+ " " + firstName + " " +  midInit + " " + lastName + 
				", Date =" + " " + month + "/"  + day + "/" + year + "]";
	}
	
	
}
	

	