import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		ArrayList<Integer> dp = new ArrayList<Integer>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int num : arr) {
			int index = Collections.binarySearch(dp, num);

			if (index < 0) {
				index = -(index + 1);
			}

			// 기존의 값들보다 작은 값일 경우 교체
			if (index < dp.size()) {
				dp.set(index, num);
			} else {
				dp.add(num);
			}
		}
		System.out.println(dp.size());
	}
}
