import java.util.*;

class addchararray{
    public static char[] construct_arr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        char[] arr = new char[size];

        for(int i = 0 ; i<size ; i++){
            System.out.print("Enter the value : ");
            arr[i] = sc.next().charAt(0);
        }
        return arr;
    }

    public static char[] join_arr(char[] arr1 , char[] arr2){
        int size = arr1.length + arr2.length;
        char[] arr = new char[size];
        int j = 0;
        for(int i = 0 ; i<arr1.length ; i++){
            arr[i] = arr1[i];
        }
        for(int i = arr1.length ; i<size ; i++){
            arr[i] = arr2[j];
            j++;
        }
        return arr;
    }
    public static void printarr(char[] arr){
        for(char c : arr){
            System.out.print(c + " , ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr1 = construct_arr();
        char[] arr2 = construct_arr();
        char[] joined_arr = join_arr(arr1,arr2);
        printarr(joined_arr);


    }
}