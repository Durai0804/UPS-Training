import java.util.*;

class student{
    private String name;
    private int rollno;
    private int age;

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
    
    public static student createRecord(String name , int rollno , int age){
        student s = new student();
        s.setName(name);
        s.setRollno(rollno);
        s.setAge(age);
        return s;
    }

}
class StudentList{
    public static void main(String[] args){
        Boolean Cont = true;
        ArrayList<student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(Cont){
            System.out.println("Welcome to Student Management Console");
            System.out.println("Select 1 to create student record");
            System.out.println("Select 2 to print all student record");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :{ 
                        System.out.println("Create Student Record"); 
                        System.out.print("Enter Name : ");
                        String name = sc.next();
                        System.out.print("Enter Rollno : ");
                        int rollno = sc.nextInt();
                        System.out.print("Enter Age : ");
                        int age = sc.nextInt();
                        student s = student.createRecord(name, rollno, age);
                        list.add(s);
                        break;
                }
                case 2 : {
                        System.out.println("All Student Record");
                        // System.out.println(list);
                        // break;

                        for(student s : list){
                            System.out.println(s.getName() + " " + s.getRollno() + " " + s.getAge());   
                        }
                }

            }

            System.out.print("Do you want to continue 1 for continue 2 for exit : ");
            int choice2 = sc.nextInt();
            
            if(choice2 == 2){
                Cont = false;
            }
        }
    }
}
