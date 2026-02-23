// Write a Java program to get a number from the user and print whether it is positive or negative




import java.util.*;
public class positive_negative{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        if ( number >= 0 ){
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}