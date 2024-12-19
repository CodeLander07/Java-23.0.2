class TilingProblem {
    public static void main(String[] args) {
        // Example input: 4, representing a 2x4 board
        System.out.println(tiling(4));
    }

    // Dynamic programming approach to solve the tiling problem
    public static int tiling(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}