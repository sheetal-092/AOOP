package practicalWeek10Postlab1;

public class StudentCloningDemo {
	public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 101, 85.5);
            Student student2 = (Student) student1.clone();

            System.out.println("Original Student:");
            System.out.println("Name: " + student1.getName());
            System.out.println("Roll Number: " + student1.getRollNumber());
            System.out.println("Marks: " + student1.getMarks());

            System.out.println("\nCloned Student:");
            System.out.println("Name: " + student2.getName());
            System.out.println("Roll Number: " + student2.getRollNumber());
            System.out.println("Marks: " + student2.getMarks());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
