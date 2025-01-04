import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[N][N];
			
			for (int i =0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			int[][] arr_90 = rotation(arr);
			int[][] arr_180 = rotation(arr_90);
			int[][] arr_270 = rotation(arr_180);
			
			
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++)
					System.out.print(arr_90[i][j]);
				System.out.print(" ");
				for (int j = 0; j < N; j++)
					System.out.print(arr_180[i][j]);
				System.out.print(" ");
				for (int j = 0; j < N; j++)
					System.out.print(arr_270[i][j]);
				System.out.println();
			}
		}
	}
	public static int[][] rotation(int[][] arr) {
		int[][]newArr = new int[N][N];
		
		for (int i = 0; i<N; i++) {
			for (int j = 0; j < N; j++) {
				newArr[i][j] = arr[N - 1 - j][i];
			}
		}
		return (newArr);
	}
}
