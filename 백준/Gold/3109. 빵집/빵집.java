import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, C;
	static char[][] map;
	static int[] dy = { -1, 0, 1 }; // 대각선 위, 오른쪽, 대각선 아래
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int k = 0; k < C; k++) {
				map[i][k] = str.charAt(k);
			}
		}
		
		for (int i = 0; i < R; i++) {
			dfs(i,0);
		}

		System.out.println(maxCount());
	}
	
	public static int maxCount() {
		int count = 0;
		
		for (int i = 0; i < R; i++) {
			if (map[i][C - 1] == 'x') {
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean dfs(int y, int x) {
		map[y][x] = 'x';
		
		if (x == C - 1) {
			return true;
		}
				
		for (int i = 0; i < 3; i++) {
			int nx = x + 1;
			int ny = y + dy[i];
			
			if (0 <= nx && nx < C &&  0 <= ny && ny < R && map[ny][nx] =='.') {
				if (dfs(ny, nx)) {
					return true;
				}
			}
		}
		return false;
	}

}
