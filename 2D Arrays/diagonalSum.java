import java.util.Scanner;

public class diagonalSum {
    static void printDiagonalSum(int matrix[][]){
        int sum = 0;
        for( int i = 0; i < matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if( i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        System.out.println("Sum of primary and secondary diagonals of Matrix is: "+ sum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of rows and columns: ");
            int n = sc.nextInt();
            

            int matrix[][] = new int [n][n];
            //input
            System.out.println("Enter the " + n * n + " elements for every cell of 2D Arrays: ");
            for (int[] matrix1 : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix1[j] = sc.nextInt();
                }
            }
            printDiagonalSum(matrix);
        }
     }
}






