import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

class StudentRecord {
    private final int id;
    private final String name;
    private final double marks;

    StudentRecord(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + marks;
    }

    public String toFileLine() {
        return id + "\t" + name.replace('\t', ' ') + "\t" + marks;
    }

    public static StudentRecord fromFileLine(String line) {
        String[] fields = line.split("\\t", -1);
        if (fields.length != 3) {
            throw new IllegalArgumentException("Invalid student record: " + line);
        }
        return new StudentRecord(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2]));
    }
}

public class StudentRecordsFile {
    private static final Path FILE = Path.of("students.txt");

    private static void writeRecords(List<StudentRecord> records, boolean append) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(FILE,
                StandardOpenOption.CREATE,
                append ? StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING)) {
            for (StudentRecord record : records) {
                writer.write(record.toFileLine());
                writer.newLine();
            }
        }
    }

    private static List<StudentRecord> readRecords() throws IOException {
        List<StudentRecord> records = new ArrayList<>();
        if (!Files.exists(FILE)) {
            return records;
        }

        try (BufferedReader reader = Files.newBufferedReader(FILE)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    records.add(StudentRecord.fromFileLine(line));
                }
            }
        }
        return records;
    }

    public static void main(String[] args) {
        List<StudentRecord> initialRecords = List.of(
            new StudentRecord(101, "Asha", 88.5),
            new StudentRecord(102, "Ravi", 76.0),
            new StudentRecord(103, "Mina", 93.0),
            new StudentRecord(104, "Omar", 81.5),
            new StudentRecord(105, "Tara", 89.0)
        );

        try {
            writeRecords(initialRecords, false);
            List<StudentRecord> records = readRecords();
            System.out.println("Student records:");
            for (StudentRecord record : records) {
                System.out.println(record);
            }

            StudentRecord highest = null;
            for (StudentRecord record : records) {
                if (highest == null || record.getMarks() > highest.getMarks()) {
                    highest = record;
                }
            }
            if (highest != null) {
                System.out.println("Highest marks: " + highest);
            }

            StudentRecord added = new StudentRecord(106, "Kiran", 84.0);
            writeRecords(List.of(added), true);
            System.out.println("Appended student: " + added);
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Unable to process student records: " + e.getMessage());
        }
    }
}
