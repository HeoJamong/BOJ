import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		String[] roomNumber = br.readLine().split("");
		
		for (String num : roomNumber) {
			numbers[Integer.parseInt(num)]++;
		}
		int sixNine = numbers[6] + numbers[9];
		numbers[6] = (int) Math.ceil(sixNine / 2.0);
		
		int max = 0;
		for (int i = 0; i < 9; i++) {
			max = Math.max(max, numbers[i]);
		}
		System.out.println(max);
	}
}
