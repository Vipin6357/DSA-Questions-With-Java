import java.util.Scanner;

public class o_DuplicateInteger{

    static void duplicateInteger(int arr[]){
        boolean match = false;
        for( int i= 0; i < arr.length; i++){
            for ( int j = i + 1; j < arr.length; j++){
                if ( arr[j] == arr[i]){
                    match = true;
                }
            }
        }
        if( match == true ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter "+ size + " Elements in array: ");
            for( int i = 0; i < size; i++){
                arr[i] = sc.nextInt(); 
            }
            duplicateInteger(arr);
        }
        
        
    }
}