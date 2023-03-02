package week1.day1;


//Class Declaration

public class Student {
	
	// Instance Variables
	String studentName;
	int rollNo;
	String collegeName;
	int markScored;
	String cgpa;
	
    // Constructor Declaration of Class

	public Student(String studentName,int rollNo,String collegeName,int markScored,String string) {
		this.studentName= studentName;
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		this.markScored=markScored;
		this.cgpa=string;

	}
	public String getName() {
		return studentName;
	}
	public int getrollNo() {
		return rollNo;
	}
	public 	String getcollegeName() {
		return collegeName;
	}
	public int getmarkScored() {
		return markScored;
	}
	public String cgpa() {
		return cgpa;
	}
	
    // creating object using new operator

	public static void main(String[] args) {
		Student s1=new Student("KARAN",07,"ABC",99,"7.5");
		System.out.println("Student name "+s1.getName());
		System.out.println("Student Rollno "+s1.rollNo);
		System.out.println("College Name "+s1.collegeName);
		System.out.println("MarkScored "+s1.markScored);
		System.out.println("CGPA "+s1.cgpa);
	}

}
