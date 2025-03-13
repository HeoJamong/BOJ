import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static List<List<Integer>> list;
	static int[] inDegree;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		inDegree = new int[N + 1];
		list = new ArrayList<List<Integer>>();
		
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			list.get(num1).add(num2);
			inDegree[num2]++;
		}
		
		topologiSort();
		System.out.println(sb);
	}
	private static void topologiSort() {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			if (inDegree[i] == 0) {
				queue.offer(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			sb.append(node + " ");
			
			for (int i : list.get(node)) {
				inDegree[i]--;
				
				if (inDegree[i] == 0) {
					queue.offer(i);
				}
			}
		}
	}

}
