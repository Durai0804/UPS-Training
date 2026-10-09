import java.util.*;

class minmaxarr{
    public static int[] construct_arr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i<size ; i++){
            System.out.print("Enter the " + i + "th value : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void find_min_max(int[] arr){
        int min = arr[0];
        int max = arr[0];
        

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int second_max = arr[0];

        int second_min = arr[0];

        for(int i=0 ; i<arr.length ; i++){
            if(second_max != max){
                if(arr[i]<max && arr[i]>second_max){
                    second_max = arr[i];
                }
            }else{
                second_max = arr[i];
            }
            if(second_min != min){
                if(arr[i] > min && arr[i] < second_min){
                second_min = arr[i];
                }
            }else{
                second_min = arr[i];
            }
        }

        System.out.println("The max is : " + max);
        System.out.println("The min is : " + min);
        System.out.println("The second max is : " + second_max);
        System.out.println("The second min is : " + second_min);
    }
    public static void main(String[] args){
        int[] arr = construct_arr();
        find_min_max(arr);


    }
}