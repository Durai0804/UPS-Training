import java.util.ArrayList;
import java.util.Comparator;

class Student {
    private final int rollNumber;
    private final String name;
    private double mark;

    Student(int rollNumber, String name, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark = mark;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNumber + ", Name: " + name + ", Mark: " + mark;
    }
}

public class StudentManagement {
    private static Student findStudent(ArrayList<Student> students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Maya", 82));
        students.add(new Student(2, "Noah", 74));
        students.add(new Student(3, "Isha", 91));
        students.add(new Student(4, "Liam", 68));
        students.add(new Student(5, "Zara", 77));

        System.out.println("Students scoring above 75:");
        for (Student student : students) {
            if (student.getMark() > 75) {
                System.out.println(student);
            }
        }

        int searchedRollNumber = 2;
        Student found = findStudent(students, searchedRollNumber);
        System.out.println("Search roll " + searchedRollNumber + ": " + (found == null ? "Not found" : found));

        Student toUpdate = findStudent(students, 2);
        if (toUpdate != null) {
            toUpdate.setMark(79);
            System.out.println("Updated student: " + toUpdate);
        }

        int removedRollNumber = 4;
        students.removeIf(student -> student.getRollNumber() == removedRollNumber);
        System.out.println("Removed roll number: " + removedRollNumber);

        students.sort(Comparator.comparingDouble(Student::getMark));
        System.out.println("Students sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
