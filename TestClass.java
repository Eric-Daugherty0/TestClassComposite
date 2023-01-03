import java.util.ArrayList;
import java.util.Scanner;
//importing in arrayList and Scanner utilities.
public class TestClass {

	private static Scanner scnr;
	
    //main class.
	public static void main(String[] args) {
	       scnr = new Scanner(System.in);
	       //My interface that accepts users input and stores it into array.
	       System.out.print("Enter the number of students: ");
	       int numStudents = scnr.nextInt();
	       ArrayList<Student> studentArrayList = new ArrayList<>(numStudents);
	       for (int i=0; i < numStudents; ++i) {
	           System.out.print("Enter a student's first name: ");
	           String firstName = scnr.next();
	           System.out.print("Enter a student's middle initial: ");
	           char midInit = scnr.next().charAt(0);
	           System.out.print("Enter a student's last name: ");
	           String lastName = scnr.next();
	           System.out.printf("Enter a student's birthday month (1-12): ", 1, 12);
	           int month = scnr.nextInt();
	           System.out.printf("Enter a student's birthday date (1-31): ", 1, 31);
	           int day = scnr.nextInt();
	           System.out.print("Enter a student's birth year: ");
	           int year = scnr.nextInt();
	           System.out.print("Enter the number of credits this student completed: ");
	           int numCredits = scnr.nextInt();
	           System.out.print("Enter this student's GPA: ");
	           double GPA = scnr.nextDouble(); 
	           Student student = new Student(firstName, midInit, lastName, month, day, year, numCredits, GPA);
	           studentArrayList.add(student); 
	       
	       //for each loop. that loops through users inputed data so that each input is printed to the console.  
	       }
	       for (Student s  : studentArrayList) {
	           System.out.println(s);
	       }
	       
	}

	
	} 


	

	          


	
	

	
