import java.util.*;

class arrayinput{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0 ; i<n ; i++){
        System.out.print("Enter the " + i + "th index value : ");
        arr[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i : arr){
        if(i%2 == 0){
            sum+=i;
        }else{
            continue;
        }
    }
    System.out.println(" The sum of even values : " + sum);
}
}
//add even values and return sum