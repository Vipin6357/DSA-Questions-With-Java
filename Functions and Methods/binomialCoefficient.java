
import java.util.Scanner;

public class binomialCoefficient {

    public static int fact(int f){
        int fact = 1;
        for(int i = f; i >= 1; i--){
            fact *= i;
        }
        return fact;
    }

    public static void binCoeff(int n, int r){
        int factN = fact(n);
        int factR = fact(r);
        int nMinusR =  n - r;
        int factnMinusR = fact(nMinusR);
        
        int binoCoeff = factN / (factR * factnMinusR);

        System.out.print("Binomial Coefficient of "+ n + " and "+ r + " is: " + binoCoeff);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            binCoeff(n, r);
        }
        
        
    }
}
