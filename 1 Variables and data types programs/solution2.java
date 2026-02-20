/* In a program, input the side of a side of a square. You have to output the area of the square.
Hint: Area of the square is [ side * side ]
*/


import java.util.*;
public class solution2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;   // area of the square
        System.out.println("area of the square is : " + area); // or System.out.println(area);
    }
}