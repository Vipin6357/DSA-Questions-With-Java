
import java.util.Scanner;

public class factorial {
    public static void fact(int f) {
        int fact = 1;
        for ( int i = f; i >= 1; i--){
            fact *= i;
            
        }
        System.out.print("Factorial of "+ f + " is: "+fact);
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the number: ");
        int f = sc.nextInt();
        sc.close();
        fact(f);
        }
        
    }
}
