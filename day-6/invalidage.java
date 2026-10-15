import java.util.*;

class invalidageerror extends Exception
{
    invalidageerror(String s)
    {
        super(s);
    }
}

class invalidage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        try{
        int age = sc.nextInt();
        if(age<0 || age>100){
            throw new invalidageerror("Invalid age entered");
        }
    }catch(invalidageerror e){
        System.out.println(e);
    }finally{
        System.out.println("Program executed successfully");
    }
}
}

