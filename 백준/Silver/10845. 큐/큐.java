import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new LinkedList<Integer>();
		int num;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			if (cmd.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				queue.addLast(num);
			}
			else if (cmd.equals("pop")) {
				sb.append(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
			}
			else if (cmd.equals("size"))
				sb.append(queue.size() + "\n");
			else if (cmd.equals("empty"))
				sb.append(queue.isEmpty() ? "1\n" : "0\n");
			else if (cmd.equals("front"))
				sb.append(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
			else if (cmd.equals("back"))
				sb.append(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
		}
		System.out.println(sb);
	}

}
