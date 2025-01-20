import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		
		Stack<Character> leftStack = new Stack<Character>();
		Stack<Character> rightStack = new Stack<Character>();
		
		for (char c : str.toCharArray())
			leftStack.push(c);
		
		for (int i = 0 ; i < m; i++) {
			String cmd = br.readLine();
			char c = cmd.charAt(0);
			
			if (c == 'L') {
				if (!leftStack.isEmpty())
					rightStack.push(leftStack.pop());
			}
			else if (c == 'D') {
				if (!rightStack.isEmpty())
					leftStack.push(rightStack.pop());
			}
			else if (c == 'B') {
				if (!leftStack.isEmpty())
					leftStack.pop();
			}
			else if (c == 'P') {
				leftStack.push(cmd.charAt(2));
			}
		}
		
		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}
		
		while (!rightStack.isEmpty()) {
			bw.write(rightStack.pop());
		}
		
		bw.flush();
		bw.close();
	}
	// string
}
