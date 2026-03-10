import java.util.Scanner;

public class V_Pattern {
static void v_Pattern(int n){
        int total_lines = n ;
        int outerspaces =   0;
        int innerspaces = 2 * n - 3;
        int currentLine = 1;
        int star = 1;
        while( currentLine <= total_lines){
            //print spaces
            
                for ( int i = 0; i <= outerspaces; i++){
                System.out.print(" ");
                }
            


            //print star

            
            for( int i = 1; i<= star; i++){
                System.out.print("*");

            }
            

            //print spaces
            for(int i = 1; i <= innerspaces; i++){
                System.out.print(" ");
            }
            //print star
            if( outerspaces != n -1   ){
                for (int i = 1; i <= star; i++){
                System.out.print("*");
            }
            }

            System.out.println();
            
            outerspaces++;
            innerspaces = innerspaces - 2;
            
            currentLine++;
            
        }

    }
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the number of line: ");
        int n = sc.nextInt();
        v_Pattern(n);
       }
       
    }
}
