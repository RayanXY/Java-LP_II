import java.lang.Comparable;

/**
 * This class represents the grades for a student. It implements
 * the Comparable inteface inheriting its funtions.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class StudentGrade implements Comparable<StudentGrade>{
	
	private int registration;
	private String name;
	private double grade1, grade2, grade3;

	/**
	 * Creates a report.
	 * @param registration - The student's ID.
	 * @param name - The student's name.
	 * @param grade1, grade2 and grade 3 - The student's grades.
	 */
	public StudentGrade(int registration, String name, double grade1, double grade2, double grade3){

		this.registration = registration;
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;

	}

	/**
	 * Compare the media of the current student with another student.
	 * @param other - The other student to be compared with.
	 * @return 1 / -1 / 0 - Greater / Lesser / Equals.
	 */
	public int compareTo(StudentGrade other){

		double thisMedia = (this.grade1 + this.grade2 + this.grade3)/3;
		double otherMedia = (other.grade1 + other.grade2 + other.grade3)/3;

		if(thisMedia < otherMedia){
			return -1;
		}
		if(thisMedia > otherMedia){
			return 1;
		}

		return 0;

	}

	/**
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> Name: " + name + "\n>>> Registration: " + registration;
	}

}