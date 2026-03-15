import java.util.Scanner;

public class d_smallestInArray {

    static int smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
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
            System.out.println("smallest element is: "+ smallest(arr));
        }
    }
}

