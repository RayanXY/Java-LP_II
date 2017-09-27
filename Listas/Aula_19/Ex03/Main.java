import java.util.ArrayList;
import java.util.Collections;

public class Main{
	
	public static void main(String [] args){

		/// Students
		StudentGrade student1 = new StudentGrade(1025, "Scott Summers", 7.0, 7.0, 7.0);
		StudentGrade student2 = new StudentGrade(2654, "Jean Grey", 9.0, 9.0, 9.0);
		StudentGrade student3 = new StudentGrade(7951, "Kurt Wagner", 6.0, 6.0, 6.0);
		StudentGrade student4 = new StudentGrade(1997, "Logan", 5.0, 5.0, 5.0);
		StudentGrade student5 = new StudentGrade(1456, "Kitty Pride", 8.0, 8.0, 8.0);

		/// Storing the students
		ArrayList<StudentGrade> list = new ArrayList<StudentGrade>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);

		/// Sorting by the students' media.
		Collections.sort(list);

		/// Printing the sorted list.
		for(StudentGrade student : list){
			System.out.println(student);
		}

	}

}