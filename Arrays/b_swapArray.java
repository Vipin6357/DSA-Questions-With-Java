public class b_swapArray {

    static void swap(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while( i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        


    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 4, 1};
        swap(arr);

        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
