package Unit1;

import java.sql.SQLOutput;

/**
 * Student encapsulates typical properties of a student object
 * @author jcochran
 * @version 9/4/2019
 */
public class Student {
	/**
	 * Declare the instance variables of the class (private data)
	 */
	private String firstname, lastname;
	private int age, grade;
	/**
	 * constructs a new Student.
	 * @param fn this student's first name
	 * @param ln this student's last name
	 * @param a  this student's age
	 * @param g  this student's grade
	 */
	public Student(String fn, String ln, int a, int g){
		firstname = fn;
		lastname = ln;
		age = a;
		grade = g;
	}
	/**
	 * sets the grade
	 * @param newGrade the new grade
	 */
	public void setGrade(int newGrade){
		grade = newGrade;
	}

	/**
	 * Get firstname string.
	 *
	 * @return the string
	 */
	public String getFirstname(){
		return firstname;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Ryan","Kirshner", 17, 12);
		Student s2 = new Student("Declan", "Ross", 15, 12);
		System.out.println(s1);
		System.out.println(s2);
	}
}
