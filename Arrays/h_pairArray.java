import java.util.Scanner;

public class h_pairArray {
    static void pairArray(int arr[]){
        int start_index = 0;
        int end_index = arr.length - 1;
        while(start_index <= end_index){
            int current = arr[start_index];
            for ( int i = start_index + 1; i <= end_index; i++){
                System.out.print("( " + current + " , " + arr[i]+ " )");
            }
            System.out.println();
            start_index++;

        }
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
            pairArray(arr);
        }
    }
}
