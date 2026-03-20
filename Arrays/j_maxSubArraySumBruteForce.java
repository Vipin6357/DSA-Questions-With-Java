import java.util.Scanner;

public class j_maxSubArraySumBruteForce {

    static void maxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        
        int start = 0;
        int end = arr.length;

        for( int i = start; i < end; i++){
            for(int j = start; j < end; j++){
                int currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            
        }
        
        System.out.println("Your max sum of sub Array is: " + maxSum);
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
            maxSubArraySum(arr);
        }
    }
}
