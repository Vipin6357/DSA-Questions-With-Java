import java.util.*;
public class bottomLeftPattern{

    public static void bottomLeft(int n){
        for (int row = 1; row <= n; row++){
            for ( int col = 1; col <= n; col++){
                if( row >= col){
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter Rown Number of printing star : ");
        int n = sc.nextInt();
        sc.close();
        bottomLeft(n);
        }
    }
}