public class Student {
	private String firstname, lastname;
	private int age, grade;
	
	public Student(String fn, String ln, int a, int g)	{
		firstname = fn;
		lastname = ln;
		age = a;
		grade = g;
	}
	
	public void setGrade(int newGrade)	{
		grade = newGrade;
	}

}
