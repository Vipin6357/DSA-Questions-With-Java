// Write a program in which print a week name by typing number from 1 - 7,
// If the number is not from 1 - 7 then print Please enter number between 1 - 7

import java.util.*;
public class weekname{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("enter a digit = ");
        int day = sc.nextInt();

        switch ( day ){
            case 1 : System.out.println("Monday");
                        break;
            case 2 : System.out.println("Tuesday");
                        break;
            case 3 : System.out.println("Wednesday");
                        break;
            case 4 : System.out.println("Thursday");
                        break;
            case 5 : System.out.println("Friday");
                        break;
            case 6 : System.out.println("Saturday");
                        break;
            case 7 : System.out.println("Sunday");
                        break;
            default : System.out.println("Please enter number only between 1 - 7 only");
        }

    }
}