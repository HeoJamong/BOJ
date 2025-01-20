import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> stack = new ArrayDeque<String>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String cmd = br.readLine();
			if (cmd.equals("0")) {
				stack.pollLast();
			}
			else {
				stack.add(cmd);
			}
		}
		int sum = 0;
		while (!stack.isEmpty()) {
			sum += Integer.parseInt(stack.poll());
		}
		System.out.println(sum);
	}

}
