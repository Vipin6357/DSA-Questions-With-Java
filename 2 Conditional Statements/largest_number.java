/* 
Print the largest number of 2
a = 1 , b = 3
*/ /*
public class largest_number{
    public static void main(String args []){
        int a = 1;
        int b = 3;
        if ( a >= b){
            System.out.println("A is larger than B");
        } else {
            System.out.println("B is larger than A");
        }
    }
}

*/

// if we take input from user than .........
import java.util.*;
public class largest_number{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String d = "a is larger than b";
        String e = " B is larger than a";

        if ( a >= b ) {
            System.out.println(d);
        } else {
            System.out.println(e);
        }

    }
}