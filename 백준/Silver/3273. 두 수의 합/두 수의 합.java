import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
		int target = Integer.parseInt(br.readLine());
		int answer = 0;
		int left = 0;
		int right = n - 1;
		
		while (left < right) {
			int sum = arr[left] + arr[right];
			
			if (sum == target) {
				answer++;
				left++;
				right--;
			} else if (sum < target) {
				left++;
			}
			else {
				right--;
			}
		}
		System.out.println(answer);
	}
}
