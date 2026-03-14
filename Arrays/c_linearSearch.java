import java.util.Scanner;

public class c_linearSearch {

    static int keySearching(int number[], int key){
        int index = -1;
        for(int i = 0; i < number.length; i++){
            if(number[i]== key){
                index = i;
                break;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int index;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int number[] = new int[size];
            System.out.print("Enter " + size + " array Elements: ");
            for(int i = 0; i < size; i++){
                number[i] = sc.nextInt();
            }
            System.out.print("Enter the key value which want to find in array: ");
            int key = sc.nextInt();
            

            index = keySearching(number, key);
        }
        if(index != -1){
            System.out.print("Key is found at "+ index + " index.");

        }else{
            System.out.print("Key is not found");
        }
    }
}
