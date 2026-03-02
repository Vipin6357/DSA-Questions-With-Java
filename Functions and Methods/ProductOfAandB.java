
import java.util.*;

public class ProductOfAandB{

    public static void product(int a, int b){
        int pro = a * b;

        System.out.println("Product of "+ a + " and "+ b +" is: " +pro);

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        product(a, b);
    }
    }
}