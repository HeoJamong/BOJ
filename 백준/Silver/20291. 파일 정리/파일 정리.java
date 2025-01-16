import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            int index = tmp.indexOf(".");
            String str = tmp.substring(index + 1);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        Set<String> kyes = map.keySet();
        List<String> result = new ArrayList<>(kyes);
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i) + " " + map.get(result.get(i)));
        }
    }
}