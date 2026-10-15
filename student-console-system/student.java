import java.util.*;
public class student{
    private String name;
    private int rollno;
    private int age;

    student(String name , int rollno , int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public void getter(String name , int rollno , int age){
        System.out.println("Student name : " + name + "Roll no : " + rollno + "Age : " + age );
    }

    public void setter(String name , int rollno , int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public int getAge(){
        return age;
    }

}
