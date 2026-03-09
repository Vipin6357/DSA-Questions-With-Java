import java.util.Scanner;

public class V_Pattern {

        public static void V_shape(int n){
            for (int row = 1; row <= n; row++){
                for ( int col = 1; col <= n; col++){
                    if( row == col && row + col <= n + 1 ||row + col == n + 1 && row <= col ){
                        
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
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
            V_shape(n);
        }
   }
}
