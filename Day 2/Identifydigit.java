import java.util.*;
class identifydigit{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number : ");
    int number = sc.nextInt();
    int digit_sum = 0;
    int count = 0;
    while(number > 0){
        digit_sum += number % 10;
        number /= 10;
        count++;
    }
    System.out.println("Digit Sum : " + digit_sum);
    System.out.println("Digit Count : " + count);

}
}