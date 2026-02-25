/*
import java.util.*;
public class Tax_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        
        int tax1 = 0;
        int tax2 = (int) (income * 0.20);
        int tax3 = (int) (income * 0.30);
        if ( income < 500000){
            System.out.println("Your tax is - " + tax1);
        } else if ( income >= 500000 && income < 1000000){
            System.out.println("Your tax is - " + tax2);
        } else {
            System.out.println("Your tax is - " + tax3);
        }

    }
}
*/


import java.util.*;
public class Tax_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter income - ");
        int income = sc.nextInt();
        int tax;

        if ( income < 500000 ){
            tax = 0;
        } else if ( income >= 500000 && income < 1000000 ){
            
            tax = (int)(income * .20);
        } else {
            tax = (int) ( income * .30);
        }
        System.out.println("Your tax is " + tax);
    }
}