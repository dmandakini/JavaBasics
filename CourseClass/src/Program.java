//Name: Mandakini Das
//ID:   71776990
//mail: mxd76990@ucmo.edu
//Question: Course Class 
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Course with Coursename Advance Java
		Course course = new Course("Advance Java");
		
		// Add Students to Course Advance Java
		course.addStudent("Student 1");
		course.addStudent("Student 2");
		course.addStudent("Student 3");
		course.addStudent("Student 4");
		course.addStudent("Student 5");
		course.addStudent("Student 6");
		
		// Get Number of Students for Course Advance Java
		System.out.println(course.getNumberOfStudents());	
		
		

	}

}
