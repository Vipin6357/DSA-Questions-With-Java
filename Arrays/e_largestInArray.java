import java.util.Scanner;

public class e_largestInArray {

    static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter " + size + " Elements: ");
            for( int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Largest element is: "+ largest(arr));
        }
    }
}
