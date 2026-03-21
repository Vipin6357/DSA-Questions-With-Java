import java.util.Scanner;

public class k_maxSubArraySumPrefixSum {

    static void maxSubArraySum(int arr[]){
        
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length;
        int prefix[] = new int[end];
        //prefix sum calculation
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = arr[i] + prefix [ i - 1];
        }

        // Max subarraysum
        for ( int i = start; i < end; i++){
            for( int j = i; j < end; j++){
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if( maxSum < currSum ){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max sum of subArray is: " + maxSum);

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
