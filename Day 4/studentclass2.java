import java.util.*;

class student{
    private int rollno;
    private String name;
    private int age;
    private int marks;

    public void getter(){
        System.out.println();
        System.out.println("Student Details");
        System.out.println("Roll No : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println();
    }

    public void setter(int rollno , String name , int age , int marks){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public student(int rollno , String name , int age , int marks){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

}

public class studentclass2{
    public static void main(String[] args){
        student s = new student(28,"Durai",21,88);
        s.getter();
        s.setter(29,"Durai2",22,89);
        s.getter();
    }
}