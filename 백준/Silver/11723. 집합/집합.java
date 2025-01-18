import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i< n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();
            if (cmd.equals("all"))
            {
                set.clear();
                set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
            }
            else if (cmd.equals("empty"))
                set.clear();
            else if (cmd.equals("add"))
                set.add(Integer.parseInt(st.nextToken()));
            else if (cmd.equals("remove"))
                set.remove(Integer.parseInt(st.nextToken()));
            else if (cmd.equals("check"))
            {
                if (set.contains(Integer.parseInt(st.nextToken()))) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }
            else if (cmd.equals("toggle"))
            {
                int num = Integer.parseInt(st.nextToken());
                if (set.contains(num))
                    set.remove(num);
                else
                    set.add(num);
            }
        }
        bw.flush();
        bw.close();
    }
}