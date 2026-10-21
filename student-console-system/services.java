import java.util.*;
import java.io.*;
public class services{
    
    //Creating a student record
    public static  void createStudent(student s){
        try{
            FileWriter writer = new FileWriter("studentdata.txt",true);
            writer.write("Name : " + s.getName()+ " " + "Roll No : " + s.getRollno()+" " + "Age : " + s.getAge() +" . "+"\n" );
            writer.close();
        }
        catch(IOException e){
            System.out.println("error" + e.getMessage());
        }   
    }

    //Reading a student record via rollNo
    public static void getStudentRecordviaRollno(String rollno){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("studentdata.txt"));
            String line ;
            Boolean found = false;

            while((line = reader.readLine())!=null && !found){
                if(line.contains("Roll No : " + rollno)){
                    System.out.println(line);
                    found = true;
                } 
                if(found){
                    break;
                }
                if(!found){
                    System.out.println("Record not found");
                }
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
}

    //Reading a Student record via name 
    public static void getStudentRecordviaName(String name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("studentdata.txt"));
            String line ;
            Boolean found = false;
            while((line = reader.readLine()) != null && !found){
                if(line.contains("Name : " + name)){
                    System.out.println(line);
                    found = true;
                } 
                if(found){
                    break;
                }
                if(!found){
                    System.out.println("Record not found");
                }
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
    }

    //Deleting a student record
}
