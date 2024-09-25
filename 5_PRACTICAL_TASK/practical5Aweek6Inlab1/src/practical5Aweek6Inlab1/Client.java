package practical5Aweek6Inlab1;

public class Client {
	public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        EnrollmentManager enrollmentManager = new EnrollmentManagerImpl();

        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student2, course1);
        enrollmentManager.enrollStudentInCourse(student1, course2);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(student1);
        System.out.println(student2);
    }
}
