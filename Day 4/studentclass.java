import java.util.*;

class studentclass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of students you want to store : ");
        int n = sc.nextInt();
        // for(int i = 0 ; i<n ; i++){
        // System.out.print("Enter roll no : ");
        // int rollno = sc.nextInt();
        // System.out.print("Enter name : ");
        // String name = sc.next();
        // System.out.print("Enter age : ");
        // int age = sc.nextInt();
        // System.out.print("Enter marks : ");
        // int marks = sc.nextInt();
        // student s = new student(rollno , name , age , marks);
        // s.display();
        // }

        student[] arr = new student[n];
        for(int i = 0 ; i<n ;i++){
            System.out.print("Enter roll no : ");
            int rollno = sc.nextInt();
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("Enter age : ");
            int age = sc.nextInt();
            System.out.print("Enter marks : ");
            int marks = sc.nextInt();
            arr[i] = new student(rollno , name , age , marks);
            arr[i].display();
        }
        arr[1].display();

    }
}
class student{
    int rollno;
    String name;
    int age;
    int marks;
    public student(int rollno , String name , int age , int marks){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display(){
        System.out.println();
        System.out.println("Student Details");
        System.out.println("Roll No : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println();
    }
    
}