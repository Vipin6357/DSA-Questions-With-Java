import java.util.Scanner;
public class diamondPattern{
    public static void DiamondPattern(int n){
        int total_number_of_lines = 2 * n - 1;
        int outerSpaces = n - 1;
        int innerSpaces = 1;
        int stars = 1;
        int currentLine = 1;
        while( currentLine <= total_number_of_lines){
            //print outer spaces
            for( int i = 1; i<=outerSpaces; i++){
                System.out.print(" ");
            }


            // print star
            if(outerSpaces != n - 1){
                for(int i = 1; i <= stars; i++){
                    System.out.print("*");
                }
            }

            //print inner spaces
            
                for(int i = 1; i <= innerSpaces; i++){
                System.out.print(" ");
                
            }


            //print star
            
            for(int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            


            //prepare of next line
            System.out.println();
            if(currentLine < n){
                outerSpaces--;
                innerSpaces = innerSpaces + 2;
            }else {
                outerSpaces++;
                innerSpaces = innerSpaces - 2;
            }
            currentLine++;
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the half value of Number of lines: ");
            int lines = sc.nextInt();
            DiamondPattern(lines);

        }
    }
}