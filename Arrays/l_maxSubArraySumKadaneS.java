import java.util.Scanner;

public class l_maxSubArraySumKadaneS {
    static void maxSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxElement = arr[0];
        for( int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0 ){
                currSum = 0;
            } 
            if( maxSum < currSum ){  //or maxSum = Math.max(currSum, maxSum);
                maxSum = currSum;
            }
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
            if(maxSum == 0){
                maxSum = maxElement;
            }
        }
        System.out.print("Max sum of SubArray by Kadane's is: " + maxSum);
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
