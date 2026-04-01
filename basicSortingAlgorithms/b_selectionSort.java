import java.util.Scanner;

    public class b_selectionSort {
        static void selectionSort(int arr[]){
            for ( int i = 0; i < arr.length - 1; i++){
                int minPostion = i;
                for( int j = i + 1; j < arr.length; j++){
                    if ( arr[minPostion] > arr [j]){
                        minPostion = j;
                    }
                }
            //swap
            int temp = arr[i];
            arr[i] = arr[minPostion];
            arr[minPostion] = temp;
            }
            System.out.println("Sorted array using selection sorting method: ");
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
                selectionSort(arr);
            }
        }
    }
