-+-
/* In a program, input 3 numbers : A,B, and C. You have to output the average of these 3 numbers.
HINT:: Average of N numbers is sum of those numbers divided by N
*/



import java.util.*;
public class solution1{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int sum = a + b + c;
    float average = sum/3f; //or float average = (float)sum/3;
    System.out.println(average);
}
}