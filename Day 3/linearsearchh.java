import java.util.*;

class linearsearchh{
    
    public static int[] construct_arr(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        
        for(int i = 0 ; i<n ; i++){
            System.out.print("Enter the " + i +"th index value : ");
            arr[i] = sc.nextInt();
        }
        return arr;

    }
    public static int linearsearch(int[] arr, int target){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
    public static 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = construct_arr(n);
        System.out.print("Enter the target element present in the array : ");
        int target = sc.nextInt();
        int target_ind = linearsearch(arr , target);
        if(target_ind == -1){
            System.out.println("Element not present");
        }else{
            System.out.println("The index is : " + target_ind);
        }


    }
}