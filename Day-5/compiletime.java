import java.util.*;
class addition{
    public int add(int x , int y){
        return x+y;
    }
    public int add(int x , int y , int z){
        return x+y+z;
    }
    public int add(int x, int y , int z , int a){
        return x+y+z+a;
    }
    public int add(int x , int y , int z , int a , int b){
        return x+y+z+a+b;
    }
}
class compiletime{


    public static void main(int[] args){
        addition a = new addition();
        System.out.println(a.add(1,2,3,4,5));
    }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the total numbers you want to add (between range 2-5): ");
    //     int count = sc.nextInt();

    //     int[] arr = new int[count];

            //    c - a - b - d-e
    //     for(int i = 0 ; i<count;i++){
    //         System.out.print("Enter the number : ");
    //         arr[i]=sc.nextInt();   
    //     }
    //     addition a = new addition();
    //     switch(count){
    //         case 2 : System.out.println(a.add(arr[0] , arr[1])); break;
    //         case 3 : System.out.println(a.add(arr[0] , arr[1] , arr[2]));break;
    //         case 4 : System.out.println(a.add(arr[0] , arr[1] , arr[2] , arr[3]));break;
    //         case 5 : System.out.println(a.add(arr[0] , arr[1] , arr[2] , arr[3] , arr[4]));break;
    //     }
    // }

    

}