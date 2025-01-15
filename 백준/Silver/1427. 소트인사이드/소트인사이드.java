import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Integer[]arr2 = new Integer[input.length()];
		for (int i = 0; i < input.length(); i++) {
			arr2[i] = input.charAt(i) - '0';
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		for (int num : arr2)
			System.out.print(num);
	}
}
