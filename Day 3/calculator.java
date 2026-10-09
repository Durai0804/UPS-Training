import java.util.*;

class calculator{
    public static int add(int x , int y){
        return x+y;
    }
    public static int sub(int x , int y){
        return x-y;
    }
    public static int div(int x , int y){
        return x/y;
    }
    public static int mul(int x , int y){
        return x*y;
    }
    public static int mod(int x , int y){
        return x%y;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Boolean flag = true;

        while(flag){
            System.out.print("Enter your first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter your second number : ");
            int num2 = sc.nextInt();


            System.out.println("1 for addition\n2 for subtraction\n3 for division\n4 for multiplication\n5 for modulus\n6 for exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : {
                    System.out.println("Addition of two numbers " + add(num1,num2));
                    System.out.println("Do you wish to continue , press 1 for yes and 2 for no : ");
                    int cont = sc.nextInt();
                    if(cont == 1){
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                    break;
                }
                case 2 : {
                    System.out.println("Subraction of two numbers " + sub(num1,num2));
                    System.out.println("Do you wish to continue , press 1 for yes and 2 for no : ");
                    int cont = sc.nextInt();
                    if(cont == 1){
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Division of two numbers " + div(num1,num2));
                    System.out.println("Do you wish to continue , press 1 for yes and 2 for no : ");
                    int cont = sc.nextInt();
                    if(cont == 1){
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                    break;
                }
                case 4 : {
                    System.out.println("Multiplication of two numbers " + mul(num1,num2));
                    System.out.println("Do you wish to continue , press 1 for yes and 2 for no : ");
                    int cont = sc.nextInt();
                    if(cont == 1){
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                    break;
                }
                case 5 : {
                    System.out.println("Modulus of two numbers " + mod(num1,num2));
                    System.out.println("Do you wish to continue , press 1 for yes and 2 for no : ");
                    int cont = sc.nextInt();
                    if(cont == 1){
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                    break;
                }
                default : {
                    System.out.println("Invalid choice");
                    flag = false;
                    break;
                }
                    
                }
        }
                }
        }

