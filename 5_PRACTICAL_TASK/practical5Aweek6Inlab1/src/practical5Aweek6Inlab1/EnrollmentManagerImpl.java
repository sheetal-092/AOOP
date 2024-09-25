package practical5Aweek6Inlab1;

public class EnrollmentManagerImpl implements EnrollmentManager {
	@Override
    public void enrollStudentInCourse(Student student, Course course) {
        course.enrollStudent(student);
    }

}
