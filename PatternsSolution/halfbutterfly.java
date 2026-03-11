import java.util.Scanner;

public class halfbutterfly{

    public static void halfButterfly( int n){
        int totalLines = n;
        int stars = 1;
        int spaces = 2 * n - 2;

        int currentLine = 1;
        while ( currentLine <= totalLines){
            //print Stars
            for ( int i = 1; i<= stars; i++){
                System.out.print("*");
            }

            //print Spaces

            for ( int i = 1; i <= spaces; i++){
                System.out.print(" ");
            }

            //Print stars

            for(int i = 1; i <= stars; i++){
                System.out.print("*");
            }

            // Prepare for next line
            System.out.println();
            
            stars++;
            spaces = spaces - 2;
            
            
            
            currentLine++;

        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of Lines: ");
            int lines = sc.nextInt();
            halfButterfly(lines);
            
        }
        
    }
}