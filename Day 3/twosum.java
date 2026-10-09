import java.util.*;

class twosum{
    public static int[] construct_arr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i<size ;i++){
            System.out.print("Enter the " + i +"th value : ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void linearsearch(int[] arr , int target){
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0 ; j< arr.length ; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("target sum found at index : " + i + " , " + j);
                }else{
                    continue;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = construct_arr();
        
        System.out.print("Enter the target need to be found : ");
        int target = sc.nextInt();

        linearsearch(arr1,target);



    }
}