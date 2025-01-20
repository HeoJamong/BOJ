import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		long sum = 0;
		long r = 1;
		for (int i = 0; i < n; i++) {
			sum += (str.charAt(i) - 'a' + 1) * r;
			r = (r * 31) % 1234567891;
		}
		System.out.println(sum % 1234567891);
	}

}
