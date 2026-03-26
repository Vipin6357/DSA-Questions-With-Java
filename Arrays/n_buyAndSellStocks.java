import java.util.Scanner;

public class n_buyAndSellStocks {

    static void buyAndeSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for( int i = 0; i < prices.length; i++){
            if( buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);

    }
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int prices[] = new int[size];
            System.out.print("Enter "+ size + " Elements in array: ");
            for( int i = 0; i < size; i++){
                prices[i] = sc.nextInt(); 
            }
            buyAndeSellStocks(prices);
        }
    }
}
