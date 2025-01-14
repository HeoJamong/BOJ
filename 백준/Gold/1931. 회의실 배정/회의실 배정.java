import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for (int i =0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] s1, int[] s2) {
				if (s1[1] == s2[1]) {
					return s1[0] - s2[0];
				}
				return s1[1] - s2[1];
			}
		});
		
		int count = 0;
		int end_time = 0;
		
		for (int i = 0; i < n; i++) {
			if (end_time <= arr[i][0]) {
				end_time = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
