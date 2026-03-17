import java.util.Scanner;

public class f_binarySearch {

    static int binarySearch(int arr[], int key){
        
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = ( start + end ) / 2;
            if( arr[mid] == key){
                return mid;
            } else if ( arr[mid] > key) {
                end = mid - 1;
                
            } else {
                start = mid + 1;
            }
        }
        return -1;



    }
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter "+ size + " Elements in array: ");
            for( int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the Key value which want to search in array: ");
            int key = sc.nextInt();

            int index = binarySearch(arr, key);

            if(index != -1){
                System.out.print("Your key value " + "'" + key + "'" + "is on index: "+ index);
            } else {
                System.out.print("Your key in not in array");
            }

        }
        
    }
}
