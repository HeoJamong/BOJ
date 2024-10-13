import java.util.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] arr;
    public static boolean[] visit;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(0, 1);
        bw.flush();
        bw.close();
    }

    public static void dfs(int depth, int at) throws IOException {
        if (depth == M)
        {
            for (int val: arr)
                bw.write(val + " ");
            bw.write("\n");
            return;
        }
        for (int i = at; i <= N; i++){
                arr[depth] = i;
                dfs(depth + 1, i + 1);
        }
    }
}