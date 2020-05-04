public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        countWays(coins, amount);
    }

    private static void countWays(int[] coins, int amount) {
        int[] combos = new int[amount+1];
        combos[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i < combos.length; i++) {
                if (i >= coin) {
                    combos[i] += combos[i - coin];
                }
            }
        }
        System.out.println(combos[amount]);
    }
}