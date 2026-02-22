// Print largest of 3 number
// a = 1, b = 3, c = 6;
/*
public class largest_of_3{
    public static void main (String args []){
        int a = 1, b = 3, c = 6;
        if (( a >= b && a >= c)){
            System.out.println("largest is " + a);
        } else if ( b >= c ){
            System.out.println("largest is " + b);
        } else {
            System.out.println("largest is " + c);
        }
    }
}

*/

                    //OR


// public class largest_of_3{
//     public static void main (String args []){
//         int a = 1, b = 2, c = 3;
//         int largest = a;
//         if ( b >= largest ){
//             largest = b;
//         } if ( c >= largest){
//             largest = c;
//         }
//             System.out.println("largest is " + largest);
        
//     }
// }

                        // OR
// * take input from the users 

import java.util.*;
public class largest_of_3{
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int largest = number3;

        if ( number1 > largest){
            largest = number1;
        } else if ( number2 > largest){
            largest = number2;
        } else {
            largest = number3;
        }
        System.out.println("largest number is " + largest);
    }
}