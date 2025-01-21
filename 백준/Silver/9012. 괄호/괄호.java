import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		
		for (int i = 0; i < n; i++) {
			String cmd = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			for (char c : cmd.toCharArray()) {
				if (c == '(') {
					stack.push('(');
				}
				else if (c == ')') {
					if (stack.isEmpty()) {
						stack.push(')');
						break;
					}
					else
						stack.pop();
				}
			}
			if (stack.isEmpty()) {
				bw.write("YES\n");
			}
			else {
				bw.write("NO\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
