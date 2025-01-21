import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			Deque<Character> stack = new ArrayDeque<Character>();
			
			for (char c : str.toCharArray()) {
				if (c == 'A') {
					if (stack.peekLast() != null && stack.peekLast() == 'A') {
						stack.removeLast();
					}
					else {
						stack.add('A');
					}
				}
				else if (c == 'B' ) {
					if (stack.peekLast() != null && stack.peekLast() == 'B') {
						stack.removeLast();
					}
					else
						stack.add('B');
				}
			}
			if (stack.isEmpty())
				count++;
		}
		System.out.println(count);
	}

}
