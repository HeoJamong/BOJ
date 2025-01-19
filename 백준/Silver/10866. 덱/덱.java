import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Deque<Integer> deque = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int num;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			if (cmd.equals("push_front")) {
				num = Integer.parseInt(st.nextToken());
				deque.addFirst(num);	
			}
			else if (cmd.equals("push_back")) {
				num = Integer.parseInt(st.nextToken());
				deque.addLast(num);
			}
			else if (cmd.equals("pop_front")) {
				sb.append(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
			}
			else if (cmd.equals("pop_back"))
				sb.append(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
			else if (cmd.equals("size"))
				sb.append(deque.size() + "\n");
			else if (cmd.equals("empty"))
				sb.append(deque.isEmpty() ? "1\n" : "0\n");
			else if (cmd.equals("front"))
				sb.append(deque.isEmpty() ? "-1\n" : deque.peekFirst()+ "\n");
			else if (cmd.equals("back"))
				sb.append(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
		}
		System.out.println(sb);
	}

}
