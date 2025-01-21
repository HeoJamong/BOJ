import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		String str = br.readLine();
		while (!(str.equals("."))) {
			Deque<Character> stack = new ArrayDeque<Character>();
			for (char c : str.toCharArray()) {
				if (c == '(') {
					stack.add('(');
				}
				else if (c == ')') {
					if (stack.peekLast() == null || stack.peekLast() != '(') {
						stack.add(')');
						break;
					}
					else if (stack.peekLast() == '(') {
						stack.removeLast();
					}
				}
				else if (c == '[') {
					stack.add('[');
				}
				else if (c == ']') {
					if (stack.peekLast() == null || stack.peekLast() != '[') {
						stack.add(']');
						break;
					}
					else if (stack.peekLast() == '['){
						stack.removeLast();
					}
				}
			}
			if (stack.isEmpty()) {
				bw.write("yes\n");
			}
			else {
				bw.write("no\n");
			}
			str = br.readLine();
		}
		bw.flush();
		bw.close();
	}

}
