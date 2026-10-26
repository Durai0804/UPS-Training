class Student {
    private final int rollNumber;
    private final String name;
    private final int[] marks;

    Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks.clone();
    }

    int getRollNumber() {
        return rollNumber;
    }

    String getName() {
        return name;
    }

    int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double getAverage() {
        return getTotal() / (double) marks.length;
    }

    String getGrade() {
        double average = getAverage();
        if (average >= 90) return "A";
        if (average >= 75) return "B";
        if (average >= 60) return "C";
        if (average >= 40) return "D";
        return "F";
    }

    void display() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentResultManagement {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Arun", new int[] {80, 85, 90, 85, 85}),
            new Student(2, "Priya", new int[] {95, 92, 90, 96, 97}),
            new Student(3, "Kiran", new int[] {72, 68, 75, 70, 65})
        };

        Student topper = students[0];
        for (Student student : students) {
            student.display();
            System.out.println();
            if (student.getTotal() > topper.getTotal()) {
                topper = student;
            }
        }
        System.out.println("Topper: " + topper.getName());
    }
}
