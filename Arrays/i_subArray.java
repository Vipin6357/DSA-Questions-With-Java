import java.util.Scanner;

public class i_subArray {
    static void subArray(int arr[]){
        int start = 0;
        int end = arr.length;
        for(int i = start; i < end; i++){
            for(int j = i ; j < end; j++){
                for(int k = i; k <=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of array:  ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter "+ size + " Elements in array: ");
            for( int i = 0; i < size; i++){
                arr[i] = sc.nextInt(); 
            }
            subArray(arr);
        }
    }
    
}
