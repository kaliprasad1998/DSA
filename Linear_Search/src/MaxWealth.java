public class MaxWealth {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{3,7}, {3,5}};
        int out = maximumWealth(accounts);
        System.out.println(out);
    }

    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
