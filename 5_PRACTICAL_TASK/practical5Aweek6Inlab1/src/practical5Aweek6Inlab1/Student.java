package practical5Aweek6Inlab1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	 private String name;
	    private String studentId;
	    private List<String> courses;

	    public Student(String name, String studentId) {
	        this.name = name;
	        this.studentId = studentId;
	        this.courses = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public String getStudentId() {
	        return studentId;
	    }

	    public List<String> getCourses() {
	        return courses;
	    }

	    public void enroll(String course) {
	        courses.add(course);
	    }

	    @Override
	    public String toString() {
	        return "Student ID: " + studentId + ", Name: " + name + ", Courses: " + courses;
	    }
}
