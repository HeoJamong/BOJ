import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int index = a % 10;
			int cycle;
			int point = 1;
			
			if (index == 0) {
				sb.append(10 + "\n");
				continue;
			}
			else if (index == 1 || index == 5 || index == 6)
				cycle = 1;
			else if (index ==4 || index == 9)
				cycle = 2;
			else
				cycle = 4;
			
			point = b % cycle;
			if (point == 0)
				point = cycle;
			sb.append(Math.round((Math.pow(index, point)) % 10) + "\n");
		}
		System.out.println(sb);
	}

}
