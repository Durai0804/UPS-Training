import java.util.*;

//find odd or even without using ifelse and ternary

class oddOReven{

    public static void oddOrEven(){
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while(flag){
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        int digit = number%2;

        switch(digit) {
            case 0 : {
                System.out.println("Even Number");
                break;
            }
            case 1 :{
                System.out.println("Odd number");
                break;
            }
        }
        System.out.println("Do you wish to continue , select 1 to continue and 2 to exit : ");
        int choice = sc.nextInt();
        if(choice == 1){
            flag = true;
        }
        else{
            flag = false;
        }
        }
    }
    public static void main(String[] args){
        oddOrEven();
        
    }
}