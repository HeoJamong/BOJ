import java.util.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int testcase = 0; testcase < tc; testcase++)
        {
            int N = Integer.parseInt(br.readLine());
            for (int i = 4; i <= N; i++)
            {
                dp[i] = dp[i -1] + dp[i -2] + dp[i-3];
            }
            bw.write(dp[N] + "\n");
        }
        bw.flush();
        bw.close();
    }
}