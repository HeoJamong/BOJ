import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] results = new int[6][3];
	static int[][] games = new int[15][2]; // 모든 팀의 매치 조합
	static boolean poosible;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int index = 0;
		for (int i =0; i < 6; i++) {
			for (int k = i + 1; k < 6; k++) {
				games[index][0] = i;
				games[index][1] = k;
				index++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			for (int k = 0; k < 6; k++) {
				for (int z = 0; z < 3; z++) {
					results[k][z] = Integer.parseInt(st.nextToken());
				}
			}
			
			if (!isCheck()) { // 입력 유효성 검사
				sb.append("0 ");
				continue;
			}
			poosible = false;
			dfs(0);
			sb.append(poosible ? "1 " : "0 ");
		}
		
		System.out.println(sb);
	}
	
	public static boolean isCheck() {
		int winCount = 0;
		int drawCount = 0;
		int lossCount = 0;
		
		for (int i =0; i < 6; i++) {
			if (results[i][0] + results[i][1] + results[i][2] != 5) {
				return false;
			}
			
			winCount += results[i][0];
			drawCount += results[i][1];
			lossCount += results[i][2];
		}
		
		if (winCount != lossCount) {
			return false;
		}
		if (drawCount % 2 != 0) {
			return false;
		}
		
		return true;
	}
	
	public static void dfs(int cnt) {
		if (poosible) {
			return ;
		}
		
		if (cnt == 15) {
			poosible = true;
			return ;
		}
		
		int teamA = games[cnt][0];
		int teamB = games[cnt][1];
		
		// 승 패
		if (results[teamA][0] > 0 && results[teamB][2] > 0) {
			results[teamA][0]--;
			results[teamB][2]--;
			dfs(cnt + 1);
			results[teamA][0]++;
			results[teamB][2]++;
		}
		// 무승부
		if (results[teamA][1] > 0 && results[teamB][1] > 0) {
			results[teamA][1]--;
			results[teamB][1]--;
			dfs(cnt + 1);
			results[teamA][1]++;
			results[teamB][1]++;
		}
		// 패 승
		if (results[teamA][2] > 0 && results[teamB][0] > 0) {
			results[teamA][2]--;
			results[teamB][0]--;
			dfs(cnt + 1);
			results[teamA][2]++;
			results[teamB][0]++;
		}
		
	}

}
