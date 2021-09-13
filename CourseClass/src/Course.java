//Name: Mandakini Das
//ID:   71776990
//mail: mxd76990@ucmo.edu
//Question: Course Class 

public class Course {
	String courseName;
	String[] students= new String[10];
	int numberOfStudents;
	
	// default constructor initializing courseName
	Course(String courseName){
		this.courseName=courseName;
	}
	
	// Method for adding student in the given course
	void addStudent(String student) {
		students[numberOfStudents]=student;
		numberOfStudents++;
	}
	
	// Get number of students
	int getNumberOfStudents() {
		return numberOfStudents;
	}

}
