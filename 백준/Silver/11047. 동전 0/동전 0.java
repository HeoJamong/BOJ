import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for (int i =0; i< n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int result = 0;
		
		for (int i = n - 1; i >= 0; i--) {
			if (k == 0) break;
			
			result += k / arr[i];
			k %= arr[i];
		}
		System.out.println(result);
	}
}