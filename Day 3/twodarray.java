import java.util.*;

class twodarray{
    public static int[][] construct_matrix(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print("Enter the " +  i + "," + j +"th value : ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] add_mat(int[][] mat1 , int[][] mat2){
        int r = mat1.length;
        int c = mat1[0].length;
        
        int[][] add_mat = new int[r][c];

        for(int i = 0 ; i<r;i++){
            for(int j = 0 ; j <c ;j++){
               add_mat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return add_mat;
    }
    public static void print_mat(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0 ; i<row ;i++){
            for(int j=0; j<col;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        int[][] matrix1 = construct_matrix();
        int[][] matrix2 = construct_matrix();

        int[][] added_mat = add_mat(matrix1 , matrix2);
        print_mat(added_mat);
        

    }
}