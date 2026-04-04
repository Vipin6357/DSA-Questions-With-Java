import java.util.Scanner;

public class d_countingSort {
    static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for( int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest + 1];
        //count number frequency
        for( int i = 0; i < count.length; i++){
            count[arr[i]]++;
        }
        // insertion according their frequency
        int j = 0;
        for( int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
        System.out.print("Sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter " + size + " Elements in array: ");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            countingSort(arr);
        }
    }
}
