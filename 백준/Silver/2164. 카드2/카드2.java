import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i =1; i<=n; i++) {
			dq.add(i);
		}
		while (dq.size() != 1) {
			dq.poll();
			dq.addLast(dq.pollFirst());
		}
		System.out.println(dq.poll());
	}

}
