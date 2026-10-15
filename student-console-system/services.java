import java.util.*;
import java.io.*;
public class services{
    
    //Creating a student record
    public static  void createStudent(student s){
        try{
            FileWriter writer = new FileWriter("studentdata.csv",true);
            writer.write("Name : " + s.getName()+ " " + "Roll No : " + s.getRollno()+" " + "Age : " + s.getAge() +"\n");
            writer.close();
        }
        catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
    }

    //Reading a student record
    public static void getStudentRecord(int rollno){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("studentdata.csv"));
            while(reader.readLine() != null){
                String line = reader.readLine();
                if(line.contains(String.valueOf(rollno))){
                    System.out.println(line);
                    break;
                }
            }
            System.out.println("Record not found");
            reader.close();
        }
        catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
}
}