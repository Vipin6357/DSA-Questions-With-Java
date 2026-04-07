
import java.util.Scanner;

public class  findNumberInMatrix{
    static void printNumber(int matrix[][], int key){
        int count = 0;
        for (int[] matrix1 : matrix) { //orrr--  for( int i 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix1[j] == key) {
                    count++;
                }
            }
        }
        System.out.println("Count of total same number in matrix is: " + count);
    }
    public static void main(String agrs[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of rows and columns: ");
            int n = sc.nextInt();
            int m = sc.nextInt();

            int matrix[][] = new int [n][m];
            //input
            System.out.println("Enter the " + n * m + " elements for every cell of 2D Arrays: ");
            for (int[] matrix1 : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix1[j] = sc.nextInt();
                }
            }
            System.out.print("Enter the number which want to search in Matrix: ");
            int key = sc.nextInt();
            printNumber(matrix, key);
        }
    }
}