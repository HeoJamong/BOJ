import java.util.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final long MOD = 1_000_000_000L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N+1][10];

        for (int i = 0; i<10; i++)
            dp[1][i] = 1L;
        for (int i = 2; i<=N; i++)
        {
            dp[i][0] = dp[i-1][1];
            for (int k = 1; k<=9; k++)
            {
                if (k == 9)
                    dp[i][9] = dp[i-1][8] % MOD;
                else
                    dp[i][k] = (dp[i-1][k-1] % MOD + dp[i-1][k+1] % MOD) % MOD;
            }
        }
        long result = 0;

        for (int i = 1; i<=9; i++)
        {
            result = (result + dp[N][i]) % MOD;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}