import java.util.Arrays;

public class Greedy {

    public static void giveChange(int amount, int[] coins) {

        Arrays.sort(coins);

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                System.out.print(coins[i] + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] availableCoins = {5, 2, 1};
        int amount = 18;

        giveChange(amount, availableCoins);

    }

}
