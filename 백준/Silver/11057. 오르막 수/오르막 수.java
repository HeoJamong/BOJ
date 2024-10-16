import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        // Initialize the first row
        for (int i = 0; i < 10; i++)
            dp[1][i] = 1L;

        // Fill the dp table
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        // Calculate the result
        long result = 0; // Initialize result
        for (int i = 0; i < 10; i++) {
            result += dp[N][i];
        }
        result %= 10007; // Apply the modulus to the final result

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
