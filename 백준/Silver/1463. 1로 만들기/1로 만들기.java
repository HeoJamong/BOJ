import java.util.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int[] dp = new int[N+1];
        for (int i = 2; i <= N; i++)
        {
            dp[i] = dp[i-1] + 1;
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
        }
        System.out.println(dp[N]);
    }
}