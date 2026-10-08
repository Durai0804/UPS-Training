// which table , which range 
import java.util.*;
class table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired table : ");
        int table = sc.nextInt();

        System.out.print("Enter your desired range : ");
        int range = sc.nextInt();

        for(int i = 1 ; i <= range ; i++){
            System.out.println(table + " * " + i + " = " + table*i);
        }
    }
}