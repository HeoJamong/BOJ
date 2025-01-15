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
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][2];
			
			for (int k = 0; k < n; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				arr[k][0] = Integer.parseInt((st.nextToken()));
				arr[k][1] = Integer.parseInt((st.nextToken()));
			}
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[]a1, int[]a2) {
					return a1[0] - a2[0];
				}
			});
			int result = 1;
			int benchmark = arr[0][1];
			
			for (int d = 1; d < n; d++) {
				if (benchmark > arr[d][1]) {
					benchmark = arr[d][1];
					result++;
				}
			}
			System.out.println(result);
		}
	}

}
