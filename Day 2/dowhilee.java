import java.util.*;
class dowhilee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();
        int i = start;
        int sum = 0;
        do{
            sum +=i;
            i++;
            
        }while(i<=end);
        System.out.println(sum);
    }
}