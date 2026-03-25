import java.util.Scanner;

public class m_trappingRainwater {

    static void trappingRainwater(int arr[]){
        // find max left border for every index
        int leftBorder[] = new int[arr.length];
        leftBorder[0] = arr[0];
        for( int i = 1; i < arr.length; i++){
            leftBorder[i] = Math.max(arr[i], leftBorder[i - 1]);
        }
        
        // find max right border for every index
        int rightBorder[] = new int[arr.length];
        rightBorder[arr.length - 1] = arr[arr.length - 1];
        for ( int i = arr.length - 2; i >= 0; i--){
            rightBorder[i] = Math.max(arr[i], rightBorder[i + 1]);
        }

        // Rainwater Loop
        int totalWaterTrap = 0;
        for( int i = 0; i < arr.length; i++){
            int minBorder = Math.min(leftBorder[i], rightBorder[i]);
            int waterTrap = ( minBorder - arr[i]) * 1;
            totalWaterTrap += waterTrap;
        }
        System.out.print("So, Total water Trap in the Array( take as Height ) is: " + totalWaterTrap);

        
    }
    public static void main(String[] args) {
        boolean descending = true;
        boolean ascending = true;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter the " + size + " Elememts: ");
            for( int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            if( arr.length < 3){
                System.out.println("Array size must be greater than 2");
                
            } else {
                for (int i = 0; i < arr.length - 1; i++){
                    if(arr[i] < arr[i + 1]){
                        descending = false;
                    }
                    if (arr[i] > arr[i + 1]) {
                        ascending = false;
                    }
                }
            }
            if(ascending){
                System.out.println("Array should not be in ascending order because no water trap in ascending order array");
                
            } 
            if(descending){
                System.out.println("Array should not be in descending order because no water trap in descending order array");
            }
            if(!ascending && !descending){
                trappingRainwater(arr);
            }
        }
    }
}
