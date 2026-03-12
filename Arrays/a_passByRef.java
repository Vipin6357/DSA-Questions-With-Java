
import java.util.Scanner;

public class a_passByRef{
    static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i]++;
        }
    }

    public static void main(String args[]){
        int marks[] = new int[5];
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 0; i < marks.length; i++){
                System.out.print("Enter the marks: ");
                marks[i] = sc.nextInt();
            }
            update(marks);
        }
        for(int i = 0; i < marks.length; i++){
            System.out.print("Updates marks are:  " + marks[i] + " ");
            System.out.println();
        }
        
    }
}