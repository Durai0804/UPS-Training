import java.util.*;
class while3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        if(start % 2 != 0){
            start++;
            
        }
            while(start<=end){
                System.out.println(start);
                start+=2;
            }
        
    }
}