// Print if a number is Odd or Even

import java.util.*;
public class odd_or_even{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        String a = " Number is EVEN";
        String B = " Number is ODD ";
        if ( number % 2 == 0){
            System.out.println(a);
        } else {
            System.out.println(B);
        }
    }
}