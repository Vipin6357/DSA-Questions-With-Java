import java.util.Scanner;

public class c_insertionSort{
    static void insertionSort(int arr[]){
        for( int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while( prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
        }

        System.out.print("Sorted array is: ");
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
                System.out.print("Enter the size of array: ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.print("Enter " + size + " Elements in array: ");
                for(int i = 0; i < arr.length; i++){
                    arr[i] = sc.nextInt();
                }
                insertionSort(arr);
            }
    }
}