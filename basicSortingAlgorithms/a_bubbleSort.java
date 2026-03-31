
import java.util.Scanner;

public class a_bubbleSort {
    static void bubbleSort(int arr[]){
        for( int i = 0; i < arr.length - 1; i++){
            for( int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr [ j + 1 ];
                    arr[ j + 1 ] = temp;

                }
            }
        }
        // to print sorted array
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
            bubbleSort(arr);
        }
    }
}
