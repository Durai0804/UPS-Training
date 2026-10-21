import java.util.*;
import java.io.*;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("Enter 1 for create Student Record");
        System.out.println("Enter 2 for get Student Record");
        System.out.println("Enter 3 for update Student Record");
        System.out.println("Enter 4 for delete Student Record");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1 : {
                System.out.print("Enter name : ");
                String name = sc.nextLine();
                System.out.print("Enter roll no : ");
                int rollno = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter age : ");
                int age = sc.nextInt();
                student s = new student(name,rollno,age);
                services.createStudent(s);
                System.out.println("Record created successfully");
                break;
            }
            case 2 : {
                System.out.print("Select 1 for Rollno and Select 2 for Name : ");
                int choice2 = sc.nextInt();
                if(choice2 == 1){
                    System.out.print("Enter roll no : ");
                    String rollno = sc.next();
                    services.getStudentRecordviaRollno(rollno);
                }else if(choice2 == 2){
                    System.out.print("Enter name : ");
                    String name = sc.next();
                    services.getStudentRecordviaName(name);
                }else{
                    System.out.println("Invalid input");
                }
                break;
            }
        }


       


    }
}