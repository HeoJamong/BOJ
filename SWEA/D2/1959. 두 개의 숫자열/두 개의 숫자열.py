import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            long sum;
            if (n > m)
                sum = myfun(n, arr1, m, arr2);
            else
                sum = myfun(m, arr2, n, arr1);

            System.out.println("#" + t + " " + sum);
        }
    }

    private static long myfun(int biggerSize, int[] biggerArr, int smallerSize, int[] smallerArr) {
        long res = Long.MIN_VALUE;
        for (int i = 0; i <= biggerSize - smallerSize; i++) {
            long temp = 0;
            for (int j = 0; j < smallerSize; j++) {
                temp += biggerArr[i + j] * smallerArr[j];
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
