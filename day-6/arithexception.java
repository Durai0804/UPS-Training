import java.util.*;

class arithexception{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.print("Enter number : ");
        int b = sc.nextInt();
        try{
            System.out.println("Division of two numbers : " + a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Found this exception : " +e);
        }
        finally{
            System.out.println("Program executed successfully");
        }
    }
}

