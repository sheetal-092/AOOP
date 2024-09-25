package practicalWeek11Inlab2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentGrades {
	private Map<String, Set<Double>> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addGrade(String studentId, double grade) {
        studentGrades.putIfAbsent(studentId, new HashSet<>());
        studentGrades.get(studentId).add(grade);
    }

    public Set<Double> getGrades(String studentId) {
        return studentGrades.getOrDefault(studentId, new HashSet<>());
    }

    public static void main(String[] args) {
        StudentGrades gradesManager = new StudentGrades();
        
        gradesManager.addGrade("101", 85.5);
        gradesManager.addGrade("101", 90.0);
        gradesManager.addGrade("102", 78.0);
        gradesManager.addGrade("101", 85.5);  	

        System.out.println("Grades for student ID 101: " + gradesManager.getGrades("101"));
        System.out.println("Grades for student ID 102: " + gradesManager.getGrades("102"));
        System.out.println("Grades for student ID 103 (not found): " + gradesManager.getGrades("103"));
    }

}
