import java.util.Scanner;

public class g_reverseArray {

    static void reverse(int arr[]){
        int first_index = 0;
        int last_index = arr.length - 1;
        while( first_index <= last_index){
            int temp = arr[first_index];
            arr[first_index] = arr[last_index];
            arr[last_index] = temp;

            first_index++;
            last_index--;
        }
        System.out.print("Your reverse array: [ " );
        for( int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] +" ");
        }
        System.out.print(" ]" );
        
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
            reverse(arr);
            
        }
        
        
    }
}
