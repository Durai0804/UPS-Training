import java.util.*;
class dowhilee2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your starting number : ");
        // int start = sc.nextInt();
        System.out.println("Enter your ending number : ");
        int end = sc.nextInt();
        int fact = 1;
        do{
            fact *= end;
            end--;
        }
        while(end>=1);
        System.out.println(fact);
    }
}